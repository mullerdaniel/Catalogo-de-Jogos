package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.AvaliacaoRequisicaoDto;
import com.example.CatalogoJogos.model.Avaliacao;
import com.example.CatalogoJogos.repository.AvaliacaoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoService {

    private final AvaliacaoRepository avaliacaoRepository;

    // CRIAR AVALIACAO
    public Avaliacao criarAvaliacao(@Valid AvaliacaoRequisicaoDto avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    // LISTAR AVALIACOES
    public List<Avaliacao> listarAvaliacoes() {
        return avaliacaoRepository.findAll();
    }

    // BUSCAR AVALIACAO POR ID
    public Avaliacao buscarPorAvaliacaoPorId(Long id) {
        return avaliacaoRepository.findById(id).orElse(null);
    }

    // DELETAR AVALIACAO POR ID
    public void deletarAvaliacao(Long id) {
        avaliacaoRepository.deleteById(id);
    }
}
