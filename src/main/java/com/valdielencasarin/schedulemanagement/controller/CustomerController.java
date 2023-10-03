package com.valdielencasarin.schedulemanagement.controller;

import com.valdielencasarin.schedulemanagement.repo.CustomerRepository;
import com.valdielencasarin.schedulemanagement.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Trata as requisicoes(verb http) no target correpondente;
// Utiliza o repository para abstrair a autoconfig da conexao com o db
//
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    //Autowired pra indicar qual dependendcia será usada
    @Autowired
    private CustomerRepository repository;

    @GetMapping
    public List<Customer> getCustomers() {
        return repository.findAll();
    }


    @PostMapping

    public Customer createPost(@RequestBody Customer customer) {
        repository.save(customer);
        return  customer;
    }
}