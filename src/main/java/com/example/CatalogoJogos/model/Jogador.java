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
@Table(name = "jogador")
public class Jogador {

    private int id;
    private String nome;
    private String email;
    private String nickname;
    private int idade;
    private String pais;
}
