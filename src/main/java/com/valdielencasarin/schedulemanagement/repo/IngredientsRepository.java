package com.valdielencasarin.schedulemanagement.repo;

import com.valdielencasarin.schedulemanagement.entities.Ingredients;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IngredientsRepository extends MongoRepository<Ingredients,String> {

}
