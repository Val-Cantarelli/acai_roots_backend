package com.valdielencasarin.schedulemanagement.repo;

import com.valdielencasarin.schedulemanagement.entities.Ingredients;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ingredientsRepository extends MongoRepository<Ingredients,String> {

}
