package br.com.ebac.animal_service.repository;

import br.com.ebac.animal_service.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {

    @Query("SELECT a.funcionario.nome, COUNT(a) " +
            "FROM Animal a " +
            "WHERE a.dataAdocao BETWEEN :dataInicio AND :dataFim " +
            "GROUP BY a.funcionario.nome")
    List<Object[]> findResqueByEmployee(@Param("dataInicio") Date dataInicio,
                                        @Param("dataFim") Date dataFim);
}
