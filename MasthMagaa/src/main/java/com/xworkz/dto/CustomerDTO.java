package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerDTO {
    private String name;
    private int age;
    private String address;

    public CustomerDTO(){
        System.out.println("The CustomerDTO is created.");
    }
}
