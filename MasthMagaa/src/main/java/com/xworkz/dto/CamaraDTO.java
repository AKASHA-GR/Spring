package com.xworkz.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@Data
public class CamaraDTO {
    @NotNull
    @Size(min = 2, max = 10,message = "Brand should be between 2 and 10 characters.")
    private String brand;

    @NotNull
    @Size(min = 2, max = 10,message = "Model should be between 2 and 10 characters.")
    private String model;

    @NotNull
    @Size(min = 2, max = 10,message = "SensorType should be between 2 and 10 characters.")
    private String sensorType;

    @NotNull
    @Min(value = 2,message = "Price should be between 2 and 100.")
    @Max(value = 100,message = "Price should be between 2 and 100.")
    private double price;

    public CamaraDTO(){
        System.out.println("The CamaraDTO is created.");
    }
}
