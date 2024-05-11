package com.projeto.bancodesangue.doadores.dtos;

public class EnderecoDTO 
{
	Long idEndereco;
	String cep;
	String endereco; 
	Long numero;
	String bairro; 
	String cidade; 
	String estado; 
	String telefoneFixo; 
	String celular;
	
	public EnderecoDTO() 
	{
		
	}
	
	public EnderecoDTO(Long idEndereco, String cep, String endereco, Long numero, String bairro, String cidade,String estado, String telefoneFixo, String celular) 
	{
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.telefoneFixo = telefoneFixo;
		this.celular = celular;
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
