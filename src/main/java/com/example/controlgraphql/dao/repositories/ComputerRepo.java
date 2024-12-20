package com.example.controlgraphql.dao.repositories;

import com.example.controlgraphql.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepo extends JpaRepository<Computer,Long> {
    List<Computer> findByProce(String proce);
}
