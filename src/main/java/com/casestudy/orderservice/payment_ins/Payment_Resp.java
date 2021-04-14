package com.casestudy.orderservice.payment_ins;

import com.casestudy.orderservice.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment_Resp {

    private Order order;
    private int id;
    private double amount;
    private String Transaction_Id;
    private String message;


}
