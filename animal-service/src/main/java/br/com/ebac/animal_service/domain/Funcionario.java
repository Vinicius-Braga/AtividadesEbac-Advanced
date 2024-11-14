package br.com.ebac.animal_service.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario", nullable = false)
    private Integer id;

    private String nome;

    private String cpf;

    private Date dataNascimento;
}
