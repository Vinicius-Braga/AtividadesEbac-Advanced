INSERT INTO animal
    (NOME_PROVISORIO, IDADE_ESTIMADA, RACA, TIPO, DATA_ENTRADA, CONDICOES_CHEGADA, id_funcionario, PORTE)
VALUES
    ('Thor', 5, 'SRD', 'Cachorro' , CURRENT_DATE, 'Bem pulgento', 1, 'Pequeno');  -- '1' é o ID do funcionário

INSERT INTO animal
    (NOME_PROVISORIO, IDADE_ESTIMADA, RACA, TIPO, DATA_ENTRADA, CONDICOES_CHEGADA, id_funcionario, PORTE)
VALUES
    ('Rex', 10, 'Labrador', 'Cachorro' , CURRENT_DATE - 10, 'Bem velho', 2, 'Grande');  -- '2' é o ID do funcionário

INSERT INTO animal
    (NOME_PROVISORIO, IDADE_ESTIMADA, RACA, TIPO, DATA_ENTRADA, CONDICOES_CHEGADA, id_funcionario, PORTE, DATA_ADOCAO)
VALUES
    ('BOB', 2, 'PUG', 'Cachorro' , CURRENT_DATE, 'Bem gordo', 3, 'Pequeno', CURRENT_DATE);  -- '3' é o ID do funcionário

INSERT INTO animal
    (NOME_PROVISORIO, IDADE_ESTIMADA, RACA, TIPO, DATA_ENTRADA, CONDICOES_CHEGADA, id_funcionario, PORTE, DATA_ADOCAO)
VALUES
    ('BOB', 4, 'PUG', 'Gato' ,  CURRENT_DATE, 'Bem gordo', 3, 'Pequeno', CURRENT_DATE);

INSERT INTO funcionario
    (NOME, CPF, DATA_NASCIMENTO)
VALUES
    ('Vinicius', '93442294334', '2003-02-22');

INSERT INTO funcionario
    (NOME, CPF, DATA_NASCIMENTO)
VALUES
    ('Mathias', '03298743232', '1997-02-22');

INSERT INTO funcionario
    (NOME, CPF, DATA_NASCIMENTO)
VALUES
    ('Fred', '05239887625', '1990-02-22');