package com.example.CatalogoJogos.controller;

import com.example.CatalogoJogos.dto.ConquistaRequisicaoDto;
import com.example.CatalogoJogos.model.Conquista;
import com.example.CatalogoJogos.service.ConquistaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conquistas")
public class ConquistaController {

    private final ConquistaService conquistaService;

    public ConquistaController(ConquistaService conquistaService) {
        this.conquistaService = conquistaService;
    }

    @PostMapping
    public Conquista criar(@RequestBody @Valid ConquistaRequisicaoDto dto){
        return conquistaService.criarConsquista(dto);
    }

    @GetMapping
    public List<Conquista> listar(){
        return conquistaService.listarConquistas();
    }
}