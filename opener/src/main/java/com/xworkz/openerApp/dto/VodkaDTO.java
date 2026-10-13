package com.xworkz.openerApp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@Getter
@Setter
@ToString
public class VodkaDTO {
    private int id;

    @NotBlank
    @Size(min = 3, max = 100,message = "Company name must be between 3 and 100 characters")
    private String companyName;

    @NotBlank
    @Size(min = 3, max = 100,message = "Company address must be between 3 and 100 characters")
    private String companyAddress;

    @NotBlank
    @Size(min = 3, max = 100,message = "Manufacturer name must be between 3 and 100 characters")
    private String manufacturerName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manufactureDate;

    @NotNull
    @Min(value = 0, message = "Alcohol content must be a non-negative number")
    @Max(value = 100, message = "Alcohol content must be less than or equal to 100")
    private Double alcoholContent;

    @NotBlank
    @Size(min = 3, max = 100,message = "Vodka type must be between 3 and 100 characters")
    private String vodkaType;

    @NotNull
    @Min(value = 0, message = "Volume must be a non-negative number")
    @Max(value = 100, message = "Volume must be less than or equal to 100")
    private Double volume;

    @NotNull
    @Min(value = 0, message = "Price must be a non-negative number")
    @Max(value = 100000, message = "Price must be less than or equal to 100000")
    private Double price;

    @NotNull
    private Boolean isBottled;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expiryDate;
}
