package com.valdielencasarin.schedulemanagement;


import com.valdielencasarin.schedulemanagement.entities.Customer;
import com.valdielencasarin.schedulemanagement.repo.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.valdielencasarin.acai_roots_backend")
public class Application implements CommandLineRunner {
    @Autowired
    private customerRepository repository;

    public static void main(String[] args) {
        SpringApplication
                .run(Application.class, args);
    }

    @Override
    public void run(String...args) throws Exception {

        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }







    }






}


