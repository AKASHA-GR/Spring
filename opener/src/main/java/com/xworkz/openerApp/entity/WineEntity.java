package com.xworkz.openerApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@ToString
@Table(name = "Wine_info")
public class WineEntity {
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
    private int age;
    private double price;
}
