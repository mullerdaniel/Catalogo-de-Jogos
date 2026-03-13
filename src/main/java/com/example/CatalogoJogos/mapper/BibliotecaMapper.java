package com.example.CatalogoJogos.mapper;

import com.example.CatalogoJogos.dto.BibliotecaRequisicaoDto;
import com.example.CatalogoJogos.dto.BibliotecaRespostaDto;
import com.example.CatalogoJogos.model.Biblioteca;

public class BibliotecaMapper {

    public static Biblioteca toModel(BibliotecaRequisicaoDto dto){
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.setJogador_id(dto.jogador_id());
        biblioteca.setJogo_id(dto.jogo_id());
        biblioteca.setHorasJogadas(dto.horasJogadas());
        biblioteca.setDataCompra(dto.dataCompra());

        return biblioteca;
    }

    public static BibliotecaRespostaDto toRespostaDto(Biblioteca biblioteca){
        return new BibliotecaRespostaDto(
                biblioteca.getId(),
                biblioteca.getJogador_id(),
                biblioteca.getJogo_id(),
                biblioteca.getHorasJogadas(),
                biblioteca.getDataCompra()
        );
    }
}