package com.udesc.aeroporto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class TesteRealizado {
    @Id
    private String id;
    private Double pontuacao_obtida;
    
}
