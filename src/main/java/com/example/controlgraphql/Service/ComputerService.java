package com.example.controlgraphql.Service;

import com.example.controlgraphql.dao.repositories.ComputerRepo;
import com.example.controlgraphql.dto.ComputerDto;
import com.example.controlgraphql.mappers.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService implements ComputerManager{


    @Autowired
    private ComputerRepo computerRepo;

    @Autowired
    private ComputerMapper computerMapper;
    @Override
    public List<ComputerDto> list() {
        return computerRepo.findAll().stream().map(computerMapper::ComputerToDTO).toList();
    }

    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        return computerRepo.findByProce(proce).stream().map(computerMapper::ComputerToDTO).toList();
    }

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        return computerMapper.ComputerToDTO(computerRepo.save(computerMapper.ComputerDTOTocomputer(computerDto)));
    }
}
