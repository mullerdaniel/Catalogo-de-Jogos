package com.example.CatalogoJogos.dto;

import java.util.Date;

public record AvaliacaoRespostaDto(

        int id,
        int jogador_id,
        int jogo_id,
        int nota,
        String comentario,
        Date data_avaliacao

){
}