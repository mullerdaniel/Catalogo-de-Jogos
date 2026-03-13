package com.example.CatalogoJogos.mapper;

import com.example.CatalogoJogos.dto.ConquistaRequisicaoDto;
import com.example.CatalogoJogos.dto.ConquistaRespostaDto;
import com.example.CatalogoJogos.model.Conquista;

public class ConquistaMapper {

    public static Conquista toModel(ConquistaRequisicaoDto dto){
        Conquista conquista = new Conquista();

        conquista.setJogo_id(dto.jogo_id());
        conquista.setTitulo(dto.titulo());
        conquista.setDescricao(dto.descricao());
        conquista.setPontos(dto.pontos());

        return conquista;
    }

    public static ConquistaRespostaDto toRespostaDto(Conquista conquista){
        return new ConquistaRespostaDto(
                conquista.getId(),
                conquista.getJogo_id(),
                conquista.getTitulo(),
                conquista.getDescricao(),
                conquista.getPontos()
        );
    }
}