package com.example.controlgraphql.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Computer {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pc;
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
    private String macAdress;




}
