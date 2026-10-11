package com.xworkz.openerApp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Data
@Getter
@Setter
@ToString
public class VodkaDTO {
    private int id;
    private String companyName;
    private String companyAddress;
    private String manufacturerName;
    private LocalDate manufactureDate;
    private Double alcoholContent;
    private String vodkaType;
    private Double volume;
    private Double price;
    private Boolean isBottled;
    private LocalDate expiryDate;
}
