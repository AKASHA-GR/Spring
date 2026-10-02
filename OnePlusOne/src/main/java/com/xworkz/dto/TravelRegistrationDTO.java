package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class TravelRegistrationDTO {
    
    private String name;
    private String email;
    private String phone;
    private String destination;
    private LocalDate travelDate;
    private int numberOfTravelers;
    private String travelType;
    private String paymentMethod;
    private String specialRequirements;
    
    public TravelRegistrationDTO() {
        System.out.println("TravelRegistrationDTO created");
    }

}
