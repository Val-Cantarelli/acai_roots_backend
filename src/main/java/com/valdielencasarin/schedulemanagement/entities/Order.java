package com.valdielencasarin.schedulemanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document
public class Order {
    @Id
    private String objectId;
    private String name;
    private String size;
    private String typeofcup;
    private String [] extrafruits;
    private String status;
    private String totalPrice;
}
