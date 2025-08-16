CREATE TABLE tipo_combustivel (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco_por_litro DECIMAL(15,2) NOT NULL
);

CREATE TABLE bomba_combustivel (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL
);

CREATE TABLE bomba_tipo_combustivel (
    bomba_id BIGINT NOT NULL,
    tipo_combustivel_id BIGINT NOT NULL,
    PRIMARY KEY (bomba_id, tipo_combustivel_id),
    FOREIGN KEY (bomba_id) REFERENCES bomba_combustivel(id),
    FOREIGN KEY (tipo_combustivel_id) REFERENCES tipo_combustivel(id)
);