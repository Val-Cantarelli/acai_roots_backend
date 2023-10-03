package com.valdielencasarin.schedulemanagement.controller;

import com.valdielencasarin.schedulemanagement.entities.Ingredients;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/ingredients")
public class IngredientsController {
    @GetMapping
    public Ingredients getIngredients(){

//       List<Ingredients.Size> listSizes = repository.getSizes();

        return Ingredients.builder()
                .sizes(List.of(new Ingredients.Size("1", "350ml")))
                .extraFruitsList(List.of(new Ingredients.ExtraFruit("1", "banana")))
                .typeOfCups(List.of(new Ingredients.CupType("1", "Acaí")))
                .build();
    }
}
