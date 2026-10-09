package com.xworkz.openerApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "gin_info")
@Data
@Getter
@Setter
@ToString
public class GinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_address")
    private String companyAddress;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "manufacture_date")
    private LocalDate manufactureDate;

    @Column(name = "alcohol_content")
    private Double alcoholContent;

    @Column(name = "gin_type")
    private String ginType;

    @Column(name = "botanicals")
    private String botanicals;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "price")
    private Double price;

    @Column(name = "is_aged")
    private Boolean isAged;

    @Column(name = "age_years")
    private Integer ageYears;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;
}