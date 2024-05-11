package com.projeto.bancodesangue.doadores.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.bancodesangue.doadores.entities.Doador;
import com.projeto.bancodesangue.doadores.projections.DoadorPorEstadoProjection;

public interface DoadorRepository extends JpaRepository<Doador, Long>
{
	@Query(nativeQuery = true, value = """
			SELECT COUNT(*) candidatos, e.estado
		     FROM doador d 
	       INNER JOIN endereco e ON e.id_endereco = d.id_endereco  
	       INNER JOIN informacao_doador i ON i.id_doador = d.id_doador
	       WHERE i.peso > 50 
	       AND AGE(CURRENT_DATE, d.data_nascimento)>= INTERVAL '16 years'
	       AND AGE(CURRENT_DATE, d.data_nascimento)<= INTERVAL '69 years'
	       GROUP BY e.estado 
	       ORDER BY e.estado""")
	    List<DoadorPorEstadoProjection> countDoadorPorEstado();
}