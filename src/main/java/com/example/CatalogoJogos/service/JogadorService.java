package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.JogadorRequisicaoDto;
import com.example.CatalogoJogos.model.Jogador;
import com.example.CatalogoJogos.repository.JogadorRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JogadorService {

    private final JogadorRepository jogadorRepository;

    // CRIAR AVALIACAO
    public Jogador criarJogador(@Valid JogadorRequisicaoDto jogador) {
        return jogadorRepository.save(jogador);
    }

    // LISTAR AVALIACOES
    public List<Jogador> listarJogadores() {
        return jogadorRepository.findAll();
    }

    // BUSCAR AVALIACAO POR ID
    public Jogador buscarPorJogadorPorId(Long id) {
        return jogadorRepository.findById(id).orElse(null);
    }

    // DELETAR AVALIACAO POR ID
    public void deletarJogador(Long id) {
        jogadorRepository.deleteById(id);
    }
}
