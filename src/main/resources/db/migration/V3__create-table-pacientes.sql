create table pacientes(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    documento_identidad VARCHAR(14) NOT NULL UNIQUE,
    telefono VARCHAR(20) NOT NULL,
    urbanizacion VARCHAR(100) NOT NULL,
    distrito VARCHAR(100) NOT NULL,
    codigo_postal VARCHAR(9) NOT NULL,
    complemento VARCHAR(100),
    numero VARCHAR(20),
    provincia VARCHAR(100) NOT NULL,
    ciudad VARCHAR(100) NOT NULL,

    PRIMARY KEY(id)
);