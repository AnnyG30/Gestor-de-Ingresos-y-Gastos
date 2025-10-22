CREATE DATABASE ingresos_gastos;
use ingresos_gastos;


CREATE TABLE clientes (
id_cliente 	INT AUTO_INCREMENT,
nombre VARCHAR (100),
apellido VARCHAR (100),
correo VARCHAR(255),
PRIMARY KEY (id_cliente)
);


CREATE TABLE ingresos (
id_ingreso  INT AUTO_INCREMENT,
id_cliente 	INT,
fecha_ingreso DATETIME,
categoria VARCHAR (255),
monto DECIMAL(10,2), 
descripcion VARCHAR (255),
PRIMARY KEY (id_ingreso),
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

CREATE TABLE gastos (
id_gasto INT AUTO_INCREMENT,
id_cliente 	INT,
fecha_ingreso DATETIME,
categoria VARCHAR (255),
monto DECIMAL(10,2), 
descripcion VARCHAR (255),
PRIMARY KEY (id_gasto),
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

CREATE TABLE ahorro (
id_ahorro INT AUTO_INCREMENT,
id_cliente 	INT,
monto DECIMAL(10,2), 
fecha_ahorro DATETIME,
PRIMARY KEY (id_ahorro),
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);