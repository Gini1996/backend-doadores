package com.projeto.bancodesangue.doadores.dtos;

import org.springframework.beans.BeanUtils;

import com.projeto.bancodesangue.doadores.entities.Informacao;

public class InformacaoDTO 
{
	private Long idInformacao;
	private double altura;
	private double peso;
	private String tipoSanguineo;
	private Long idDoador;

	public InformacaoDTO() 
	{
		
	}
	
	public InformacaoDTO(Informacao entity)
	{
		BeanUtils.copyProperties(entity, this);
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

	public Long getIdDoador() 
	{
		return idDoador;
	}

	public void setIdDoador(Long idDoador) 
	{
		this.idDoador = idDoador;
	}
	
}
