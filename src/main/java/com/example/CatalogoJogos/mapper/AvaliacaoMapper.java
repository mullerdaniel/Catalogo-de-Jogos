package com.example.CatalogoJogos.mapper;

import com.example.CatalogoJogos.dto.AvaliacaoRequisicaoDto;
import com.example.CatalogoJogos.dto.AvaliacaoRespostaDto;
import com.example.CatalogoJogos.model.Avaliacao;

public class AvaliacaoMapper {

    public static Avaliacao toModel(AvaliacaoRequisicaoDto dto){
        Avaliacao avaliacao = new Avaliacao();

        avaliacao.setJogador_id(dto.jogador_id());
        avaliacao.setJogo_id(dto.jogo_id());
        avaliacao.setNota(dto.nota());
        avaliacao.setComentario(dto.comentario());
        avaliacao.setData_avaliacao(dto.data_avaliacao());

        return avaliacao;
    }

    public static AvaliacaoRespostaDto toRespostaDto(Avaliacao avaliacao){
        return new AvaliacaoRespostaDto(
                (int) avaliacao.getId(),
                avaliacao.getJogador_id(),
                avaliacao.getJogo_id(),
                avaliacao.getNota(),
                avaliacao.getComentario(),
                avaliacao.getData_avaliacao()
        );
    }
}