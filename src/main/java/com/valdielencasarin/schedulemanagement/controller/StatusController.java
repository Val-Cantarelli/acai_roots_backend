package com.valdielencasarin.schedulemanagement.controller;

import com.valdielencasarin.schedulemanagement.entities.Status;
import com.valdielencasarin.schedulemanagement.repo.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/status")
public class StatusController {
    @Autowired
    private StatusRepository repository;

    @GetMapping
    public List<Status> getStatus(){
        return repository.findAll();
    }

}
