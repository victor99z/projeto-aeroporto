package com.udesc.aeroporto.repository;

import com.udesc.aeroporto.model.Aviao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AviaoRepository extends JpaRepository<Aviao, Integer>{

}
