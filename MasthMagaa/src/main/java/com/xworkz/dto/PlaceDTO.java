package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlaceDTO {
    private String name;
    private int house;
    private int village;
    private String temple;
    private String food;

    public PlaceDTO(){
        System.out.println("The placeDTO is created.");
    }
}
