package com.example.CatalogoJogos.controller;

import com.example.CatalogoJogos.dto.AvaliacaoRequisicaoDto;
import com.example.CatalogoJogos.model.Avaliacao;
import com.example.CatalogoJogos.service.AvaliacaoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoController {

    private final AvaliacaoService avaliacaoService;

    public AvaliacaoController(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }

    @PostMapping
    public Avaliacao criar(@RequestBody @Valid AvaliacaoRequisicaoDto dto){
        return avaliacaoService.criarAvaliacao(dto);
    }

    @GetMapping
    public List<Avaliacao> listar(){
        return avaliacaoService.listarAvaliacoes();
    }
}