package com.example.controlgraphql.web;

import com.example.controlgraphql.Service.ComputerManager;
import com.example.controlgraphql.dto.ComputerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQlController {


    @Autowired
    private ComputerManager computerManager;


    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce) {
        return computerManager.getComputerByProce(proce);
    }
    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computerDto) {
        return computerManager.saveComputer(computerDto);
    }

}
