package com.example.CatalogoJogos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "conquista")
public class Conquista {

    private int id;
    private int jogo_id;
    private String titulo;
    private String descricao;
    private int pontos;
}
