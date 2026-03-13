package com.example.CatalogoJogos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

public record ConquistaRequisicaoDto(

        @NotNull(message = "O jogo_id deve ter um id")
        int jogo_id,

        @NotNull(message = "O título deve ser informado")
        String titulo,

        String descricao,

        @NotNull(message = "Os pontos devem ser informados")
        @Min(0)
        int pontos

){
}