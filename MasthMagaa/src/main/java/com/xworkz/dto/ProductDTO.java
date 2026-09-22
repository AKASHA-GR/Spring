package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {
    private String name;
    private String brand;
    private Double price;
    private String category;


    public ProductDTO(){
        System.out.println("The ProductDTO created.");
    }
}
