package com.juan.boot.spring.boot.services.impl;

import com.juan.boot.spring.boot.entity.Pregunta;
import com.juan.boot.spring.boot.repository.PreguntaRepository;
import com.juan.boot.spring.boot.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaServiceImpl implements PreguntaService {
    @Autowired
    private PreguntaRepository repository;

    @Override
    public Pregunta save(Pregunta pregunta) {
        return repository.save(pregunta);
    }

    @Override
    public Pregunta findById(Long id) {
        return ;
    }
}
