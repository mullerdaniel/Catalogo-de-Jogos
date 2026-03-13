package com.example.CatalogoJogos.controller;

import com.example.CatalogoJogos.dto.JogadorRequisicaoDto;
import com.example.CatalogoJogos.model.Jogador;
import com.example.CatalogoJogos.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public Jogador criar(@RequestBody @Valid JogadorRequisicaoDto dto){
        return jogadorService.criarJogador(dto);
    }

    @GetMapping
    public List<Jogador> listar(){
        return jogadorService.listarJogadores();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        jogadorService.deletarJogador((long) id);
    }
}