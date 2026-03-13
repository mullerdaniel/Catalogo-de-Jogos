package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.dto.ConquistaRequisicaoDto;
import com.example.CatalogoJogos.dto.JogadorRequisicaoDto;
import com.example.CatalogoJogos.mapper.ConquistaMapper;
import com.example.CatalogoJogos.mapper.JogadorMapper;
import com.example.CatalogoJogos.model.Conquista;
import com.example.CatalogoJogos.model.Jogador;
import com.example.CatalogoJogos.repository.ConquistaRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConquistaService {

    private final ConquistaRepository repository;

    // CRIAR AVALIACAO
    public Conquista criarConsquista(ConquistaRequisicaoDto dto){
        Conquista conquista = ConquistaMapper.toModel(dto);
        return repository.save(conquista);
    }

    // LISTAR AVALIACOES
    public List<Conquista> listarConquistas() {
        return repository.findAll();
    }

    // BUSCAR AVALIACAO POR ID
    public Conquista buscarPorConquistaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETAR AVALIACAO POR ID
    public void deletarConquista(Long id) {
        repository.deleteById(id);
    }
}
