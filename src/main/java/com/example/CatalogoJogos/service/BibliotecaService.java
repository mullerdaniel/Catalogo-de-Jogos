package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.BibliotecaRequisicaoDto;
import com.example.CatalogoJogos.model.Biblioteca;
import com.example.CatalogoJogos.repository.BibliotecaRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecaService {

    private final BibliotecaRepository bibliotecaRepository;

    // CRIAR BIBLIOTECA
    public Biblioteca criarBiblioteca(@Valid BibliotecaRequisicaoDto biblioteca) {
        return null;
    }

    // LISTAR BIBLIOTECA
    public List<Biblioteca> listarBibliotecas() {
        return bibliotecaRepository.findAll();
    }

    // BUSCAR BIBLIOTECA POR ID
    public Biblioteca buscarBibliotecaPorId(Long id) {
        return bibliotecaRepository.findById(id).orElse(null);
    }

    // DELETAR BIBLIOTECA POR ID
    public void deletarBiblioteca(Long id) {
        bibliotecaRepository.deleteById(id);
    }
}
