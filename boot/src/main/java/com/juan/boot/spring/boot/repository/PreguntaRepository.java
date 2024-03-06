package com.juan.boot.spring.boot.repository;

import com.juan.boot.spring.boot.entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta,Long> {

}
