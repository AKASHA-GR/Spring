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
public class PlaceDTO {
    @NotBlank(message = "The name is required.")
    @Size(min = 3, max = 10, message = "The name should be between 3 and 10 characters.")
    private String name;

    @NotNull(message = "The house number is required.")
    @Min(value = 1, message = "The house number should be between 1 and 100.")
    @Max(value = 100, message = "The house number should be between 1 and 100.")
    private int house;

    @NotNull(message = "The village number is required.")
    @Min(value = 1, message = "The village number should be between 1 and 100.")
    @Max(value = 100, message = "The village number should be between 1 and 100.")
    private int village;

    @NotBlank(message = "The temple is required.")
    @Size(min = 3, max = 10, message = "The temple should be between 3 and 10 characters.")
    private String temple;

    @NotBlank(message = "The food is required.")
    @Size(min = 3, max = 10, message = "The food should be between 3 and 10 characters.")
    private String food;

    public PlaceDTO(){
        System.out.println("The placeDTO is created.");
    }
}
