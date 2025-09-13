package com.valdielencasarin.schedulemanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document
public class Customer {
    @Id
    private String objectId;;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}