package com.xworkz.openerApp.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Beer_info")
public class BeerEntity {
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

    @Column(name = "beer_type")
    private String beerType;

    @Column(name = "volume")
    private Double volume;

    private Double price;

    private Boolean isBottled;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;
}
