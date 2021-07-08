INSERT INTO tb_estado (uf) VALUES ('MS');

INSERT INTO tb_cidade (nome, id_estado_fk) 
VALUES 
('Dourados', 1),
('Campo Grande', 1),
('Naviraí', 1),
('Ponta Porã', 1),
('Itaquiraí', 1),
('Maracaju', 1),
('Rio Brilhante', 1),
('Nova Andradina', 1);

INSERT INTO tb_marca (descricao) 
VALUES 
('Toyota'),
('Volkswagen'),
('Ford'),
('Honda'),
('Hyundai'),
('Nissan'),
('Chevrolet'),
('Kia'),
('Fiat'),
('Renault');

INSERT INTO tb_modelo (descricao, id_marca_fk) 
VALUES 
('Duster', 10),
('Sandero', 10),
('Logan', 10),
('Amarok', 2),
('Gol', 2),
('SpaceFox', 2),
('Corolla', 1),
('Hilux Cabine Dupla', 1),
('SW4', 1),
('Grand Siena', 9),
('Fiorino', 9),
('Doblo', 9),
('Weekend', 9),
('Ducato', 9),
('Doblo Cargo', 9);

INSERT INTO tb_tipo (descricao) 
VALUES 
('Motocicleta'),
('Automóvel'),
('microônibus'),
('Ônibus'),
('Caminhonete'),
('Caminão'),
('Camioneta'),
('Utilitário');

INSERT INTO tb_autoposto (nome_fantasia, telefone, email, cnpj, endereco, id_cidade_fk) 
VALUES 
('Posto Petrobras', '(67)8121-5661', 'posto.petrobras@gmail.com', '00.000.000/0001-00', 'Av. Amambaí, 15 - Centro', 3),
('Mano Auto Posto', '(67)0000-0000', 'mano-autoposto@gmail.com', '00.000.000/0001-00', 'Av. Campo Grande, 155 - Centro', 3);

INSERT INTO tb_veiculo (ano, placa, renavan, patrimonio, chassi, versao, capacidade_tanque, tipo_combustivel, id_tipo_fk)
VALUES 
(2016, 'ABC 1234', '123456789', 'XPTO789', '9 BW SU19F0 8 B302 158', 'Hillux 2.8 TDI SR CD 4x4 (aut)', 69, 5, 5),
(2014, 'POI 7896', '987654321', 'XPTO123', '9 BW SU19F0 8 B302 158', 'Highline 2.0TDi 16v 4x4 C.D.', 69, 'GASOLINA', 5);

INSERT INTO tb_lotacao (descricao, email, site, telefone, endereco, id_cidade_fk)
VALUES 
('12º Batalhão de Polícia Militar', 'navirai@pm.ms.gov.br', 'www.pm.ms.gov.br', '(67) 3461-2145', 'Av. Fátima do Sul, 303 - Centro', 3);

INSERT INTO tb_lotacao_veiculo (lotacao_id, veiculo_id) VALUES (1, 1);

INSERT INTO tb_abastecimento (cpf_motorista, data_do_abastecimento, quilometragem, combustivel, quantidade_em_litros, 
valor_por_litro, id_autoposto_fk, id_veiculo_fk)
VALUES ('123.456.789-99', TIMESTAMP WITH TIME ZONE '2020-07-14T10:00:00Z', 000456L, 5, 40, 3.50, 1, 2);