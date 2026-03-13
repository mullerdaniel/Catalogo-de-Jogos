package com.example.CatalogoJogos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

public record BibliotecaRequisicaoDto (
    @NotNull(message = "O jogador_id deve ter um id")
    int jogador_id,
    @NotNull(message = "O jogo_id deve ter um id")
    int jogo_id,
    @NotNull(message = "Deve conter quantos horas foram jogadas")
    @Min(0)
    int horasJogadas,
    @NotNull(message = "Deve conter quano foi a data de compra")
    Date dataCompra
){
}
