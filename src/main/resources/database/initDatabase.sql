CREATE TABLE IF NOT EXISTS endereco
( 
	id_endereco     INTEGER,
	cep             VARCHAR(10) NOT NULL,
    endereco        VARCHAR(255),
    numero          INTEGER,
    bairro          VARCHAR(255),
    cidade          VARCHAR(255),
    estado          VARCHAR(2),
    telefone_fixo   VARCHAR(50),
    celular         VARCHAR(50),
	PRIMARY KEY (id_endereco)
);

CREATE TABLE IF NOT EXISTS doador
( 
	id_doador       INTEGER,
	nome            VARCHAR(255) NOT NULL,
    cpf             VARCHAR(30) NOT NULL,
    rg              VARCHAR(30),
    data_nascimento DATE,
    sexo            VARCHAR(20),
    nome_mae        VARCHAR(255),
    nome_pai        VARCHAR(255),
    email           VARCHAR(255),
    id_endereco     INTEGER,
	PRIMARY KEY (id_doador),
    FOREIGN KEY (id_endereco) REFERENCES endereco (id_endereco)
);

CREATE TABLE IF NOT EXISTS informacao_doador
( 
	id_info         INTEGER,
    id_doador       INTEGER,
	altura          DECIMAL NOT NULL,
    peso            DECIMAL NOT NULL,
    tipo_sanguineo  VARCHAR(3),
    PRIMARY KEY (id_info),
    FOREIGN KEY (id_doador) REFERENCES doador (id_doador)
);