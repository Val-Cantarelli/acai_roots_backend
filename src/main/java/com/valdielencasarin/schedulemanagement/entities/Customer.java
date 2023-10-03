package com.valdielencasarin.schedulemanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.swing.text.AbstractDocument;

//Acomoda os item do body da requisićão http
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document
public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


}