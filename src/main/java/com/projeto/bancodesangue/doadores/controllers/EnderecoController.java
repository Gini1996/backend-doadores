package com.projeto.bancodesangue.doadores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.bancodesangue.doadores.dtos.CandidatoPorEstadoDTO;
import com.projeto.bancodesangue.doadores.services.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController
{
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping("/candidatoPorEstado")
    public ResponseEntity<List<CandidatoPorEstadoDTO>> contarDoadoresPorEstado() 
	{
		List<CandidatoPorEstadoDTO> result = enderecoService.contarDoadoresPorEstado();
	    return ResponseEntity.ok(result);
    }
}