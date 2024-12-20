package com.example.controlgraphql.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComputerDto {

    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
}
