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
public class CustomerDTO {
    @NotBlank
    @Size(min = 3, max = 50, message = "The customer name is between 3 to 50 characters")
    private String name;

    @NotNull
    @Min(value = 18,message = "The age must above 18.")
    @Max(value = 40,message = "The age must belove 40")
    private int age;

    @NotBlank
    @Size(min = 3,max = 80,message = "The address is between 3 to 80 characters")
    private String address;

    public CustomerDTO(){
        System.out.println("The CustomerDTO is created.");
    }
}
