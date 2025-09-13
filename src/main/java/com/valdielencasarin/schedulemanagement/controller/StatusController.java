package com.valdielencasarin.schedulemanagement.controller;

import com.valdielencasarin.schedulemanagement.entities.Status;
import com.valdielencasarin.schedulemanagement.repo.statusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://val-cantarelli.github.io")
@RestController
@RequestMapping(value = "/status")
public class StatusController {
    @Autowired
    private statusRepository repository;

    @GetMapping
    public List<Status> getStatus(){
        return repository.findAll();
    }


}
