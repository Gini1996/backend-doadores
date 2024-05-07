package com.projeto.bancodesangue.doadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.bancodesangue.doadores.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>
{

}
