package com.projeto.bancodesangue.doadores.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Informacao_doador")
public class Informacao 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_info")
	private Long idInformacao;
	
	private double altura;
	
	private double peso;
	
	@Column(name = "tipo_sanguineo")
	private String tipoSanguineo;
	
	@ManyToOne
	private Doador idDoador;

	public Informacao() 
	{
		
	}

	public Informacao(Long idInformacao, double altura, double peso, String tipoSanguineo, Doador idDoador) 
	{
		this.idInformacao = idInformacao;
		this.altura = altura;
		this.peso = peso;
		this.tipoSanguineo = tipoSanguineo;
		this.idDoador = idDoador;
	}

	public Long getIdInformacao() 
	{
		return idInformacao;
	}

	public void setIdInformacao(Long idInformacao) 
	{
		this.idInformacao = idInformacao;
	}

	public double getAltura() 
	{
		return altura;
	}

	public void setAltura(double altura) 
	{
		this.altura = altura;
	}

	public double getPeso() 
	{
		return peso;
	}

	public void setPeso(double peso) 
	{
		this.peso = peso;
	}

	public String getTipoSanguineo() 
	{
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) 
	{
		this.tipoSanguineo = tipoSanguineo;
	}

	
	public Doador getIdDoador() 
	{
		return idDoador;
	}

	public void setIdDoador(Doador idDoador) 
	{
		this.idDoador = idDoador;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(altura, idDoador, idInformacao, peso, tipoSanguineo);
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
		Informacao other = (Informacao) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Objects.equals(idDoador, other.idDoador) && Objects.equals(idInformacao, other.idInformacao)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Objects.equals(tipoSanguineo, other.tipoSanguineo);
	}
	
}
