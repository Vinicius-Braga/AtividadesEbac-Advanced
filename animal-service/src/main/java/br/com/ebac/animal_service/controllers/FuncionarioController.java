package br.com.ebac.animal_service.controllers;

import br.com.ebac.animal_service.domain.Animal;
import br.com.ebac.animal_service.domain.Funcionario;
import br.com.ebac.animal_service.repository.FuncionarioRepository;
import br.com.ebac.animal_service.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    // Construtor para injeção de dependência
    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    private List<Funcionario> ListAll() {
        return funcionarioService.findAll();
    }

    @GetMapping("/contagem")
    public ResponseEntity<Map<String, Long>> getResgatesPorFuncionario(
            @RequestParam("dataInicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicio,
            @RequestParam("dataFim") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataFim) {
        Map<String, Long> contagem = funcionarioService.getContagemResgatesPorFuncionario(dataInicio, dataFim);
        return ResponseEntity.ok(contagem);
    }

}
