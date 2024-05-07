package com.projeto.bancodesangue.doadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.bancodesangue.doadores.entities.Informacao;

public interface InformacaoRepository extends JpaRepository<Informacao, Long>
{
	
}
