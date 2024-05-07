package com.projeto.bancodesangue.doadores.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.bancodesangue.doadores.entities.Doador;
import com.projeto.bancodesangue.doadores.entities.Endereco;
import com.projeto.bancodesangue.doadores.entities.Informacao;
import com.projeto.bancodesangue.doadores.repositories.DoadorRepository;
import com.projeto.bancodesangue.doadores.repositories.EnderecoRepository;
import com.projeto.bancodesangue.doadores.repositories.InformacaoRepository;

@Service
public class DoadorService 
{
	@Autowired
    private DoadorRepository doadorRepository;
	
	@Autowired
    private EnderecoRepository enderecoRepository;
	
	@Autowired
    private InformacaoRepository informacaoRepository;
	
	public void importarDoador(List<Map<String, Object>> jsonDataList) 
	{
		 for (Map<String, Object> jsonData : jsonDataList) 
		 {
	            importarJSON(jsonData);
	     }
	}
	
	private void importarJSON(Map<String, Object> jsonData)
	{
		Map<String, Object> doadorJson = (Map<String, Object>) jsonData.get("doador");
        Doador doador = new Doador();
        
        doador.setNome((String) doadorJson.get("nome"));
        doador.setCpf((String) doadorJson.get("cpf"));
        doador.setRg((String) doadorJson.get("rg"));
        
        String dataNascStr = (String) doadorJson.get("data_nasc");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataNascStr, formatter);
        doador.setDtNascimento(dataNasc);
        
        doador.setSexo((String) doadorJson.get("sexo"));
        doador.setNomeMae((String) doadorJson.get("mae"));
        doador.setNomePai((String) doadorJson.get("pai"));
        doador.setEmail((String) doadorJson.get("email"));

        doadorRepository.save(doador);

        Map<String, Object> enderecoJson = (Map<String, Object>) jsonData.get("endereco");
        Endereco endereco = new Endereco();
        
        endereco.setCep((String) enderecoJson.get("cep"));
        endereco.setEndereco((String) enderecoJson.get("endereco"));
        endereco.setNumero((Long) enderecoJson.get("numero"));
        endereco.setBairro((String) enderecoJson.get("bairro"));
        endereco.setCidade((String) enderecoJson.get("cidade"));
        endereco.setEstado((String) enderecoJson.get("estado"));
        endereco.setTelefoneFixo((String) enderecoJson.get("telefone_fixo"));
        endereco.setCelular((String) enderecoJson.get("celular"));
        
        enderecoRepository.save(endereco);
        

        Map<String, Object> informacaoJson = (Map<String, Object>) jsonData.get("informacao");
        Informacao informacao = new Informacao();
        
        double altura = (double) informacaoJson.get("altura");
        informacao.setAltura(altura);
        
        double peso = (double) informacaoJson.get("peso");
        informacao.setPeso(peso);
        
        informacao.setTipoSanguineo((String) informacaoJson.get("tipo_sanguineo"));
        
        informacaoRepository.save(informacao);
	}
}