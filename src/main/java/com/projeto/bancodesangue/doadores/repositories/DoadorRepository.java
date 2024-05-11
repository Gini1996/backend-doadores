package com.projeto.bancodesangue.doadores.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.bancodesangue.doadores.entities.Doador;
import com.projeto.bancodesangue.doadores.projections.ImcPorFaixaEtariaProjection;
import com.projeto.bancodesangue.doadores.projections.MediaIdadeTipoSangueProjection;
import com.projeto.bancodesangue.doadores.projections.ObesidadePorGeneroProjection;

public interface DoadorRepository extends JpaRepository<Doador, Long>
{
	@Query(nativeQuery = true, value = """
			SELECT CASE WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 0  AND 10 THEN '0-10'
			      	    WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 11 AND 20 THEN '11-20'
			      	    WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 21 AND 30 THEN '21-30'
				        WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 31 AND 40 THEN '31-40'
				        WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 41 AND 50 THEN '41-50'
				        WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 51 AND 60 THEN '51-60'
				        WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 61 AND 70 THEN '61-70'
				        WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 71 AND 80 THEN '71-80'
			            WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 81 AND 90 THEN '81-90'
			            WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 91 AND 100 THEN '91-100'
                        ELSE '100+'
                    END AS faixaEtaria,
                    AVG(i.peso / (i.altura * i.altura)) AS imcMedio
             FROM doador d
       INNER JOIN informacao_doador i ON i.id_doador = d.id_doador
         GROUP BY CASE WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 0  AND 10 THEN '0-10'
        		       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 11 AND 20 THEN '11-20'
        		       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 21 AND 30 THEN '21-30'
				       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 31 AND 40 THEN '31-40'
				       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 41 AND 50 THEN '41-50'
				       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 51 AND 60 THEN '51-60'
				       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 61 AND 70 THEN '61-70'
				       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 71 AND 80 THEN '71-80'
				       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 81 AND 90 THEN '81-90'
				       WHEN EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)) BETWEEN 91 AND 100 THEN '91-100'
			 	       ELSE '100+'
    	 	       END
 	          ORDER BY faixaEtaria""")
	    List<ImcPorFaixaEtariaProjection> ImcPorFaixa();
	
	@Query(nativeQuery = true, value = """
			SELECT d.sexo genero, 
	               100.0 * SUM(CASE WHEN i.peso / (i.altura * i.altura) > 30 THEN 1 ELSE 0 END) / COUNT(*) AS percentualObesos
              FROM doador d
        INNER JOIN informacao_doador i ON i.id_doador = d.id_doador
          GROUP BY d.sexo""")
	    List<ObesidadePorGeneroProjection> obesosPorGenero();
	
	@Query(nativeQuery = true, value = """
			SELECT ROUND(AVG(EXTRACT(YEAR FROM AGE(CURRENT_DATE, d.data_nascimento)))) AS mediaIdade,
				   i.tipo_sanguineo AS tipoSangue
			  FROM doador d
		INNER JOIN informacao_doador i ON i.id_doador = d.id_doador
		  GROUP BY i.tipo_sanguineo
	      ORDER BY i.tipo_sanguineo""")
	    List<MediaIdadeTipoSangueProjection> idadeTipoSangue();
}