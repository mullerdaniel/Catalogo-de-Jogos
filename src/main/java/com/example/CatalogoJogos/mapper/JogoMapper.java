package com.example.CatalogoJogos.mapper;

import com.example.CatalogoJogos.dto.JogoRequisicaoDto;
import com.example.CatalogoJogos.dto.JogoRespostaDto;
import com.example.CatalogoJogos.model.Jogo;
import jakarta.validation.Valid;

public class JogoMapper {

    public static Jogo toModel(JogoRequisicaoDto dto){
        Jogo jogo = new Jogo();

        jogo.setNome(dto.nome());
        jogo.setGenero(dto.genero());
        jogo.setDesenvolvedora(dto.desenvolvedora());
        jogo.setPreco(dto.preco());
        jogo.setDataLancamento(dto.dataLancamento());

        return jogo;
    }

}