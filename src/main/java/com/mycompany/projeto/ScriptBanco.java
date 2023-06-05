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
//    nomeItem varchar(255),
//    validade date
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
///* Inserindo dados nas tabelas */
//insert into tblUsuario (Nome,Email,Senha,Perfil) values ('Richard','admin@admin','123','admin');
//insert into tblUsuario (Nome,Email,Senha,Perfil) values ('Matheus','doador@doador','123','doador');
//insert into tblUsuario (Nome,Email,Senha,Perfil) values ('Gustavo','donatario@donatario','123','donatario');
//insert into tblUsuario (Nome,Email,Senha,Perfil) values ('Geraldo','doador123','123','doador');
//
//insert into tblCesta(qntItens) values (1);
//insert into tblCesta(qntItens) values (2);
//insert into tblCesta(qntItens) values (3);
//insert into tblCesta(qntItens) values (4);
//
//insert into tblItem(nomeItem,validade) values("Arroz",'2023-10-31');
//insert into tblItem(nomeItem,validade) values("Feijao",'2023-08-17');
//insert into tblItem(nomeItem,validade) values("Macarrão",'2023-05-15');
//insert into tblItem(nomeItem,validade) values("Bolacha",'2023-02-19');
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
//--UPDATE tblItem SET validade = '2023-02-19' WHERE idItem = 4;
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
