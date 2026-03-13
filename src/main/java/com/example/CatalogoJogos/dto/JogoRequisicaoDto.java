package com.example.CatalogoJogos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

public record JogoRequisicaoDto(

        @NotNull(message = "O nome do jogo deve ser informado")
        String nome,

        @NotNull(message = "O gênero deve ser informado")
        String genero,

        @NotNull(message = "A desenvolvedora deve ser informada")
        String desenvolvedora,

        @NotNull(message = "O preço deve ser informado")
        @Min(0)
        double preco,

        Date dataLancamento

){
}