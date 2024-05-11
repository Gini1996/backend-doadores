package com.projeto.bancodesangue.doadores.dtos;

import com.projeto.bancodesangue.doadores.projections.MediaIdadeTipoSangueProjection;

public class MediaIdadeTipoSangueDTO 
{
	  Long mediaIdade;
	String tipoSangue;
	
	public MediaIdadeTipoSangueDTO() 
	{
		
	}

	public MediaIdadeTipoSangueDTO(Long mediaIdade, String tipoSangue) 
	{
		this.mediaIdade = mediaIdade;
		this.tipoSangue = tipoSangue;
	}
	
	public MediaIdadeTipoSangueDTO(MediaIdadeTipoSangueProjection projection) 
	{
		 mediaIdade = projection.getMediaIdade();
		 tipoSangue = projection.getTipoSangue();
	}

	public Long getMediaIdade() 
	{
		return mediaIdade;
	}

	public void setMediaIdade(Long mediaIdade) 
	{
		this.mediaIdade = mediaIdade;
	}

	public String getTipoSangue() 
	{
		return tipoSangue;
	}

	public void setTipoSangue(String tipoSangue) 
	{
		this.tipoSangue = tipoSangue;
	}
}
