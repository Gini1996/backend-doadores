package com.projeto.bancodesangue.doadores.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Endereco")
public class Endereco 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
	private Long idEndereco;
	
	private String cep;
	
	@Column(columnDefinition = "TEXT")
	private String endereco;
	
	private Long numero;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
	@Column(name = "telefone_fixo")
	private String telefoneFixo;
	
	private String celular;
	
	public Endereco()
	{
		
	}

	public Endereco(Long idEndereco, String cep, String endereco, Long numero, String bairro, String cidade, String estado, String telefoneFixo, String celular) 
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

	@Override
	public int hashCode() 
	{
		return Objects.hash(bairro, celular, cep, cidade, endereco, estado, idEndereco, numero, telefoneFixo);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(celular, other.celular)
				&& Objects.equals(cep, other.cep) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(estado, other.estado)
				&& Objects.equals(idEndereco, other.idEndereco) && Objects.equals(numero, other.numero)
				&& Objects.equals(telefoneFixo, other.telefoneFixo);
	}
}