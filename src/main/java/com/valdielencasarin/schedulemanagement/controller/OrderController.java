package com.valdielencasarin.schedulemanagement.controller;

import com.valdielencasarin.schedulemanagement.entities.Order;
import com.valdielencasarin.schedulemanagement.repo.ordersRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://val-cantarelli.github.io")
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private ordersRepository repository;

    @GetMapping
    public List<Order> getOrders() {
        return repository.findAll();
    }

    @GetMapping("/{objectId}")
    public ResponseEntity<Order> getOrderById(@PathVariable(value = "objectId") String objectId)
            throws ResourceNotFoundException {
        Order order = repository.findById(objectId)
                .orElseThrow(() -> new ResourceNotFoundException("Pedido " + objectId + " não encontrado!"));
        return ResponseEntity.ok().body(order);
    }

    @PostMapping
    public Order createPost(@RequestBody Order order) {
        repository.save(order);
        return order;
    }

    @PatchMapping("/{objectId}")
    public ResponseEntity<Order> updatedOrder(@RequestBody Order updatedOrder,
                                              @PathVariable String objectId) {
        try {

            Order order = repository.findById(objectId).get();
            order.setStatus(updatedOrder.getStatus());
            return new ResponseEntity<>(repository.save(order), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{objectId}")
    public ResponseEntity<Order> delete(@PathVariable String objectId) {
        try {
            Order order = repository.findById(objectId).get();
            repository.deleteById(objectId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}




