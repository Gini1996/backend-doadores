package com.projeto.bancodesangue.doadores.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.bancodesangue.doadores.services.DoadorService;

@RestController
@RequestMapping(value = "/doador")
public class DoadorController 
{
	@Autowired
	private DoadorService doadorService;
	
	@PostMapping("/importarPessoas")
    public ResponseEntity<String> importarPessoas(@RequestBody List<Map<String, Object>> jsonDataList) 
	{
        try 
        {
        	doadorService.importarDados(jsonDataList);
            return ResponseEntity.ok("Dados importados com sucesso.");
        } 
        catch (IOException e) 
        {
            return ResponseEntity.badRequest().body("Erro ao importar dados: " + e.getMessage());
        }
    }
}