-- Scripts para cria��o do projeto --

CREATE TABLE profissional (
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR (16) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    PRIMARY KEY (cpf) 
);

CREATE TABLE receita (
   id_receita INT NOT NULL,
   titulo VARCHAR(30) NOT NULL,
   ingredientes VARCHAR(500) NOT NULL,
   modoPreparo VARCHAR(1000) NOT NULL,
   cpf_profissional VARCHAR (16) NOT NULL,
   PRIMARY KEY (id_receita),
   CONSTRAINT FK_PROFISSIONALRECEITA FOREIGN KEY (cpf_profissional)
   REFERENCES profissional(cpf)
);

CREATE SEQUENCE receita_sequencia
minvalue 1
maxvalue 999
INCREMENT BY 1;