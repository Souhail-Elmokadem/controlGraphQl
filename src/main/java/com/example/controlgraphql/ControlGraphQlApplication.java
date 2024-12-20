package com.example.controlgraphql;

import com.example.controlgraphql.Service.ComputerManager;
import com.example.controlgraphql.dao.entities.Computer;
import com.example.controlgraphql.dto.ComputerDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ControlGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlGraphQlApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ComputerManager computerManager) {
        return args -> {
            Stream.of("pc1","pc1","pc3","pc4").forEach(p->{
                ComputerDto dto = new ComputerDto();
                dto.setProce(p);
                dto.setRam(p+"44444");
                dto.setPrice(2220.0);
                computerManager.saveComputer(dto);
            });
        };
    }
}
