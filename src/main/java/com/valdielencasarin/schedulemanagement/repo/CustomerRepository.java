package com.valdielencasarin.schedulemanagement.repo;

import java.util.List;

import com.valdielencasarin.schedulemanagement.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
// Foi preciso criar essa interface que extende MongoRepositry porque o
// spring, com o fim de autoconfig,  cria uma classe que gera um objeto que implemta a minha interface criada
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);

}
