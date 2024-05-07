package com.projeto.bancodesangue.doadores.dtos;

import org.springframework.beans.BeanUtils;

import com.projeto.bancodesangue.doadores.entities.Endereco;

public class EnderecoDTO 
{
	private Long idEndereco;
	private String cep;
	private String endereco;
	private Long numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefoneFixo;
	private String celular;
	
	public EnderecoDTO()
	{
		
	}
	
	public EnderecoDTO(Endereco entity)
	{
		BeanUtils.copyProperties(entity, this);
	}

	public Long getIdEndereco() 
	{
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) 
	{
		this.idEndereco = idEndereco;
	}

	public String getCep() 
	{
		return cep;
	}

	public void setCep(String cep) 
	{
		this.cep = cep;
	}

	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}

	public Long getNumero() 
	{
		return numero;
	}

	public void setNumero(Long numero) 
	{
		this.numero = numero;
	}

	public String getBairro() 
	{
		return bairro;
	}

	public void setBairro(String bairro) 
	{
		this.bairro = bairro;
	}

	public String getCidade() 
	{
		return cidade;
	}

	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}

	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}

	public String getTelefoneFixo() 
	{
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) 
	{
		this.telefoneFixo = telefoneFixo;
	}

	public String getCelular() 
	{
		return celular;
	}

	public void setCelular(String celular) 
	{
		this.celular = celular;
	}
	
}
