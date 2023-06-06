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
//UPDATE tblUsuario SET telefone = "888888888" WHERE idUsuario = 4;
///* Criando as tabelas */
//CREATE TABLE tblUsuario (
//    idUsuario int primary key auto_increment,
//    nome varchar(255),
//    email varchar(255),
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
//		references tblUsuario(idUsuario);
//
//alter table tblItemCesta
//	add column idCesta int,
//    add constraint FK_Cesta_ItemCesta
//		foreign key (idCesta)
//		references tblCesta(idCesta);
//        
//alter table tblItemCesta
//	add column idItem int,
//    add constraint FK_Item_ItemCesta
//		foreign key (idItem)
//		references tblItem(idItem);
//
//alter table tblItemUsuario
//	add column idUsuario int,
//    add constraint FK_Usuario_tblItemUsuario
//		foreign key (idUsuario)
//		references tblUsuario(idUsuario);
//        
//alter table tblItemUsuario
//	add column idItem int,
//    add constraint FK_Item_tblItemUsuario
//		foreign key (idItem)
//		references tblItem(idItem);
//
//
///* Inserindo dados com email para logar */
//insert into tblUsuario (Nome,Email,Senha,Perfil) values ('Richard','admin@admin','123','admin');
//insert into tblUsuario (Nome,Email,Senha,Perfil,Telefone) values ('Richard','doador@doador','123','doador','999999999');
//insert into tblUsuario (Nome,Email,Senha,cpf,Perfil) values ('Gustavo','donatario@donatario','123','00000000000','donatario');
//
//-- Insert para doador
//INSERT INTO tblUsuario (Nome, Senha, Telefone, Perfil)
//VALUES
//  ('Matheus', '123', '111111111', 'doador'),
//  ('Lucas', '123', '222222222', 'doador'),
//  ('Pedro', '123', '333333333', 'doador'),
//  ('Gabriel', '123', '444444444', 'doador'),
//  ('Mariana', '123', '555555555', 'doador'),
//  ('Julia', '123', '666666666', 'doador'),
//  ('Rafael', '123', '777777777', 'doador'),
//  ('Larissa', '123', '888888888', 'doador'),
//  ('Gustavo', '123', '999999999', 'doador'),
//  ('Isabela', '123', '101010101', 'doador'),
//  ('Daniel', '123', '121212121', 'doador'),
//  ('Manuela', '123', '131313131', 'doador'),
//  ('Ricardo', '123', '141414141', 'doador'),
//  ('Fernanda', '123', '151515151', 'doador'),
//  ('Caio', '123', '161616161', 'doador'),
//  ('Carolina', '123', '171717171', 'doador'),
//  ('Vitor', '123', '181818181', 'doador'),
//  ('Amanda', '123', '191919191', 'doador'),
//  ('Marcelo', '123', '202020202', 'doador'),
//  ('Renata', '123', '212121212', 'doador');
//
//
//-- Insert para donatario
//INSERT INTO tblUsuario (Nome, cpf, Perfil)
//VALUES
//  ('Gustavo', '11111111111', 'donatario'),
//  ('Mariana', '22222222222', 'donatario'),
//  ('Lucas', '33333333333', 'donatario'),
//  ('Isabela', '44444444444', 'donatario'),
//  ('Pedro', '55555555555', 'donatario'),
//  ('Ana', '66666666666', 'donatario'),
//  ('Rafaela', '77777777777', 'donatario'),
//  ('Leonardo', '88888888888', 'donatario'),
//  ('Carolina', '99999999999', 'donatario'),
//  ('Matheus', '10101010101', 'donatario'),
//  ('Amanda', '12121212121', 'donatario'),
//  ('Gabriel', '13131313131', 'donatario'),
//  ('Larissa', '14141414141', 'donatario'),
//  ('Bruno', '15151515151', 'donatario'),
//  ('Juliana', '16161616161', 'donatario'),
//  ('Ricardo', '17171717171', 'donatario'),
//  ('Natália', '18181818181', 'donatario'),
//  ('Marcelo', '19191919191', 'donatario'),
//  ('Letícia', '20202020202', 'donatario'),
//  ('Vitor', '21212121212', 'donatario');
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
//
//
//
//
//insert into tblCesta(qntItens) values (1);
//insert into tblCesta(qntItens) values (2);
//insert into tblCesta(qntItens) values (3);
//insert into tblCesta(qntItens) values (4);
//
//insert into tblItemCesta(idCesta,idItem) values(1,1);
//insert into tblItemCesta(idCesta,idItem) values(2,2);
//insert into tblItemCesta(idCesta,idItem) values(3,3);
//insert into tblItemCesta(idCesta,idItem) values(4,4);
//
//insert into tblItemUsuario(idUsuario,idItem) values(2,1);
//insert into tblItemUsuario(idUsuario,idItem) values(2,2);
//insert into tblItemUsuario(idUsuario,idItem) values(4,3);
//insert into tblItemUsuario(idUsuario,idItem) values(4,4);
//
//-- UPDATE tblItem SET validade = '2023-02-19' WHERE idItem = 4;
//
//
//
//
//
//
//
//
//
//
//
//
//
