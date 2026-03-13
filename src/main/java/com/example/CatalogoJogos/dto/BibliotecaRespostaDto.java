package com.example.CatalogoJogos.dto;

import java.util.Date;

public record BibliotecaRespostaDto(

        int id,
        int jogador_id,
        int jogo_id,
        int horasJogadas,
        Date dataCompra

){
}