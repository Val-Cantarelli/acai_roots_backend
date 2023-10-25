package com.valdielencasarin.schedulemanagement.repo;

import java.util.List;

import com.valdielencasarin.schedulemanagement.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
/* This interface extends MongoRepositry because Spring, for autoconfig purposes,
creates a class that generates an object that implements my interface*/
public interface customerRepository extends MongoRepository<Customer, String> {
    Customer findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);

}
