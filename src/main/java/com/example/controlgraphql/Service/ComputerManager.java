package com.example.controlgraphql.Service;

import com.example.controlgraphql.dao.entities.Computer;
import com.example.controlgraphql.dto.ComputerDto;

import java.util.List;

public interface ComputerManager {

    List<ComputerDto> list();
    List<ComputerDto> getComputerByProce(String proce);
    ComputerDto saveComputer(ComputerDto computerDto);
}
