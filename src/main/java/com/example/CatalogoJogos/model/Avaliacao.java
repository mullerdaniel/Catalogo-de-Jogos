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
@Table(name = "avaliacao")
public class Avaliacao {

    private int id;
    private int jogador_id;
    private int jogo_id;
    private int nota;
    private String comentario;
    private Date data_avaliacao;
}
