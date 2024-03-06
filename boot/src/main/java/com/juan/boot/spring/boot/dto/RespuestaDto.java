package com.juan.boot.spring.boot.dto;

import com.juan.boot.spring.boot.entity.Pregunta;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RespuestaDto {

    private String respuesta;
    private List<String> preguntas = new ArrayList<>();

    public List<String> addPregunta(String pregunta){

        this.preguntas.add(pregunta);
        return this.preguntas;
    }
}
