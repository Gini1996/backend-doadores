package com.projeto.bancodesangue.doadores.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "doador")
public class Doador 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doador")
	private Long idDoador;
	
	@Column(columnDefinition = "TEXT")
	private String nome;
	
	private String cpf;
	
	private String rg;
	
	@Column(name = "data_nascimento")
	private LocalDate dtNascimento;
	
	private String sexo;
	
	@Column(name = "nome_mae")
	private String nomeMae;
	
	@Column(name = "nome_pai")
	private String nomePai;
	
	@Column(columnDefinition = "TEXT")
	private String email;
	
	@OneToOne
    @JoinColumn(name = "id_endereco")
	private Endereco idEndereco;

	
	public Doador()
	{
		
	}
	
	
	public Doador(Long idDoador, String nome, String cpf, String rg, LocalDate dtNascimento, String sexo, String nomeMae, String nomePai, String email, Endereco idEndereco) 
	{
		this.idDoador = idDoador;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.email = email;
		this.idEndereco = idEndereco;
	}


	public Long getIdDoador() 
	{
		return idDoador;
	}

	public void setIdDoador(Long idDoador) 
	{
		this.idDoador = idDoador;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getRg() 
	{
		return rg;
	}

	public void setRg(String rg) 
	{
		this.rg = rg;
	}

	public LocalDate getDtNascimento() 
	{
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) 
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dtNascimento = LocalDate.parse(dtNascimento,formatter);
	}
	
	public String getSexo() 
	{
		return sexo;
	}

	public void setSexo(String sexo) 
	{
		this.sexo = sexo;
	}

	public String getNomeMae() 
	{
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) 
	{
		this.nomeMae = nomeMae;
	}

	public String getNomePai() 
	{
		return nomePai;
	}

	public void setNomePai(String nomePai) 
	{
		this.nomePai = nomePai;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	

	public Endereco getIdEndereco() 
	{
		return idEndereco;
	}


	public void setIdEndereco(Endereco idEndereco) 
	{
		this.idEndereco = idEndereco;
	}


	@Override
	public int hashCode() 
	{
		return Objects.hash(cpf, dtNascimento, email, idDoador, idEndereco, nome, nomeMae, nomePai, rg, sexo);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doador other = (Doador) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dtNascimento, other.dtNascimento)
				&& Objects.equals(email, other.email) && Objects.equals(idDoador, other.idDoador)
				&& Objects.equals(idEndereco, other.idEndereco) && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(rg, other.rg) && Objects.equals(sexo, other.sexo);
	}
	
}
