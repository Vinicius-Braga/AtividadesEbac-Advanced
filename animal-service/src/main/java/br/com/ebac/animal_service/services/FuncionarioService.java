package br.com.ebac.animal_service.services;

import br.com.ebac.animal_service.domain.Funcionario;
import br.com.ebac.animal_service.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    public Map<String, Long> getContagemResgatesPorFuncionario(LocalDate dataInicio, LocalDate dataFim) {
        // Convertendo de LocalDate para java.sql.Date
        java.sql.Date sqlDataInicio = java.sql.Date.valueOf(dataInicio);
        java.sql.Date sqlDataFim = java.sql.Date.valueOf(dataFim);

        // Chamando o repositório com as datas convertidas
        List<Object[]> results = funcionarioRepository.findResqueByEmployee(sqlDataInicio, sqlDataFim);

        Map<String, Long> contagem = new HashMap<>();
        for (Object[] result : results) {
            String nomeRecebedor = (String) result[0];
            Long count = (Long) result[1];
            contagem.put(nomeRecebedor, count);
        }
        return contagem;
    }

}
