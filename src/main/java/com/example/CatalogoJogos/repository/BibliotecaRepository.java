package com.example.CatalogoJogos.repository;

import com.example.CatalogoJogos.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
}
