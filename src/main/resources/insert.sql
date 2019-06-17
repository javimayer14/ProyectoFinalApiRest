INSERT INTO delegado (id_delegado, actividad, antiguedad, apellido_usuario, cct, cct_nro,  codigo_postal, contrasenia, cuit, descripcion, dni, telefono, telefono_celular, nombre_usuario, nombre_empresa) values (null,'sdf',2,'sdf','sdf',null,null,null,null,null, 39876765, 43234564, 2332212, 'juan', 'grupo mercel');
INSERT INTO delegado (id_delegado, actividad, antiguedad, apellido_usuario, cct, cct_nro,  codigo_postal, contrasenia, cuit, descripcion, dni, telefono, telefono_celular, nombre_usuario, nombre_empresa) values (null,'sdf',2,'sdf','sdf',null,null,null,null,null, 39876765, 43234564, 2332212, 'leon', 'fusap');
INSERT INTO delegado (id_delegado, actividad, antiguedad, apellido_usuario, cct, cct_nro,  codigo_postal, contrasenia, cuit, descripcion, dni, telefono, telefono_celular, nombre_usuario) values (null,'sdf',2,'sdf','sdf',null,null,null,null,null, 39876765, 43234564, 2332212, 'pepe');


INSERT INTO cambio_laboral (id_cambio_condicion,descripcion,fecha,motivo_principal,sub_motivo,id_delegado) values (null,'descripcion','2001-03-03','motivo principal','submotivo',1);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_motivo,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_delegado) values (null,1,'descripcion','2003-09-02',1,1,'incorporacion','alta',1);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_motivo,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_delegado) values (null,1,'descripcion','2003-09-02',1,1,'incorporacion','alta',2);
INSERT INTO variacion_laboral (id_variacion,cantidad,descripcion,fecha,id_motivo,id_tipo_contrato,tipo_incorporacion,tipo_variacion,id_delegado) values (null,1,'descripcion','2003-09-02',1,1,'incorporacion','alta',3);
INSERT INTO conflicto_laboral (id_conflicto,descripcion,fecha,medida,motivo,id_delegado) values (null,'descripcion_conflicto','2004-08-01','paro','sueldo bajo',1);



INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Directo');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Subcontratado');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Pasantía o Beca');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Monotributista');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Subvencionado');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion',' Contrato temporario');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Jubilado');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Tercerizado');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Por agencia');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','Persona con discapacidad');
INSERT INTO tipo_contrato (id_tipo_contrato,descripcion,nombre_contrato) values (null,'descripcion','En negro');


insert into usuarios(username,password,enabled) values ('andres','$2a$10$5pAOyS7Kdl0Bam4ZmjD0VOVBO6qx804V0pfTHSfxdKIw5DozkiX1m
',1);
insert into usuarios(username,password,enabled) values ('admin','$2a$10$Dbu3h9mNP4XkIG6Km3hjA.zdhGKuBCxBWBdTlNGdtAqkgMQp6H676
',1);

insert into roles (nombre) values ('ROLE_USER');
insert into roles (nombre) values ('ROLE_ADMIN');

insert into usuarios_roles (usuario_id, roles_id) values (1,1);
insert into usuarios_roles (usuario_id, roles_id) values (2,2);
insert into usuarios_roles (usuario_id, roles_id) values (2,1);


