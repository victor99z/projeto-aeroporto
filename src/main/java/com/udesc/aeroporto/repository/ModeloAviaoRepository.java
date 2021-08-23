package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.ModeloAviao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloAviaoRepository extends JpaRepository<ModeloAviao, Integer> {
}
