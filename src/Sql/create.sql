create database alunos
default character set utf8
default collate utf8_general_ci;

create table aluno(
cod_aluno int not null auto_increment,
nome varchar(100),
cpf varchar(11),
primary key(cod_aluno)

) default char set = utf8;

create table perfil(
id_perfil int auto_increment,
youtube varchar(100) null,
facebook varchar(100) null,
likedin varchar(100) null,
primary key(id_perfil)

) default char set = utf8;


create table endereco(
id_endereco int auto_increment,
rua varchar(50) not null,
numero int null,
bairro varchar(20) not null,
cidade varchar(20) not null,
estado varchar(20) not null,
complementos varchar(30),
primary key(id_endereco)

) default char set = utf8;

alter table aluno add column cod_perfil int not null unique;
alter table aluno 
add constraint fk_perfil 
foreign key(cod_perfil) references perfil(id_perfil);

alter table endereco add column cod_aluno int;
alter table endereco 
add constraint fk_aluno_endereco 
foreign key (cod_aluno) references endereco(id_endereco);

