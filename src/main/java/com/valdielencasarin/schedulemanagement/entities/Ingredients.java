package com.valdielencasarin.schedulemanagement.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Ingredients {

    List<Size> sizes;

    @JsonProperty("typeofcups")
    List<CupType> typeOfCups;

    @JsonProperty("extrafruits")
    List<ExtraFruit> extraFruitsList;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static abstract class Option {
        String id;
        String type;

    }
    @AllArgsConstructor
    public static class Size extends Option {
        public Size(String id, String type) {
            super(id, type);
        }
    }
    @AllArgsConstructor
    public static class CupType extends Option {
        public CupType(String id, String type) {
            super(id, type);
        }
    }
    @AllArgsConstructor
    public static class ExtraFruit extends Option {
        public ExtraFruit(String id, String type) {
            super(id, type);
        }
    }
}
