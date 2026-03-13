package com.example.CatalogoJogos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "biblioteca")
public class Biblioteca {

    private int id;
    private int jogadorId;
    private int jogoId;
    private int horasJogadas;
    private LocalDateTime DataCompra;
}
