package com.valdielencasarin.schedulemanagement.controller;

import com.valdielencasarin.schedulemanagement.entities.Ingredients;
import com.valdielencasarin.schedulemanagement.repo.ingredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "https://val-cantarelli.github.io")
@RestController
@RequestMapping(value = "/ingredients")
public class IngredientsController {

    @Autowired
    private ingredientsRepository repository;
    @GetMapping
    public Ingredients getIngredients(){
        return repository.findAll().get(0);
    }
}
