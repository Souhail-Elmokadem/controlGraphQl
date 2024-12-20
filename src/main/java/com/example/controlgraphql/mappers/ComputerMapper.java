package com.example.controlgraphql.mappers;


import com.example.controlgraphql.dao.entities.Computer;
import com.example.controlgraphql.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper modelMapper = new ModelMapper();



    public ComputerDto ComputerToDTO(Computer computer) {
        return modelMapper.map(computer, ComputerDto.class);
    }

    public Computer ComputerDTOTocomputer(ComputerDto computerDto) {
        return modelMapper.map(computerDto, Computer.class);
    }
}
