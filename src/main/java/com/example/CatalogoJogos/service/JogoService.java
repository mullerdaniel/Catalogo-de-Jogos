package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.JogoRequisicaoDto;
import com.example.CatalogoJogos.mapper.JogoMapper;
import com.example.CatalogoJogos.model.Jogo;
import com.example.CatalogoJogos.repository.JogoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JogoService {

    private final JogoRepository jogoRepository;

    // CRIAR AVALIACAO
    public Jogo criarJogo(@Valid JogoRequisicaoDto jogo) {
        return null;
    }

    // LISTAR AVALIACOES
    public List<Jogo> listarJogos() {
        return jogoRepository.findAll();
    }

    // BUSCAR AVALIACAO POR ID
    public Jogo buscarPorJogoPorId(Long id) {
        return jogoRepository.findById(id).orElse(null);
    }

    // DELETAR AVALIACAO POR ID
    public void deletarJogo(Long id) {
        jogoRepository.deleteById(id);
    }
}
