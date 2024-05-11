package com.projeto.bancodesangue.doadores.dtos;

public class InformacaoDTO 
{
	Long idInformacao;
	double altura;
	double peso;
	String tipoSanguineo; 
	Long idDoador;
	
	public InformacaoDTO() 
	{
		
	}
	
	public InformacaoDTO(Long idInformacao, double altura, double peso, String tipoSanguineo, Long idDoador) 
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
	
	public Long getIdDoador() 
	{
		return idDoador;
	}
	
	public void setIdDoador(Long idDoador) 
	{
		this.idDoador = idDoador;
	}
}
