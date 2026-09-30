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
public class BiscuitsDTO {
    @NotNull
    @Size(min = 2, max = 10)
    private String name;

    @NotNull
    @Size(min = 2, max = 10)
    private String brand;

    @NotNull
    @Max(100)
    @Min(2)
    private double price;

    @NotNull
    @Max(100)
    @Min(2)
    private double totleSuger;

    @NotNull
    @Size(min = 3,max = 30)
    private String location;

    public BiscuitsDTO(){
        System.out.println("The BiscuitsDTO is created.");
    }
}
