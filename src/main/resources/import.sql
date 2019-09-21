
insert into usuarios(username,password,enabled, nombre_usuario) values ('andres','$2a$10$5pAOyS7Kdl0Bam4ZmjD0VOVBO6qx804V0pfTHSfxdKIw5DozkiX1m',1,'andres');
insert into usuarios(username,password,enabled, nombre_usuario) values ('admin','$2a$10$Dbu3h9mNP4XkIG6Km3hjA.zdhGKuBCxBWBdTlNGdtAqkgMQp6H676',1,'admin');
insert into usuarios(username,password,enabled, nombre_usuario) values ('lala','$2a$10$Dbu3h9mNP4XkIG6Km3hjA.zdhGKuBCxBWBdTlNGdtAqkgMQp6H676',1,'lala');




INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_usuario) values (null,1,'descripcion','2003-09-02',1,'incorporacion','alta',3);
INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_usuario) values (null,'descripcion','2008-03-03','motivo principal','submotivo',1);
INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_usuario) values (null,'descripcion','2008-03-03','motivo principal','submotivo',2);
INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_usuario) values (null,'descripuuucion','2001-03-03','motivo principal','submotivo',1);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_usuario) values (null,1,'descripcion','2003-09-02',1,'incorporacion','alta',1);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_usuario) values (null,1,'descripcion','2003-09-02',1,'incorporacion','alta',2);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_usuario) values (null,1,'descripcion des','2003-09-02',1,'incorporacion','alta',1);
INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_usuario) values (null,'descrwqwqipcion','2001-03-03','motivo principal','submotivo',2);

INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'descripcion_conflicto','2004-08-01','paro','sueldo bajo',1);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'descripcion_conflickljlkjlk lkjto','2004-08-01','paro','sueldo bajo',1);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'descripcion_conflmmmmmmicto','2004-08-01','paro','sueldo bajo',1);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'dsdsdsdfsdfsdfsdfsadf dsfsdfsdf','2004-08-01','paro','sueldo bajo',2);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'descripcion_conflicto','2004-08-01','paro','sueldo bajo',2);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'descripcion_confsslicto','2004-08-01','paro','sueldo bajo',2);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'descripcion_conflizzxcto','2004-08-01','paro','sueldo bajo',2);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'descripcion_confliccccto','2004-08-01','paro','sueldo bajo',2);




INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Directo');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Subcontratado');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Pasantia o Beca');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Monotributista');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Subvencionado');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Contrato temporario');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Jubilado');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Por agencia');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Persona con discapacidad');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','No registrados');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Otro');                  


insert into roles (nombre) values ('ROLE_USER');
insert into roles (nombre) values ('ROLE_ADMIN');

insert into usuarios_roles (usuario_id, roles_id) values (1,1);
insert into usuarios_roles (usuario_id, roles_id) values (1,2);
insert into usuarios_roles (usuario_id, roles_id) values (2,2);
insert into usuarios_roles (usuario_id, roles_id) values (2,1);


CREATE or REPLACE VIEW historial
AS
SELECT 
	'VAR',
	motivo,
	cantidad,
	tp.nombre_contrato,
	tipo_incorporacion,
	tipo_variacion,
	vl.descripcion,
	id_usuario,
	null AS medida,
	fecha
		FROM variacion_laboral vl
		INNER JOIN tipo_contrato tp
		ON tp.id_tipo_contrato = vl.id_tipo_contrato
	UNION	
	SELECT
	'CAMB',
	motivo_principal,
	null,
	null,
	null,
	null,
	descripcion,
	id_usuario,
	null,
	fecha
		FROM cambio_laboral 
	UNION
	SELECT 
	'CONF',
	motivo,
	null,
	null,
	null,
	null,
	descripcion,
	id_usuario,
	medida,
	fecha
		FROM conflicto_laboral;

