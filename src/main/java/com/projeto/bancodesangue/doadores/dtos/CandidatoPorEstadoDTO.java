package com.projeto.bancodesangue.doadores.dtos;

import com.projeto.bancodesangue.doadores.projections.CandidatoPorEstadoProjection;

public class CandidatoPorEstadoDTO 
{
	Long candidatos;
	String estado;
	
	public CandidatoPorEstadoDTO() 
	{
		
	}
	
	public CandidatoPorEstadoDTO(Long candidatos, String estado) 
	{
		this.candidatos = candidatos;
		this.estado = estado;
	}
	
	public CandidatoPorEstadoDTO(CandidatoPorEstadoProjection projection) 
	{
		candidatos = projection.getCandidatos();
		estado = projection.getEstado();
	}
	
	public Long getCandidatos() 
	{
		return candidatos;
	}

	public void setCandidatos(Long candidatos) 
	{
		this.candidatos = candidatos;
	}

	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
}
