package com.example.CatalogoJogos.mapper;

import com.example.CatalogoJogos.dto.JogadorRequisicaoDto;
import com.example.CatalogoJogos.dto.JogadorRespostaDto;
import com.example.CatalogoJogos.model.Jogador;

public class JogadorMapper {

    public static Jogador toModel(JogadorRequisicaoDto dto){
        Jogador jogador = new Jogador();

        jogador.setNome(dto.nome());
        jogador.setEmail(dto.email());
        jogador.setNickname(dto.nickname());
        jogador.setIdade(dto.idade());
        jogador.setPais(dto.pais());

        return jogador;
    }

    public static JogadorRespostaDto toRespostaDto(Jogador jogador){
        return new JogadorRespostaDto(
                (int) jogador.getId(),
                jogador.getNome(),
                jogador.getEmail(),
                jogador.getNickname(),
                jogador.getIdade(),
                jogador.getPais()
        );
    }
}