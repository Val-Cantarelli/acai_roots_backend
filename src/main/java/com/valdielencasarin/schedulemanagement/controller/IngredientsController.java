package com.valdielencasarin.schedulemanagement.controller;

import com.valdielencasarin.schedulemanagement.entities.Ingredients;
import com.valdielencasarin.schedulemanagement.repo.IngredientsRepository;
import com.valdielencasarin.schedulemanagement.repo.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/ingredients")
public class IngredientsController {

    @Autowired
    private IngredientsRepository repository;
    @GetMapping
    public Ingredients getIngredients(){
        return repository.findAll().get(0);

    }
}
