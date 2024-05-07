package com.projeto.bancodesangue.doadores.dtos;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.projeto.bancodesangue.doadores.entities.Doador;


public class DoadorDTO 
{
	private Long   idDoador;
	private String nome;
	private String cpf;
	private String rg;
	private Date   dtNascimento;
	private String sexo;
	private String nomeMae;
	private String nomePai;
	private String email;
	private Long   idEndereco;

	public DoadorDTO()
	{
		
	}
	
	public DoadorDTO(Doador entity)
	{
		BeanUtils.copyProperties(entity, this);
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
