package com.xworkz.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;

@Data
@ToString
@Getter
@Setter
public class BoxDTO {
    @NotBlank
    @Size(min = 2, max = 10,message = "Shape should be between 2 and 10 characters.")
    private String shape;

    @NotBlank
    @Size(min = 2, max = 10,message = "Type should be between 2 and 10 characters.")
    private String type;

    @NotNull
    @Min(value = 2,message = "Price should be between 2 and 100.")
    @Max(value = 100,message = "Price should be between 2 and 100.")
    private double price;

    @NotNull
    @Min(value = 2,message = "Height should be between 2 and 100.")
    @Max(value = 100,message = "Height should be between 2 and 100.")
    private double hight;

    @NotNull
    @Min(value = 2,message = "Weight should be between 2 and 100.")
    @Max(value = 100,message = "Weight should be between 2 and 100.")
    private double weight;

    public BoxDTO(){
        System.out.println("The BoxDTO is created.");
    }
}
