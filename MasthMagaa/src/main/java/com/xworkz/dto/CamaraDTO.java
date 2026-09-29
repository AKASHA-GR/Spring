package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CamaraDTO {

    private String brand;
    private String model;
    private String sensorType;
    private double price;

    public CamaraDTO(){
        System.out.println("The CamaraDTO is created.");
    }
}
