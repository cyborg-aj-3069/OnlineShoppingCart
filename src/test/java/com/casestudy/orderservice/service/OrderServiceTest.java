package com.casestudy.orderservice.service;

import com.casestudy.orderservice.model.Order;
import com.casestudy.orderservice.repository.OrderRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class OrderServiceTest {

    @Autowired
    private OrderService orderService;
    @MockBean
    private OrderRepo orderRepo;


    @Test
    void getAll() {
        when(orderRepo.findAll()).thenReturn(Stream.of(
                new Order (5,"Samsung Edge",2,10000),
                new Order (5,"Samsung Edge",2,10000))
               .collect(Collectors.toList()));

    }

    @Test
    void addOrders() {
    }

    @Test
    void updateOrders() {
    }

    @Test
    void deleteOrder() {
    }

    @Test
    void getOrders() {
    }
}