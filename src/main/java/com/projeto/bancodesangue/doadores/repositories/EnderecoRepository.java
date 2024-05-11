package com.projeto.bancodesangue.doadores.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.bancodesangue.doadores.entities.Endereco;
import com.projeto.bancodesangue.doadores.projections.CandidatoPorEstadoProjection;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>
{
	@Query(nativeQuery = true, value = """
			SELECT COUNT(*) candidatos, e.estado
			  FROM endereco e  
	      GROUP BY e.estado 
          ORDER BY e.estado""")
	    List<CandidatoPorEstadoProjection> candidatoPorEstado();
}
