package com.projeto.transito.api.controller;

import com.projeto.transito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProprietarioController {

    @GetMapping("/teste")
    public String teste() {
        return "Teste concluído!";
    }

}
