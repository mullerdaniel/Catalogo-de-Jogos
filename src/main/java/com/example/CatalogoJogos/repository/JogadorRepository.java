package com.example.CatalogoJogos.repository;

import com.example.CatalogoJogos.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
