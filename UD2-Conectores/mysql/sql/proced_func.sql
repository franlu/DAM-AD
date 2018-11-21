DELIMETER //
CREATE PROCEDURE subida_sal(d INT, subida INT)
BEGIN
UPDATE empleados SET salario = salario + subida WHERE dpto_no = d;
COMMIT;
END;
//


--
DELIMETER //
CREATE FUNCTION nombre_dep(d INT) RETURNS VARCHAR(15)
BEGIN
	DECLARE nombre VARCHAR(15);
	SET nombre = 'NO EXISTE';
	SELECT dnombre INTO nombre FROM departamentos
	WHERE dpto_no = d;
	RETURN NOMBRE;
END;
//


--Recibe un número de dpto y devuelve en forma de parámetros de salida nombre y localidad
DELIMETER //
CREATE PROCEDURE datos_dep(d INT, OUT nombre VARCHAR(15), OUT localidad VARCHAR(15))
BEGIN
	SET nombre = 'NO EXISTE';
	SET localidad = 'NO EXISTE';
	SELECT dnombre, loc INTO nombre, localidad FROM departamentos
	WHERE dpto_no = d;
END;
//