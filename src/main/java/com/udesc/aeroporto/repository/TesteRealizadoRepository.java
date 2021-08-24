package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.TesteRealizado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRealizadoRepository extends JpaRepository<TesteRealizado, Integer> {

}
