package com.juan.boot.spring.boot.services;

import com.juan.boot.spring.boot.entity.Pregunta;

public interface PreguntaService {
    Pregunta save(Pregunta pregunta);
    Pregunta findById(Long id);



}
