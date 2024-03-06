package com.juan.boot.spring.boot.services.impl;

import com.juan.boot.spring.boot.dto.RespuestaDto;
import com.juan.boot.spring.boot.entity.Respuesta;
import com.juan.boot.spring.boot.repository.RespuestaRepository;
import com.juan.boot.spring.boot.services.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RespuestaServiceImpl implements RespuestaService {

    @Autowired
    private RespuestaRepository repository;
    @Override
    public Respuesta save(Respuesta respuesta) {
        return repository.save(respuesta);
    }

    @Override
    public RespuestaDto findById(Long id) {
        Respuesta respuesta = repository.findById(id).orElse(null);
        return resp(respuesta);
    }

    @Override
    public List<RespuestaDto> findAll() {
        List<Respuesta> allRespuestas = repository.findAll();
        List<RespuestaDto> dtoRespuestas = new ArrayList<>();

        allRespuestas.stream().map(p -> dtoRespuestas.add(resp(p)));
        return dtoRespuestas;
    }


    public RespuestaDto resp(Respuesta respuesta){
        RespuestaDto dto = new RespuestaDto();
        if(respuesta!= null){
            dto.setRespuesta(respuesta.getRespuesta());

            List<String> listPreguntas = respuesta.getPreguntas().stream().map(p -> p.getPregunta())
                    .collect(Collectors.toList());
            dto.setPreguntas(listPreguntas);
        }
        return dto;
    }


}
