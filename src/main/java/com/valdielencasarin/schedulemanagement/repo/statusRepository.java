package com.valdielencasarin.schedulemanagement.repo;

import com.valdielencasarin.schedulemanagement.entities.Status;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface statusRepository extends MongoRepository<Status,String> {
}
