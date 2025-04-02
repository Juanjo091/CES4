-- Clientes con su cantidad de mascotas y sus nombres --
SELECT c.ClienteID, c.Nombre AS Cliente, COUNT(m.MascotaID) AS NumeroMascotas,
       STRING_AGG(m.Nombre, ', ') AS NombresMascotas
FROM Clientes c
         LEFT JOIN Mascotas m ON c.ClienteID = m.ClienteID
GROUP BY c.ClienteID, c.Nombre
ORDER BY NumeroMascotas DESC;

-- Medicamentos en stock y que cantidad hay--
SELECT MedicamentoID, Nombre, Stock_cant,
       CASE
           WHEN Stock_cant < 5 THEN 'Stock Bajo'
           ELSE 'Suficiente'
           END AS EstadoStock
FROM Medicamentos
ORDER BY Stock_cant ASC;

-- Cantidad de mascotas por su especie --
SELECT Especie, COUNT(*) AS Total
FROM Mascotas
GROUP BY Especie
ORDER BY Total DESC;

-- Mascotas en estado Crítico con la fecha de registro --
SELECT h.MascotaID, m.Nombre AS Mascota, h.FechaHora, h.Comentario
FROM HistorialEstados h
         JOIN Mascotas m ON h.MascotaID = m.MascotaID
         JOIN Estados e ON h.EstadoID = e.EstadoID
WHERE e.Nombre = 'Crítico'
ORDER BY h.FechaHora DESC;

-- Cantidad de aplicaciones de medicamentos realizadas --
SELECT e.EmpleadoID, e.Nombre AS Veterinario, COUNT(a.AplicacionID) AS TotalAplicaciones
FROM Aplicaciones a
         JOIN Empleados e ON a.EmpleadoID = e.EmpleadoID
WHERE a.FechaAplicacion BETWEEN '2024-01-01' AND '2024-12-31'
GROUP BY e.EmpleadoID, e.Nombre
ORDER BY TotalAplicaciones DESC;

-- Cambio en los estados de una mascota --
SELECT h.MascotaID, m.Nombre AS Mascota, e.Nombre AS Estado, h.FechaHora, h.Comentario
FROM HistorialEstados h
         JOIN Mascotas m ON h.MascotaID = m.MascotaID
         JOIN Estados e ON h.EstadoID = e.EstadoID
WHERE m.Nombre = 'Bulbasaur'
ORDER BY h.FechaHora;

-- Clientes con una mayor cantidad de visitas en un intervalo de tiempo --
SELECT c.ClienteID, c.Nombre AS Cliente, COUNT(a.AplicacionID) AS TotalVisitas
FROM Aplicaciones a
         JOIN Mascotas m ON a.MascotaID = m.MascotaID
         JOIN Clientes c ON m.ClienteID = c.ClienteID
WHERE a.FechaAplicacion >= NOW() - INTERVAL '8 months'
GROUP BY c.ClienteID, c.Nombre
ORDER BY TotalVisitas DESC;

-- Mascotas que necesitan vacunas en un mes --
SELECT a.MascotaID, m.Nombre AS Mascota, a.MedicamentoID, md.Nombre AS Medicamento, a.FechaAplicacion
FROM Aplicaciones a
         JOIN Mascotas m ON a.MascotaID = m.MascotaID
         JOIN Medicamentos md ON a.MedicamentoID = md.MedicamentoID
WHERE EXTRACT(MONTH FROM a.FechaAplicacion) = EXTRACT(MONTH FROM CURRENT_DATE)
  AND EXTRACT(YEAR FROM a.FechaAplicacion) = EXTRACT(YEAR FROM CURRENT_DATE)
ORDER BY a.FechaAplicacion;

-- Resumen de como se utilizo cada medicamento --
SELECT md.MedicamentoID, md.Nombre AS Medicamento, COUNT(a.AplicacionID) AS TotalAplicaciones,
       SUM(md.Stock_cant) AS StockUtilizado
FROM Aplicaciones a
         JOIN Medicamentos md ON a.MedicamentoID = md.MedicamentoID
GROUP BY md.MedicamentoID, md.Nombre
ORDER BY TotalAplicaciones DESC;

-- total de las ventas de un medicamento diariamente --
SELECT DATE(a.FechaAplicacion) AS Fecha,
    SUM(md.Precio) AS TotalVentas
FROM Aplicaciones a
    JOIN Medicamentos md ON a.MedicamentoID = md.MedicamentoID
GROUP BY DATE(a.FechaAplicacion)
ORDER BY Fecha DESC;

-- Tiempo que transcurrio entre estados --
SELECT h1.MascotaID, m.Nombre AS Mascota,
       MIN(h1.FechaHora) AS FechaConsulta,
       MIN(h2.FechaHora) AS FechaRecuperacion,
       AGE(MIN(h2.FechaHora), MIN(h1.FechaHora)) AS TiempoTranscurrido
FROM HistorialEstados h1
         JOIN HistorialEstados h2 ON h1.MascotaID = h2.MascotaID
         JOIN Mascotas m ON h1.MascotaID = m.MascotaID
         JOIN Estados e1 ON h1.EstadoID = e1.EstadoID
         JOIN Estados e2 ON h2.EstadoID = e2.EstadoID
WHERE e1.Nombre = 'Consulta'
  AND e2.Nombre IN ('Recuperándose', 'Dado de Alta')
GROUP BY h1.MascotaID, m.Nombre;

-- Desempeño de los veterinarios --
SELECT e.EmpleadoID, e.Nombre AS Veterinario,
       COUNT(DISTINCT a.AplicacionID) AS TotalTratamientos,
       COUNT(DISTINCT CASE WHEN e2.Nombre = 'Crítico' AND e3.Nombre = 'Estable' THEN h.MascotaID END) AS Recuperaciones
FROM Aplicaciones a
         JOIN Empleados e ON a.EmpleadoID = e.EmpleadoID
         JOIN HistorialEstados h ON h.EmpleadoID = e.EmpleadoID
         JOIN Estados e2 ON h.EstadoID = e2.EstadoID
         LEFT JOIN HistorialEstados h2 ON h.MascotaID = h2.MascotaID AND h2.FechaHora > h.FechaHora
         LEFT JOIN Estados e3 ON h2.EstadoID = e3.EstadoID
GROUP BY e.EmpleadoID, e.Nombre
ORDER BY TotalTratamientos DESC;