package com.casestudy.orderservice.service;


import com.casestudy.orderservice.model.Order;
import com.casestudy.orderservice.payment_ins.Payment;
import com.casestudy.orderservice.payment_ins.Payment_Req;
import com.casestudy.orderservice.payment_ins.Payment_Resp;
import com.casestudy.orderservice.payment_ins.User;
import com.casestudy.orderservice.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

        @Autowired
        private OrderRepo orderRepo;
        @Autowired
        private RestTemplate restTemplate;

        public List<Order> getAll() {
            return orderRepo.findAll();
        }

        public Payment_Resp addOrders(Payment_Req payment_req) {
            String response="";
            Order order= payment_req.getOrder();
            Payment payment = payment_req.getPayment();
            payment.setOrderId(order.getId());
            payment.setAmount(order.getPrice());
            User user = payment_req.getUser();
            Payment paymentResponse= restTemplate.postForObject("http://PAYMENT/payment/",payment,Payment.class);
            User userResponse =restTemplate.postForObject("http://REGISTRATION/user/",user,User.class);
            if (paymentResponse != null) {
                response= paymentResponse.getPayment_status().equals("success")?"Payment SuccessFul":"Payment Failed";
            }
            orderRepo.insert(order);
            return  new Payment_Resp(order,userResponse.getId(),paymentResponse.getAmount(),paymentResponse.getTransaction_id(),response);
        }

        public Payment_Resp updateOrders(Payment_Req payment_req) {
            String response="";
            Order order= payment_req.getOrder();
            Payment payment = payment_req.getPayment();
            payment.setOrderId(order.getId());
            payment.setAmount(order.getPrice());
            User user = payment_req.getUser();
            payment.setUserId(user.getId());
            Payment paymentResponse= restTemplate.postForObject("http://PAYMENT/payment/",payment,Payment.class);
            User userResponse =restTemplate.postForObject("http://REGISTRATION/user/",user,User.class);
            response= paymentResponse.getPayment_status().equals("success")?"Payment Successful":"Payment Failed , Item added to OrderDB";
            orderRepo.save(order);
            return  new Payment_Resp(order,userResponse.getId(),paymentResponse.getAmount(),paymentResponse.getTransaction_id(),response);
        }

        public void deleteOrder(int id) {
            orderRepo.deleteById(id);
        }

        public Optional<Order> getOrders(@PathVariable int id) { return orderRepo.findById(id); }


    }
