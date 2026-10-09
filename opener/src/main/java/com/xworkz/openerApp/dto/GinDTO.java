package com.xworkz.openerApp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Data
@Setter
@ToString
public class GinDTO implements Serializable {

    @NotBlank(message = "Company name cannot be blank")
    @Size(min = 3, max = 100, message = "Company name must be between 3 and 100 characters")
    private String companyName;

    @NotBlank(message = "Company address cannot be blank")
    @Size(min = 3, max = 100, message = "Company address must be between 3 and 100 characters")
    private String companyAddress;

    @NotBlank(message = "Manufacturer name cannot be blank")
    @Size(min = 3, max = 100, message = "Manufacturer name must be between 3 and 100 characters")
    private String manufacturerName;

    @NotNull(message = "Manufacture date cannot be null")
    @PastOrPresent(message = "Manufacture date must be in the past or present")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manufactureDate;

    @NotNull(message = "Alcohol content cannot be null")
    @Min(value = 0, message = "Alcohol content must be at least 0")
    @Max(value = 100, message = "Alcohol content must be at most 100")
    private Double alcoholContent;

    @NotBlank(message = "Gin type cannot be blank")
    @Size(min = 3, max = 50, message = "Gin type must be between 3 and 50 characters")
    private String ginType;

    @NotBlank(message = "Botanicals cannot be blank")
    @Size(min = 3, max = 200, message = "Botanicals must be between 3 and 200 characters")
    private String botanicals;

    @NotNull(message = "Volume cannot be null")
    @Min(value = 0, message = "Volume must be at least 0")
    @Max(value = 10000, message = "Volume must be at most 10000")
    private Double volume;

    @NotNull(message = "Price cannot be null")
    @Min(value = 0, message = "Price must be at least 0")
    @Max(value = 1000000, message = "Price must be at most 1000000")
    private Double price;

    @NotNull(message = "Is aged cannot be null")
    private Boolean isAged;

    @Min(value = 0, message = "Age years must be at least 0")
    @Max(value = 100, message = "Age years must be at most 100")
    private Integer ageYears;

    @NotNull(message = "Expiry date cannot be null")
    @FutureOrPresent(message = "Expiry date must be in the future or present")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expiryDate;
}
