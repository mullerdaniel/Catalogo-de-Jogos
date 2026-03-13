package com.example.CatalogoJogos.dto;

import java.util.Date;

public record JogoRespostaDto(

        int id,
        String nome,
        String genero,
        String desenvolvedora,
        double preco,
        Date dataLancamento

){
}