package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.BibliotecaRequisicaoDto;
import com.example.CatalogoJogos.dto.JogadorRequisicaoDto;
import com.example.CatalogoJogos.mapper.BibliotecaMapper;
import com.example.CatalogoJogos.mapper.JogadorMapper;
import com.example.CatalogoJogos.model.Biblioteca;
import com.example.CatalogoJogos.model.Jogador;
import com.example.CatalogoJogos.repository.BibliotecaRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecaService {

    private final BibliotecaRepository repository;

    // CRIAR BIBLIOTECA
    public Biblioteca criarBiblioteca(BibliotecaRequisicaoDto dto){
        Biblioteca biblioteca = BibliotecaMapper.toModel(dto);
        return repository.save(biblioteca);
    }

    // LISTAR BIBLIOTECA
    public List<Biblioteca> listarBibliotecas() {
        return repository.findAll();
    }

    // BUSCAR BIBLIOTECA POR ID
    public Biblioteca buscarBibliotecaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETAR BIBLIOTECA POR ID
    public void deletarBiblioteca(Long id) {
        repository.deleteById(id);
    }
}
