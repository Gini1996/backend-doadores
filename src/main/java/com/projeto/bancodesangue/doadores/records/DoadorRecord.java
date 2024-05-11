package com.projeto.bancodesangue.doadores.records;

import java.util.Date;

public record DoadorRecord(Long idDoador, String nome, String cpf, String rg, Date dtNascimento, String sexo, String nomeMae, String nomePai, String email, Long idEndereco)
{

}
