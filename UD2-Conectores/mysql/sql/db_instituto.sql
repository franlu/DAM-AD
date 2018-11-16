-- ******************************************************
-- ****** C1_CENTROS, C1_PROFESORES, C1_ESPECIALIDAD, C1_ASIGNATURAS, C1_ASIGPROF
-- *******************************************************

--------------------------------------------------------------------
-- SQLITE
--------------------------------------------------------------------


DROP TABLE IF EXISTS C1_ASIGPROF ;
DROP TABLE IF EXISTS C1_PROFESORES ;
DROP TABLE IF EXISTS C1_ESPECIALIDAD ;
DROP TABLE IF EXISTS C1_ASIGNATURAS ;
DROP TABLE IF EXISTS C1_CENTROS ;

-- Create Tables --
CREATE TABLE C1_ASIGNATURAS
(
	COD_ASIG CHAR(6) NOT NULL PRIMARY KEY,
	NOMBRE_ASI VARCHAR(30)
) ;

CREATE TABLE C1_CENTROS
(
	COD_CENTRO NUMERIC(4) NOT NULL PRIMARY KEY ,
	NOM_CENTRO VARCHAR(20),
	DIRECTOR NUMERIC(4),
	DIRECCION VARCHAR(25),
	LOCALIDAD VARCHAR(20),
	PROVINCIA VARCHAR(20)

) ;

CREATE TABLE C1_ESPECIALIDAD
(
	ESPECIALIDAD CHAR(2) NOT NULL PRIMARY KEY,
	NOMBRE_ESPE VARCHAR(25)
) ;

CREATE TABLE C1_PROFESORES
(
	COD_PROF NUMERIC(4) NOT NULL PRIMARY KEY, 
	NOMBRE_APE VARCHAR(30),
	ESPECIALIDAD CHAR(2) REFERENCES C1_ESPECIALIDAD(ESPECIALIDAD ),
	JEFE_DEP NUMERIC(4),
	FECHA_NAC DATE,
	SEXO CHAR(1),
	COD_CENTRO NUMERIC(4) NOT NULL REFERENCES C1_CENTROS (COD_CENTRO)
) ;

CREATE TABLE C1_ASIGPROF
(
	COD_ASIG CHAR(6) NOT NULL REFERENCES C1_ASIGNATURAS (COD_ASIG),
	COD_PROF NUMERIC(4) NOT NULL REFERENCES C1_PROFESORES (COD_PROF),
    PRIMARY KEY (COD_ASIG,COD_PROF)
) ;

-- ***************************************************
----------------- inserción de datos ------------------
-- *********************************** TABLA C1_CENTROS
begin transaction;

INSERT INTO C1_CENTROS VALUES (1000,'IES El Quijote', 1000,
'Avda. Los Molinos 25', 'GUADALAJARA', 'GUADALAJARA');

INSERT INTO C1_CENTROS VALUES (1015,'CP Los Danzantes', 1010,
'C/Las Musas s/n','PASTRANA', 'GUADALAJARA');

INSERT INTO C1_CENTROS VALUES (1022, 'IES Planeta Tierra',2000, 
 'C/Mina 45', 'AZUQUECA', 'GUADALAJARA');

INSERT INTO C1_CENTROS VALUES (1045, 'CP Manuel Hidalgo', NULL, 
  'C/Granada 5', 'GUADALAJARA', 'GUADALAJARA');

INSERT INTO C1_CENTROS VALUES (1050, 'IES Antoñete', NULL,
  'C/Los Toreros 21', 'SIGUENZA', 'GUADALAJARA');


-- *********************************** TABLA C1_ESPECIALIDAD
insert into C1_ESPECIALIDAD VALUES ('IF','Informática');
insert into C1_ESPECIALIDAD VALUES ('IN','Inglés');
insert into C1_ESPECIALIDAD VALUES ('FQ','Física y Química');
insert into C1_ESPECIALIDAD VALUES ('GH','Geografía e Historia');
insert into C1_ESPECIALIDAD VALUES ('TG','Tecnología');
insert into C1_ESPECIALIDAD VALUES ('LG','Lengua');
insert into C1_ESPECIALIDAD VALUES ('DB','Dibujo');
insert into C1_ESPECIALIDAD VALUES ('MT','Matemáticas');

