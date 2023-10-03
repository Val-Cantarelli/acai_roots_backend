package com.valdielencasarin.schedulemanagement.controller;


import com.valdielencasarin.schedulemanagement.entities.Orders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @GetMapping
    public List<Orders> getOrders() {
        return List.of(

                Orders.builder().user_name("Tiburcia").size("450 ml")
                .typeofcup("Acaí")
                .extrafruits(new String[]{"banana", "morango"})
                .status("em produćão")
                .id("58")
                .build());

    }
}
