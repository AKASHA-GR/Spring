package com.xworkz.dto;


import lombok.*;

@Getter
@Setter
@ToString
public class RegisterDTO {
    private String firstName;
    private String lastName;
    private String email;
    private long mobile;

    public RegisterDTO() {
        System.out.println("The RegisterDTO is created.");
    }
}
