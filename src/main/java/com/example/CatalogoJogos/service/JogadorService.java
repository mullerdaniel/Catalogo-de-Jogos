package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.JogadorRequisicaoDto;
import com.example.CatalogoJogos.mapper.JogadorMapper;
import com.example.CatalogoJogos.model.Jogador;
import com.example.CatalogoJogos.repository.JogadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JogadorService {

    private final JogadorRepository repository;

    // CRIAR AVALIACAO
    public Jogador criarJogador(JogadorRequisicaoDto dto){
        Jogador jogador = JogadorMapper.toModel(dto);
        return repository.save(jogador);
    }

    // LISTAR AVALIACOES
    public List<Jogador> listarJogadores() {
        return repository.findAll();
    }

    // BUSCAR AVALIACAO POR ID
    public Jogador buscarPorJogadorPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETAR AVALIACAO POR ID
    public void deletarJogador(Long id) {
        repository.deleteById(id);
    }
}
