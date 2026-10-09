package com.xworkz.openerApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "whiskey_info")
@Data
@Getter
@Setter
@ToString
public class WhiskeyEntity {
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

    @Column(name = "whiskey_type")
    private String whiskeyType;

    @Column(name = "region")
    private String region;

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
