package com.xworkz.openerApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Vodka_info")
@NamedQueries(
        @NamedQuery(name = "VodkaEntity.findAll", query = "SELECT v FROM VodkaEntity v")
)

@Data
@Getter
@Setter
@ToString
public class VodkaEntity {
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

    @Column(name = "vodka_type")
    private String vodkaType;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "price")
    private Double price;

    @Column(name = "is_bottled")
    private Boolean isBottled;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;
}
