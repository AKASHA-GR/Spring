package com.xworkz.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@Data
public class BiscuitsDTO {
    @NotBlank
    @Size(min = 2, max = 10,message = "Name should be between 2 and 10 characters.")
    private String name;

    @NotBlank
    @Size(min = 2, max = 10,message = "Brand should be between 2 and 10 characters.")
    private String brand;

    @NotNull
    @Max(value = 100,message = "Price should be between 2 and 100.")
    @Min(value = 2,message = "Price should be between 2 and 100.")
    private double price;

    @NotNull
    @Max(value = 100,message = "Price should be between 2 and 100.")
    @Min(value = 2,message = "Price should be between 2 and 100.")
    private double totleSuger;

    @NotBlank
    @Size(min = 3,max = 30,message = "Location should be between 3 and 30 characters.")
    private String location;

    public BiscuitsDTO(){
        System.out.println("The BiscuitsDTO is created.");
    }
}
