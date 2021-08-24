package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.TestesRealizados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestesRealizadosRepository extends JpaRepository<TestesRealizados, Integer> {

}
