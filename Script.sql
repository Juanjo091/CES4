------ ELIMINAR -------
DROP TABLE IF EXISTS historial_estados CASCADE;
DROP TABLE IF EXISTS aplicaciones CASCADE;
DROP TABLE IF EXISTS medicamentos CASCADE;
DROP TABLE IF EXISTS empleados CASCADE;
DROP TABLE IF EXISTS mascotas CASCADE;
DROP TABLE IF EXISTS clientes CASCADE;
DROP TABLE IF EXISTS estados CASCADE;

------ TABLAS ------
CREATE TABLE Clientes (
ID bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
Nombre text,
Telefono text,
Correo text,
Direccion text
);

CREATE TABLE Mascotas (
id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
Nombre text,
Especie text,
Edad integer,
HistorialMedico text,
DuenoID bigint REFERENCES Clientes(ID)
);

CREATE TABLE Empleados (
ID bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
Nombre text,
Roles text,
Horario text
);

CREATE TABLE Medicamentos (
ID bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
Nombre text,
Stock_cant integer,
Precio numeric,
FechaVencimiento date
);

CREATE TABLE Aplicaciones (
AplicacionID BIGSERIAL PRIMARY KEY,
MascotaID BIGINT REFERENCES Mascotas(ID),
MedicamentoID BIGINT REFERENCES Medicamentos(ID),
veterinarioID BIGINT REFERENCES Empleados(ID),
FechaAplicacion TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
Comentario TEXT
);

CREATE TABLE Estados (
ID bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
Nombre text
);

CREATE TABLE HistorialEstados (
ID bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
MascotaID bigint REFERENCES Mascotas(ID),
EstadoID bigint REFERENCES Estados(ID),
FechaHora timestamp with time zone,
Comentario text,
VeterinarioID bigint REFERENCES Empleados(ID)
);

------  AÑADIR ------
INSERT INTO Clientes (Nombre, Telefono, Correo, Direccion) VALUES
('Ash Ketchum', '123456789', 'ash.ketchum@pokemon.com', 'Pueblo Paleta'),
('Misty Waterflower', '987654321', 'misty.waterflower@pokemon.com', 'Ciudad Celeste'),
('Brock Harrison', '456789123', 'brock.harrison@pokemon.com', 'Ciudad Pewter'),
('Gary Oak', '321654987', 'gary.oak@pokemon.com', 'Pueblo Paleta'),
('Tracey Sketchit', '654321789', 'tracey.sketchit@pokemon.com', 'Isla Orange');

INSERT INTO Mascotas (Nombre, Especie, Edad, HistorialMedico, DuenoID) VALUES
('Pikachu', 'Eléctrico', 5, 'Última visita: 2023-10-01, Medicamentos: Poción', 1),
('Bulbasaur', 'Planta', 4, 'Última visita: 2023-09-15, Medicamentos: Antídoto', 1),
('Charmander', 'Fuego', 3, 'Última visita: 2023-10-03, Medicamentos: Revitalizador', 1),
('Psyduck', 'Agua', 4, 'Última visita: 2023-09-20, Medicamentos: Poción', 2),
('Onix', 'Roca/Tierra', 6, 'Última visita: 2023-08-30, Medicamentos: Antídoto', 3),
('Squirtle', 'Agua', 2, 'Última visita: 2023-10-05, Medicamentos: Revitalizador', 2),
('Jigglypuff', 'Normal', 3, 'Última visita: 2023-09-25, Medicamentos: Poción', 4),
('Meowth', 'Normal', 5, 'Última visita: 2023-10-02, Medicamentos: Antídoto', 4),
('Eevee', 'Normal', 1, 'Última visita: 2023-10-04, Medicamentos: Revitalizador', 5),
('Gengar', 'Fantasma/Veneno', 7, 'Última visita: 2023-09-28, Medicamentos: Poción', 5);

INSERT INTO Empleados (Nombre, Roles, Horario) VALUES
('Professor Oak', 'Investigador', '9:00 AM - 5:00 PM'),
('Nurse Joy', 'Enfermera', '8:00 AM - 4:00 PM'),
('Officer Jenny', 'Policía', '10:00 AM - 6:00 PM'),
('Dr. Fuji', 'Veterinario', '9:00 AM - 5:00 PM'),
('Cynthia', 'Veterinario', '10:00 AM - 6:00 PM');

INSERT INTO Estados (Nombre) VALUES
('Consulta'),
('En Observación'),
('Estable'),
('Crítico'),
('Recuperándose'),
('Dado de Alta');

INSERT INTO Medicamentos (Nombre, Stock_cant, Precio, FechaVencimiento) VALUES
('Poción', 20, 300.00, '2024-12-31'),
('Antídoto', 15, 150.00, '2024-11-30'),
('Revitalizador', 10, 500.00, '2025-01-15'),
('Super Poción', 8, 600.00, '2024-10-20'),
('Hiper Poción', 5, 800.00, '2025-02-28');

INSERT INTO Aplicaciones (MascotaID, MedicamentoID, VeterinarioID, FechaAplicacion, Comentario) VALUES
(1, 1, 2, '2024-10-01 10:00:00+00', 'Aplicada para restaurar salud.'),
(2, 2, 2, '2024-09-15 11:00:00+00', 'Cura de envenenamiento.'),
(3, 3, 1, '2024-10-03 12:00:00+00', 'Restauración de salud.'),
(4, 1, 2, '2024-09-20 09:00:00+00', 'Aplicada para restaurar salud.'),
(5, 2, 1, '2024-08-30 08:30:00+00', 'Cura de envenenamiento.'),
(6, 3, 1, '2024-10-05 10:30:00+00', 'Restauración de salud.'),
(7, 1, 2, '2024-09-25 11:15:00+00', 'Aplicada para restaurar salud.'),
(8, 2, 1, '2024-10-02 09:45:00+00', 'Cura de envenenamiento.'),
(9, 3, 1, '2024-10-04 10:00:00+00', 'Restauración de salud.'),
(10, 1, 2, '2024-09-28 11:00:00+00', 'Aplicada para restaurar salud.');


INSERT INTO HistorialEstados (MascotaID, EstadoID, FechaHora, Comentario, VeterinarioID) VALUES
(1, 1, '2024-10-01 10:00:00+00', 'Consulta inicial.', 4),
(1, 3, '2024-10-02 10:00:00+00', 'Estable después de tratamiento.', 4),
(2, 1, '2024-09-15 11:00:00+00', 'Consulta inicial.', 4),
(3, 4, '2024-10-03 12:00:00+00', 'Crítico, necesita atención.', 4),
(4, 3, '2024-09-20 09:00:00+00', 'Estable después de tratamiento.', 4),
(5, 2, '2024-08-30 08:30:00+00', 'En observación.', 4),
(6, 5, '2024-10-05 10:30:00+00', 'Recuperándose.', 4),
(7, 1, '2024-09-25 11:15:00+00', 'Consulta inicial.', 4),
(8, 2, '2024-10-02 09:45:00+00', 'En observación.', 4),
(9, 3, '2024-10-04 10:00:00+00', 'Estable después de tratamiento.', 4),
(10, 4, '2024-09-28 11:00:00+00', 'Crítico, necesita atención.', 4);
