package com.example.CatalogoJogos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

public record AvaliacaoRequisicaoDto(

        @NotNull(message = "O jogador_id deve ter um id")
        int jogador_id,

        @NotNull(message = "O jogo_id deve ter um id")
        int jogo_id,

        @NotNull(message = "A nota deve ser informada")
        @Min(0)
        int nota,

        String comentario,

        Date data_avaliacao

){
}