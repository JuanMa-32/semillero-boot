package com.juan.boot.spring.boot.services;

import com.juan.boot.spring.boot.dto.RespuestaDto;
import com.juan.boot.spring.boot.entity.Respuesta;

import java.util.List;
import java.util.Optional;

public interface RespuestaService {
    Respuesta save(Respuesta respuesta);
    RespuestaDto findById(Long id);
    List<RespuestaDto> findAll();


}
