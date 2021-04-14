package com.casestudy.orderservice.payment_ins;

import com.casestudy.orderservice.model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment_Req {

    private Order order;
    private Payment payment;
    private User user;
}
