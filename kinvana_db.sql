drop database if exists kinvana_db;
create database kinvana_db;
use kinvana_db;
 
create table Clientes(
	codigocliente integer auto_increment,
    nombre varchar (64),
    apellido varchar (64),
    telefono varchar (16),
    correo varchar (128),
    genero enum ('masculino','femenino','no'),
    edad integer,
    constraint pk_cliente primary key (codigoCliente)
);

insert into Clientes(nombre, apellido, telefono, correo, genero, edad) values
('kevin','lopez','30070392','klopez@gmail.com','masculino',18);

select * from Clientes;