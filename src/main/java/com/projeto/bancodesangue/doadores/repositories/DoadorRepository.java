package com.projeto.bancodesangue.doadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.bancodesangue.doadores.entities.Doador;

public interface DoadorRepository extends JpaRepository<Doador, Long>
{
	
}