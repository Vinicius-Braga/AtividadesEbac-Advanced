CREATE TABLE animal (
  id INT AUTO_INCREMENT NOT NULL,
  nome_provisorio VARCHAR(255) NOT NULL,
  idade_estimada INT NOT NULL,
  raca VARCHAR(255) NOT NULL,
  tipo VARCHAR(255) NOT NULL,
  data_entrada date NOT NULL,
  data_adocao date,
  data_obito date,
  condicoes_chegada VARCHAR(255) NOT NULL,
  id_funcionario VARCHAR(255) NOT NULL,
  porte VARCHAR(255) NOT NULL,
  CONSTRAINT pk_animal PRIMARY KEY (id)
);

CREATE TABLE funcionario (
  id_funcionario INT AUTO_INCREMENT NOT NULL,
  nome VARCHAR(255) NOT NULL,
  cpf VARCHAR(255) NOT NULL,
  data_nascimento date NOT NULL
);