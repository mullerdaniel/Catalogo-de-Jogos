package com.example.CatalogoJogos.controller;

import com.example.CatalogoJogos.dto.JogoRequisicaoDto;
import com.example.CatalogoJogos.model.Jogo;
import com.example.CatalogoJogos.service.JogoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private final JogoService jogoService;

    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @PostMapping
    public Jogo criar(@RequestBody @Valid JogoRequisicaoDto dto){
        return jogoService.criarJogo(dto);
    }

    @GetMapping
    public List<Jogo> listar(){
        return jogoService.listarJogos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id){
        jogoService.deletarJogo((long) id);
    }
}