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
public class MovieDTO {
    @NotBlank
    @Size(min = 3,max = 10,message = "The name should be between 3 to 10 characters.")
    private String name;

    @NotNull
    @Min(value = 100,message = "The price should be 100 minimum")
    @Max(value = 500,message = "The price should be 500 maximum")
    private Double price;

    @NotNull
    @Min(value = 2,message = "The Duration should be 1 hour minimum")
    @Max(value = 4,message = "The Duration should be 4 hour maximum")
    private Double duration;

    @NotNull
    private Double budget;
}
