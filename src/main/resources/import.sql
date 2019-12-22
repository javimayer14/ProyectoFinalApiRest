

insert into usuarios(username,password,enabled, nombre_usuario) values ('andres','$2a$10$5pAOyS7Kdl0Bam4ZmjD0VOVBO6qx804V0pfTHSfxdKIw5DozkiX1m',1,'andres');
insert into usuarios(username,password,enabled, nombre_usuario) values ('admin','$2a$10$Dbu3h9mNP4XkIG6Km3hjA.zdhGKuBCxBWBdTlNGdtAqkgMQp6H676',1,'admin');
insert into usuarios(username,password,enabled, nombre_usuario) values ('lala','$2a$10$Dbu3h9mNP4XkIG6Km3hjA.zdhGKuBCxBWBdTlNGdtAqkgMQp6H676',1,'lala');




INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_usuario) values (null,1,'En el dia de la fecha se incorporaron dos trabajadores para el área de limpieza','2003-09-02',1,'incorporacion','alta',3);
INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_usuario) values (null,'Se produjeron cambios en los muebles de oficina. Se renovaron tambien todos los matafuegos','2008-03-03','cambio en los muebles de oficina','submotivo',1);
INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_usuario) values (null,'Se produjo un cambio en la jornada de trabajo de los trabajadores administrativos','2008-03-03','Cambio en la jornada','submotivo',2);
INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_usuario) values (null,'Cambio en la distribucion del area de trabajo debido al solapamiento de trabajo producido en distintas áreas','2001-03-03','Cambio en el área','submotivo',1);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_usuario) values (null,1,'Se incorporaron 3 nuevos trabajadores en el area de sistemas de la empresa','2003-09-02',1,'incorporacion','alta',1);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_usuario) values (null,1,'Se incorporo un nuevo trabajador para el area de seguridad e higiene','2003-09-02',1,'incorporacion','alta',2);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_usuario) values (null,1,'Incorporacion de dos nuevos trabajadores a medio tiempo en el area administrativa','2003-09-02',1,'incorporacion','alta',1);
INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_usuario) values (null,'Se reporta un cambio laboral respecto al almuerzo, a partir del dia de la fecha los trabajaores tendran el almuerzo gratis','2001-03-03','almuerzo gratis','submotivo',2);

INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'Problemas dentro del área de recursos humanos debido a la pelea entre dos trabajadoras por motivos personales','2004-08-01','paro','sueldo bajo',1);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'Problema de counicacion entre las distintas áreas debido al aisalamiento que existe entre ellas','2004-08-01','paro','sueldo bajo',1);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'Pelea por probema personales entre dos operarios','2004-08-01','paro','sueldo bajo',1);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'Mal ambiente laboral debido a supervisor estricto','2004-08-01','paro','sueldo bajo',2);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_usuario) values (null,'Mal entendidos por falta de comunicacion entre operarios y supervisores','2004-08-01','paro','sueldo bajo',2);
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


