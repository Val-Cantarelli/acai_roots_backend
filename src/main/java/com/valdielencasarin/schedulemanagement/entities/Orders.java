package com.valdielencasarin.schedulemanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Array;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Orders {

    private String user_name;
    private String size;
    private String typeofcup;
    private String [] extrafruits;
    private String status;
    private String id;
}
