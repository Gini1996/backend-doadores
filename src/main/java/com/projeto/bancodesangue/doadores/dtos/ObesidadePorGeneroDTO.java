package com.projeto.bancodesangue.doadores.dtos;

import com.projeto.bancodesangue.doadores.projections.ObesidadePorGeneroProjection;

public class ObesidadePorGeneroDTO 
{
	String genero;
	Double percentualObesos;
	
	public ObesidadePorGeneroDTO() 
	{
		
	}
	
	public ObesidadePorGeneroDTO(String genero, Double percentualObesos) 
	{
		this.genero = genero;
		this.percentualObesos = percentualObesos;
	}
	
	public ObesidadePorGeneroDTO(ObesidadePorGeneroProjection projection) 
	{
		genero = projection.getGenero();
		percentualObesos = projection.getPercentualObesos();
	}
	
	public String getGenero() 
	{
		return genero;
	}
	
	public void setGenero(String genero) 
	{
		this.genero = genero;
	}
	
	public Double getPercentualObesos() 
	{
		return percentualObesos;
	}
	
	public void setPercentualObesos(Double percentualObesos) 
	{
		this.percentualObesos = percentualObesos;
	}
	
}