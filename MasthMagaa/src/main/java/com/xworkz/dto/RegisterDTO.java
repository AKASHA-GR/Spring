package com.xworkz.dto;


import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@Data
public class RegisterDTO {
    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 20, message = "First name must be between 2 and 20 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 20, message = "Last name must be between 2 and 20 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotNull(message = "Mobile number is required")
    @Min(value = 1000000000L, message = "Mobile number must be between 1000000000 and 9999999999")
    @Max(value = 9999999999L, message = "Mobile number must be between 1000000000 and 9999999999")
    private long mobile;

    public RegisterDTO() {
        System.out.println("The RegisterDTO is created.");
    }
}
