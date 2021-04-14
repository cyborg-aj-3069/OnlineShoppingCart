package com.casestudy.orderservice.controller;


import com.casestudy.orderservice.model.Order;
import com.casestudy.orderservice.payment_ins.Payment_Req;
import com.casestudy.orderservice.payment_ins.Payment_Resp;
import com.casestudy.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public Payment_Resp addOrder(@RequestBody Payment_Req payment_req) {
        return orderService.addOrders(payment_req);
    }

    @PutMapping("/")
    public Payment_Resp updateOrder(@RequestBody Payment_Req payment_req) {
        return orderService.updateOrders(payment_req);
    }

    @GetMapping("/")
    public List<Order> getAllOrders() {
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrder(@PathVariable int id) {
        return orderService.getOrders(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable int id) {
        orderService.deleteOrder(id);

    }
}