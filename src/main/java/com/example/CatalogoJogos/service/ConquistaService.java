package com.example.CatalogoJogos.service;

import com.example.CatalogoJogos.model.Avaliacao;
import com.example.CatalogoJogos.model.Conquista;
import com.example.CatalogoJogos.repository.ConquistaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConquistaService {

    private final ConquistaRepository conquistaRepository;

    // CRIAR AVALIACAO
    public Conquista criarConquista(Conquista conquista) {
        return conquistaRepository.save(conquista);
    }

    // LISTAR AVALIACOES
    public List<Conquista> listarConquistas() {
        return conquistaRepository.findAll();
    }

    // BUSCAR AVALIACAO POR ID
    public Conquista buscarPorConquistaPorId(Long id) {
        return conquistaRepository.findById(id).orElse(null);
    }

    // DELETAR AVALIACAO POR ID
    public void deletarConquista(Long id) {
        conquistaRepository.deleteById(id);
    }
}
