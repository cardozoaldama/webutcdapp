create table usuario(
	idusuario numeric(9,0) not null,
	nombre character varying(50) not null,
	clave character varying(50) not null,
	activo character varying(1) not null,
	usuario_inicio_sesion  character varying(25) null,
	fecha_inicio_sesion timestamp without time zone null,
	usuario_fin_sesion character varying(25) null,
	fecha_fin_sesion timestamp without time zone null,
	constraint "usuario-idusuario_pk" primary key (idusuario)
) with (
	oids = false
);

create sequence usuario_seq
increment 1
minvalue 1
maxvalue 9223372036854775807
start 100
cache 1;

insert into usuario 
values (1,'fer','123',1,'prueba1','2023-11-21 09:00:00','','2024-11-21  19:00:00'),
       (2,'mario','456',2,'prueba2','2023-11-21 09:00:00','','2024-11-21  18:00:00'),
       (3,'pablo','789',3,'prueba3','2023-11-21 09:00:00','','2024-11-21 17:00:00'),
	   (4,'laura','101',4,'prueba4','2023-11-21 09:00:00','','2024-11-21 21:00:00');