package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.ModeloAviao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ModeloAviaoRepository extends JpaRepository<ModeloAviao, Integer> {
    public void deleteByCodmodelo(String codmodelo);
}
