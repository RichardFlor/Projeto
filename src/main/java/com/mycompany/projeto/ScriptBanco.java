//create database Projeto;
//use Projeto;
//
//-- drop database Projeto;
//
//show tables;
//select * from tblUsuario;
//select * from tblCesta;
//select * from tblItem;
//select * from tblItemCesta;
//select * from tblItemUsuario;
//
///* Criando as tabelas */
//CREATE TABLE tblUsuario (
//    idUsuario int primary key auto_increment,
//    nome varchar(255),
//    email varchar(255) unique,
//    senha varchar(255),
//    telefone varchar(15),
//    cpf varchar(15),
//    rua varchar(255),
//    bairro varchar(255),
//    numero varchar(255),
//    cep varchar(255),
//    cidade varchar(255),
//    perfil enum('admin','donatario','doador') not null
//);
//
//CREATE TABLE tblCesta(
//	idCesta int primary key auto_increment,
//    qntItens int
//);
//
//CREATE TABLE tblItemCesta(
//	idItemCesta int primary key auto_increment
//);
//
//CREATE TABLE tblItem(
//	idItem int primary key auto_increment,
//    nomeItem varchar(255) not null,
//    validade varchar(255) not null
//);
//
//CREATE TABLE tblItemUsuario(
//	idItemUsuario int primary key auto_increment
//);
//
///* Ligando a chave estrangeira nas tabelas */
//alter table tblCesta
//	add column idUsuario int,
//    add constraint FK_Usuario_Cesta
//		foreign key (idUsuario)
//		references tblUsuario(idUsuario) ON DELETE CASCADE ON UPDATE CASCADE;
//
//alter table tblItemCesta
//	add column idCesta int,
//    add constraint FK_Cesta_ItemCesta
//		foreign key (idCesta)
//		references tblCesta(idCesta)ON DELETE CASCADE ON UPDATE CASCADE;
//        
//alter table tblItemCesta
//	add column idItem int,
//    add constraint FK_Item_ItemCesta
//		foreign key (idItem)
//		references tblItem(idItem)ON DELETE CASCADE ON UPDATE CASCADE;
//
//alter table tblItemUsuario
//	add column idUsuario int,
//    add constraint FK_Usuario_tblItemUsuario
//		foreign key (idUsuario)
//		references tblUsuario(idUsuario)ON DELETE CASCADE ON UPDATE CASCADE;
//        
//alter table tblItemUsuario
//	add column idItem int,
//    add constraint FK_Item_tblItemUsuario
//		foreign key (idItem)
//		references tblItem(idItem)ON DELETE CASCADE ON UPDATE CASCADE;
//
//
///* Inserindo dados com email para logar */
//insert into tblUsuario (Nome,Email,Senha,Perfil) values ('Richard','admin@admin','123','admin');
//insert into tblUsuario (nome, email, senha, telefone, cpf, rua, bairro, numero, cep, cidade, perfil) values ('Leonardo', 'doador@doador', '123', '(11)98765-4321', '123.456.789-00', 'Rua A', 'Bairro X', '123', '12345-678', 'São Paulo', 'doador');
//insert into tblUsuario (nome, email, senha, telefone, cpf, rua, bairro, numero, cep, cidade, perfil) values ('Matheus','donatario@donatario','123','(11)98765-4321', '123.456.789-00', 'Rua A', 'Bairro X', '123', '12345-678', 'São Paulo','donatario');
//
//-- Insert para doador
//  INSERT INTO tblUsuario (nome, email, senha, telefone, cpf, rua, bairro, numero, cep, cidade, perfil)
//VALUES
//    ('João Silva', 'joao.silva@example.com', 'senha123', '(11)98765-4321', '123.456.789-00', 'Rua A', 'Bairro X', '123', '12345-678', 'São Paulo', 'doador'),
//    ('Maria Santos', 'maria.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Sophia', 'sohpia.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Gabriel Santos', 'gabriel.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Isabella Santos', 'isabella.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Lucas Santos', 'lucas.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Valentina Santos', 'valentina.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Matheus Santos', 'matheus.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Helena Santos', 'helena.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Rafael Santos', 'rafaela.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Laura Santos', 'laura.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Felipe Santos', 'felipe.santos@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','doador'),
//    ('Pedro Almeida', 'pedro.almeida@example.com', 'senha789', '(33)77777-6666', '111.222.333-44', 'Rua C', 'Bairro Z', '789', '54321-987', 'Belo Horizonte','doador');
//
//
//-- Insert para donatario
//  INSERT INTO tblUsuario (nome, email, senha, telefone, cpf, rua, bairro, numero, cep, cidade, perfil)
//VALUES
//    ('João Silva', 'joao@example.com', 'senha123', '(11) 98765-4321', '123.456.789-00', 'Rua A', 'Bairro X', '123', '12345-678', 'São Paulo', 'donatario'),
//    ('Maria Santos', 'maria.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Sophia', 'sophia.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Gabriel Santos', 'gabriiel.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Isabella Santos', 'isabella.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Lucas Santos', 'lucas.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Valentina Santos', 'valentina.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Matheus Santos', 'matheus.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Helena Santos', 'helena.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Rafael Santos', 'rafael.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Laura Santos', 'laura.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Felipe Santos', 'felipe.silva@example.com', 'senha456', '(22)99999-8888', '987.654.321-00', 'Rua B', 'Bairro Y', '456', '98765-432', 'Rio de Janeiro','donatario'),
//    ('Pedro Almeida', 'pedro.silva@example.com', 'senha789', '(33)77777-6666', '111.222.333-44', 'Rua C', 'Bairro Z', '789', '54321-987', 'Belo Horizonte','donatario');
//
//INSERT INTO tblItem (nomeItem, validade)
//VALUES
//  ('Arroz', '01/01/2023'),
//  ('Feijão', '15/03/2023'),
//  ('Macarrão', '22/06/2023'),
//  ('Azeite', '10/08/2023'),
//  ('Leite em pó', '05/11/2023'),
//  ('Café em grãos', '12/02/2024'),
//  ('Açúcar', '28/04/2024'),
//  ('Sal', '19/07/2024'),
//  ('Biscoitos', '03/10/2024'),
//  ('Enlatados', '20/12/2024'),
//  ('Massa de tomate', '07/03/2025'),
//  ('Farinha de trigo', '18/05/2025'),
//  ('Óleo vegetal', '09/08/2025'),
//  ('Cereais', '26/10/2025'),
//  ('Geleia', '12/01/2023'),
//  ('Café solúvel', '03/04/2023'),
//  ('Barras de cereal', '20/07/2023'),
//  ('Leite condensado', '08/09/2023'),
//  ('Leite em caixa', '25/11/2023'),
//  ('Chá', '12/02/2024');

