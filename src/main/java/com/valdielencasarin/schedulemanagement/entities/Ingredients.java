package com.valdielencasarin.schedulemanagement.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.List;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document
public class Ingredients {

    @Field
    List<Size> sizes;
    @Field
    List<CupType> typeofcups;
    @Field
    List<ExtraFruit> extrafruits;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static abstract class Option {
        @Field("id")
        BigDecimal objectId;
        String type;
        String price;
    }
    @AllArgsConstructor
    public static class Size extends Option {
        public Size(BigDecimal id, String type, String price) {
            super(id, type, price);
        }
    }
    @AllArgsConstructor
    public static class CupType extends Option{
        public CupType(BigDecimal id, String type,String price) {super(id,type,price);}
    }
    @AllArgsConstructor
    public static class ExtraFruit extends Option {
        public ExtraFruit(BigDecimal id, String type, String price) {
            super(id, type, price);
        }
    }
}
