package com.projeto.bancodesangue.doadores.dtos;

import java.util.Date;

public class DoadorDTO 
{
	Long idDoador; 
	String nome;
	String cpf; 
	String rg;
	Date dtNascimento; 
	String sexo;
	String nomeMae; 
	String nomePai; 
	String email;
	Long idEndereco;
	
	public DoadorDTO() 
	{
		
	}
	
	public DoadorDTO(Long idDoador, String nome, String cpf, String rg, Date dtNascimento, String sexo, String nomeMae, String nomePai, String email, Long idEndereco) 
	{
		this.idDoador = idDoador;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.email = email;
		this.idEndereco = idEndereco;
	}
	
	public Long getIdDoador() 
	{
		return idDoador;
	}
	
	public void setIdDoador(Long idDoador) 
	{
		this.idDoador = idDoador;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	public String getRg() 
	{
		return rg;
	}
	
	public void setRg(String rg) 
	{
		this.rg = rg;
	}
	
	public Date getDtNascimento() 
	{
		return dtNascimento;
	}
	
	public void setDtNascimento(Date dtNascimento) 
	{
		this.dtNascimento = dtNascimento;
	}
	
	public String getSexo() 
	{
		return sexo;
	}
	
	public void setSexo(String sexo) 
	{
		this.sexo = sexo;
	}
	
	public String getNomeMae() 
	{
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) 
	{
		this.nomeMae = nomeMae;
	}
	
	public String getNomePai() 
	{
		return nomePai;
	}
	
	public void setNomePai(String nomePai) 
	{
		this.nomePai = nomePai;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public Long getIdEndereco() 
	{
		return idEndereco;
	}
	
	public void setIdEndereco(Long idEndereco) 
	{
		this.idEndereco = idEndereco;
	}
}
