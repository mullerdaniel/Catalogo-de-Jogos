# Banco De Dados

CREATE DATABASE catalogoJogos;<br>
USE catalogoJogos;<br><br>

-- TABELA JOGADOR<br>
CREATE TABLE jogador (<br>
    id INT AUTO_INCREMENT PRIMARY KEY,<br>
    nome VARCHAR(50) NOT NULL,<br>
    email VARCHAR(50) NOT NULL,<br>
    nickname VARCHAR(50) NOT NULL,<br>
    idade INT NOT NULL,<br>
    pais VARCHAR(50) NOT NULL<br>
);<br><br>

-- TABELA JOGO<br>
CREATE TABLE jogo (<br>
    id INT AUTO_INCREMENT PRIMARY KEY,<br>
    nome VARCHAR(50) NOT NULL,<br>
    genero VARCHAR(50) NOT NULL,<br>
    desenvolvedora VARCHAR(50) NOT NULL,<br>
    preco DOUBLE NOT NULL,<br>
    dataLancamento DATE<br>
);<br><br>

-- TABELA BIBLIOTECA<br>
CREATE TABLE biblioteca (<br>
    id INT AUTO_INCREMENT PRIMARY KEY,<br>
    jogador_id INT,<br>
    jogo_id INT,<br>
    horasJogadas INT NOT NULL,<br>
    dataCompra DATETIME NOT NULL,<br>
    FOREIGN KEY (jogador_id) REFERENCES jogador(id),<br>
    FOREIGN KEY (jogo_id) REFERENCES jogo(id)<br>
);<br><br>

-- TABELA AVALIACAO<br>
CREATE TABLE avaliacao (<br>
    id INT AUTO_INCREMENT PRIMARY KEY,<br>
    jogador_id INT,<br>
    jogo_id INT,<br>
    nota INT,<br>
    comentario TEXT,<br>
    data_avaliacao DATE,<br>
    FOREIGN KEY (jogador_id) REFERENCES jogador(id),<br>
    FOREIGN KEY (jogo_id) REFERENCES jogo(id)<br>
);<br><br>

-- TABELA CONQUISTA<br>
CREATE TABLE conquista (<br>
    id INT AUTO_INCREMENT PRIMARY KEY,<br>
    jogo_id INT,<br>
    titulo VARCHAR(100),<br>
    descricao TEXT,<br>
    pontos INT,<br>
    FOREIGN KEY (jogo_id) REFERENCES jogo(id)<br>
);<br>
