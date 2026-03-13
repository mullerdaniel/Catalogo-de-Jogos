package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.AvaliacaoRequisicaoDto;
import com.example.CatalogoJogos.dto.JogadorRequisicaoDto;
import com.example.CatalogoJogos.mapper.AvaliacaoMapper;
import com.example.CatalogoJogos.mapper.JogadorMapper;
import com.example.CatalogoJogos.model.Avaliacao;
import com.example.CatalogoJogos.model.Jogador;
import com.example.CatalogoJogos.repository.AvaliacaoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoService {

    private final AvaliacaoRepository repository;

    // CRIAR AVALIACAO
    public Avaliacao criarAvaliacao(AvaliacaoRequisicaoDto dto){
        Avaliacao avaliacao = AvaliacaoMapper.toModel(dto);
        return repository.save(avaliacao);
    }

    // LISTAR AVALIACOES
    public List<Avaliacao> listarAvaliacoes() {
        return repository.findAll();
    }

    // BUSCAR AVALIACAO POR ID
    public Avaliacao buscarPorAvaliacaoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETAR AVALIACAO POR ID
    public void deletarAvaliacao(Long id) {
        repository.deleteById(id);
    }
}
