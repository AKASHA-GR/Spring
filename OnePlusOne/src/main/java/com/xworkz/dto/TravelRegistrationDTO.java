package com.xworkz.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Data
public class TravelRegistrationDTO {
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Phone is required")
    @Size(min = 10, max = 15, message = "Phone must be between 10 and 15 characters")
    private String phone;

    @NotBlank(message = "Destination is required")
    @Size(min = 2, max = 50, message = "Destination must be between 2 and 50 characters")
    private String destination;

    @NotNull(message = "Travel Date is required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate travelDate;

    @NotNull(message = "Number of travelers is required")
    @Min(value = 1, message = "Number of travelers must be at least 1")
    @Max(value = 10, message = "Number of travelers must be at most 10")
    private int numberOfTravelers;

    @NotNull(message = "Travel Type is required")
    @Size(min = 2, max = 50, message = "Travel Type must be between 2 and 50 characters")
    private String travelType;

    @NotNull(message = "Payment Method is required")
    @Size(min = 2, max = 50, message = "Payment Method must be between 2 and 50 characters")
    private String paymentMethod;

    @NotNull(message = "Special Requirements is required")
    @Size(min = 2, max = 50, message = "Special Requirements must be between 2 and 50 characters")
    private String specialRequirements;
    
    public TravelRegistrationDTO() {
        System.out.println("TravelRegistrationDTO created");
    }

}
