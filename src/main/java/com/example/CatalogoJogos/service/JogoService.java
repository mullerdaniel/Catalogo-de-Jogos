package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.JogadorRequisicaoDto;
import com.example.CatalogoJogos.dto.JogoRequisicaoDto;
import com.example.CatalogoJogos.mapper.JogadorMapper;
import com.example.CatalogoJogos.mapper.JogoMapper;
import com.example.CatalogoJogos.model.Jogador;
import com.example.CatalogoJogos.model.Jogo;
import com.example.CatalogoJogos.repository.JogoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JogoService {

    private final JogoRepository repository;

    // CRIAR AVALIACAO
    public Jogo criarJogo(JogoRequisicaoDto dto){
        Jogo jogo = JogoMapper.toModel(dto);
        return repository.save(jogo);
    }

    // LISTAR AVALIACOES
    public List<Jogo> listarJogos() {
        return repository.findAll();
    }

    // BUSCAR AVALIACAO POR ID
    public Jogo buscarPorJogoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETAR AVALIACAO POR ID
    public void deletarJogo(Long id) {
        repository.deleteById(id);
    }
}
