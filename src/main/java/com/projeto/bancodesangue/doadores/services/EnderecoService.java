package com.projeto.bancodesangue.doadores.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.bancodesangue.doadores.dtos.CandidatoPorEstadoDTO;
import com.projeto.bancodesangue.doadores.projections.CandidatoPorEstadoProjection;
import com.projeto.bancodesangue.doadores.repositories.EnderecoRepository;

@Service
public class EnderecoService 
{
	@Autowired
    private EnderecoRepository enderecoRepository;
	
	@Transactional(readOnly = true)
	public List<CandidatoPorEstadoDTO> contarDoadoresPorEstado() 
	{
		List<CandidatoPorEstadoProjection> result = enderecoRepository.candidatoPorEstado();
		return result.stream().map(x -> new CandidatoPorEstadoDTO(x)).toList();
	}
}
