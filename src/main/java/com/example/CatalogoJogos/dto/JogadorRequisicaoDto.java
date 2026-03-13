package com.example.CatalogoJogos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

public record JogadorRequisicaoDto(

        @NotNull(message = "O nome deve ser informado")
        String nome,

        @NotNull(message = "O email deve ser informado")
        String email,

        @NotNull(message = "O nickname deve ser informado")
        String nickname,

        @NotNull(message = "A idade deve ser informada")
        @Min(0)
        int idade,

        @NotNull(message = "O país deve ser informado")
        String pais

){
}