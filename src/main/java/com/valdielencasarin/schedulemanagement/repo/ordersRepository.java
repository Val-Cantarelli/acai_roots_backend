package com.valdielencasarin.schedulemanagement.repo;

import com.valdielencasarin.schedulemanagement.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ordersRepository extends MongoRepository<Order, String> {

}
