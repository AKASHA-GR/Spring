package com.xworkz.openerApp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Getter
@Setter
public class BeerDTO implements Serializable {

        @NotBlank
        @Size(min = 3, max = 50, message = "Company name must be between 3 and 50 characters")
        private String companyName;

        @NotBlank
        @Size(min = 3, max = 50, message = "Company address must be between 3 and 50 characters")
        private String companyAddress;

        @NotBlank
        @Size(min = 3, max = 50, message = "Manufacturer name must be between 3 and 50 characters")
        private String manufacturerName;

        @NotNull
        @PastOrPresent(message = "Manufacture date must be in the past or present")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate manufactureDate;

        @NotNull
        @Min(value = 0, message = "Alcohol content must be a non-negative number")
        @Max(value = 100, message = "Alcohol content must be less than or equal to 100")
        private Double alcoholContent;

        @NotBlank
        @Size(min = 3, max = 10, message = "Beer type must be between 3 and 10 characters")
        private String beerType;

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
        @FutureOrPresent(message = "Expiry date must be in the future or present")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate expiryDate;

}
