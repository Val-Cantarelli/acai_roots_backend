package com.valdielencasarin.schedulemanagement;

import com.valdielencasarin.schedulemanagement.entities.Customer;
import com.valdielencasarin.schedulemanagement.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication
                .run(Application.class, args);

        System.out.println("Tá funcionaaaaando!");
    }
    @Override
    public void run(String...args) throws Exception {
        //repository.deleteAll();

        //Salva clientes
        repository.save(new Customer("25","Alice", "Smith","AS@email.com", "000"));
        repository.save(new Customer("48","Bob", "Smith", "bob@email.com", "14789"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Customer customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }





    }






}


