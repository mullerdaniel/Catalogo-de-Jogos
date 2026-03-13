package com.example.CatalogoJogos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "jogo")
public class Jogo {

    private int id;
    private String nome;
    private String genero;
    private String desenvolvedora;
    private double preco;
    private Date dataLancamento;
}
