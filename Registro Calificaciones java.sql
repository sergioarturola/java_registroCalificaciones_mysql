create database registro_calificaciones;
use registro_calificaciones;

create table alumnos(

   id_alumno int not null auto_increment primary key,
   nombre varchar(60) not null,
   evaluacion1 varchar(2) not null,
   evaluacion2 varchar(2) not null,
   evaluacion3 varchar(2) not null,
   estatus varchar(10) not null

);

