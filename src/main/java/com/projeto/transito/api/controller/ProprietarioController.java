package com.projeto.transito.api.controller;

import com.projeto.transito.domain.model.Proprietario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/teste")
    public String teste() {
        return "Teste concluído!";
    }

}
