package com.projeto.bancodesangue.doadores.services;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.bancodesangue.doadores.dtos.DoadorPorEstadoDTO;
import com.projeto.bancodesangue.doadores.entities.Doador;
import com.projeto.bancodesangue.doadores.entities.Endereco;
import com.projeto.bancodesangue.doadores.entities.Informacao;
import com.projeto.bancodesangue.doadores.projections.DoadorPorEstadoProjection;
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
	
	public void importarDados(List<Map<String, Object>> jsonDataList) throws IOException 
	{
        for (Map<String, Object> jsonData : jsonDataList) 
        {
            Endereco endereco = new Endereco();
            endereco.setCep((String) jsonData.get("cep"));
            endereco.setEndereco((String) jsonData.get("endereco"));
            endereco.setNumero(Long.valueOf(jsonData.get("numero").toString()));
            endereco.setBairro((String) jsonData.get("bairro"));
            endereco.setCidade((String) jsonData.get("cidade"));
            endereco.setEstado((String) jsonData.get("estado"));
            endereco.setTelefoneFixo((String) jsonData.get("telefone_fixo"));
            endereco.setCelular((String) jsonData.get("celular"));
            enderecoRepository.save(endereco);

            Doador doador = new Doador();
            doador.setNome((String) jsonData.get("nome"));
            doador.setCpf((String) jsonData.get("cpf"));
            doador.setRg((String) jsonData.get("rg"));
            doador.setDtNascimento((String) jsonData.get("data_nasc"));
            doador.setSexo((String) jsonData.get("sexo"));
            doador.setNomeMae((String) jsonData.get("mae"));
            doador.setNomePai((String) jsonData.get("pai"));
            doador.setEmail((String) jsonData.get("email"));
            doador.setIdEndereco(endereco);
            doadorRepository.save(doador);
            
            Informacao informacao = new Informacao();
            informacao.setAltura(Double.valueOf(jsonData.get("altura").toString()));
            informacao.setPeso(Double.valueOf(jsonData.get("peso").toString()));
            informacao.setTipoSanguineo((String) jsonData.get("tipo_sanguineo"));
            informacao.setIdDoador(doador); 
            informacaoRepository.save(informacao);
        }
    }
	
	@Transactional(readOnly = true)
	public List<DoadorPorEstadoDTO> contarDoadoresPorEstado() 
	{
		List<DoadorPorEstadoProjection> result = doadorRepository.countDoadorPorEstado();
		return result.stream().map(x -> new DoadorPorEstadoDTO(x)).toList();
	}

}