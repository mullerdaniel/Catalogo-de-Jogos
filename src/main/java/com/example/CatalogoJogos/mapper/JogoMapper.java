package com.example.CatalogoJogos.mapper;

import com.example.CatalogoJogos.dto.JogoRequisicaoDto;
import com.example.CatalogoJogos.dto.JogoRespostaDto;
import com.example.CatalogoJogos.model.Jogo;

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

    public static JogoRespostaDto toRespostaDto(Jogo jogo){
        return new JogoRespostaDto(
                jogo.getId(),
                jogo.getNome(),
                jogo.getGenero(),
                jogo.getDesenvolvedora(),
                jogo.getPreco(),
                jogo.getDataLancamento()
        );
    }
}