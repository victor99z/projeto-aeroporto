package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoReposity extends JpaRepository<Tecnico, Integer> {

}