-- *********************************** TABLA C1_ASIGNATURAS

insert into C1_ASIGNATURAS VALUES ('IF0001','DAHC');
insert into C1_ASIGNATURAS VALUES ('IF0002','RAL');
insert into C1_ASIGNATURAS VALUES ('IF0003','IMSI');
insert into C1_ASIGNATURAS VALUES ('IF0004','DPEG');
insert into C1_ASIGNATURAS VALUES ('IF0006','PLE');
insert into C1_ASIGNATURAS VALUES ('IF0007','FPE');

insert into C1_ASIGNATURAS VALUES ('LG0001','Lengua 1 ESO');
insert into C1_ASIGNATURAS VALUES ('LG0002','Lengua 2 ESO');
insert into C1_ASIGNATURAS VALUES ('LG0003','Lengua 3 ESO');
insert into C1_ASIGNATURAS VALUES ('LG0004','Lengua 4 ESO');

insert into C1_ASIGNATURAS VALUES ('DB0001','Plástica');
insert into C1_ASIGNATURAS VALUES ('DB0002','Taller cerámica');
insert into C1_ASIGNATURAS VALUES ('DB0003','Dibujo Técnico');

insert into C1_ASIGNATURAS VALUES ('MT0001','Matemáticas 1 BAC');
insert into C1_ASIGNATURAS VALUES ('MT0002','Matemáticas 2 BAC');

-- *********************************** TABLA C1_PROFESORES

INSERT INTO C1_PROFESORES VALUES (1000, 
'Martínez Salas, Fernando', 'IF', 1001, '1961-09-07', 'H', 1000);

INSERT INTO C1_PROFESORES VALUES (1001, 
'Bueno Zarco, Elisa', 'IF',NULL, '1960-02-17', 'M', 1000);

INSERT INTO C1_PROFESORES VALUES (2002, 
'Rivera Silvestre, Ana','DB',3000, '1950-10-10', 'M',1000);

INSERT INTO C1_PROFESORES VALUES (3000,  
'De Lucas Fdez, M.Angel','DB',NULL, '1980-09-09','M',1000);


INSERT INTO C1_PROFESORES VALUES (1010, 
'Montes García, M.Pilar', 'MT', 1011,'1970-10-10', 'M', 1015);

INSERT INTO C1_PROFESORES VALUES (1011, 
'Arroba Conde, Manuel', 'MT', NULL,'1970-10-12', 'H', 1015);

INSERT INTO C1_PROFESORES VALUES (1022, 
'Ruiz Lafuente, Manuel','MT',1011, '1966-11-11', 'H',1015);


INSERT INTO C1_PROFESORES VALUES (2000, 
'Ramos Ruiz, Luis','LG',2003, '1963-08-08', 'H',1022 );

INSERT INTO C1_PROFESORES VALUES (2003, 
'Segura Molina, Irene','LG',NULL, '1963-07-08', 'M',1022 );

INSERT INTO C1_PROFESORES VALUES (1045, 
'Serrano Laguía, María','IF',NULL,'1976-01-02', 'M', 1022);


-- *********************************** TABLA C1_ASIGPROF


insert into C1_ASIGPROF VALUES ('IF0002',1001);
insert into C1_ASIGPROF VALUES ('IF0003',1001);
insert into C1_ASIGPROF VALUES ('IF0001',1000);

insert into C1_ASIGPROF VALUES ('LG0001',2000);
insert into C1_ASIGPROF VALUES ('LG0002',2000);
insert into C1_ASIGPROF VALUES ('LG0003',2003);
insert into C1_ASIGPROF VALUES ('LG0004',2003);

insert into C1_ASIGPROF VALUES ('DB0001',2002);
insert into C1_ASIGPROF VALUES ('DB0002',2002);
insert into C1_ASIGPROF VALUES ('DB0003',3000);

insert into C1_ASIGPROF VALUES ('MT0001',1010);
insert into C1_ASIGPROF VALUES ('MT0001',1011);
insert into C1_ASIGPROF VALUES ('MT0001',1022);
insert into C1_ASIGPROF VALUES ('MT0002',1010);

commit;


