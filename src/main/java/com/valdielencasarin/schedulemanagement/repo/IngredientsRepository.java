package com.valdielencasarin.schedulemanagement.repo;

import com.valdielencasarin.schedulemanagement.entities.Ingredients;
import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientsRepository extends MongoRepository<Ingredients,String> {

}
