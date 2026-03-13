package com.example.CatalogoJogos.controller;

import com.example.CatalogoJogos.dto.BibliotecaRequisicaoDto;
import com.example.CatalogoJogos.model.Biblioteca;
import com.example.CatalogoJogos.service.BibliotecaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecas")
public class BibliotecaController {

    private final BibliotecaService bibliotecaService;

    public BibliotecaController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    @PostMapping
    public Biblioteca criar(@RequestBody @Valid BibliotecaRequisicaoDto dto){
        return bibliotecaService.criarBiblioteca(dto);
    }

    @GetMapping
    public List<Biblioteca> listar(){
        return bibliotecaService.listarBibliotecas();
    }
}