package com.projeto.bancodesangue.doadores.dtos;

import com.projeto.bancodesangue.doadores.projections.ImcPorFaixaEtariaProjection;

public class ImcPorFaixaEtariaDTO 
{
	String faixaEtaria;
	Double imcMedio;
	
	public ImcPorFaixaEtariaDTO() 
	{
		
	}

	public ImcPorFaixaEtariaDTO(String faixaEtaria, Double imcMedio) 
	{
		this.faixaEtaria = faixaEtaria;
		this.imcMedio = imcMedio;
	}

	public ImcPorFaixaEtariaDTO(ImcPorFaixaEtariaProjection projection) 
	{
		faixaEtaria = projection.getFaixaEtaria();
		imcMedio = projection.getImcMedio();
	}
	
	public String getFaixaEtaria() 
	{
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) 
	{
		this.faixaEtaria = faixaEtaria;
	}

	public Double getImcMedio() 
	{
		return imcMedio;
	}

	public void setImcMedio(Double imcMedio) 
	{
		this.imcMedio = imcMedio;
	}
	
}
