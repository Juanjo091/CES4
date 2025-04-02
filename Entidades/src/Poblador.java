import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Poblador {

    public static List<Cliente> getClientes() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Ash Ketchum", "Pallet Town", "ash@pokemon.com", "123456789"));
        clientes.add(new Cliente(2, "Misty", "Cerulean City", "misty@pokemon.com", "987654321"));
        clientes.add(new Cliente(3, "Brock", "Pewter City", "brock@pokemon.com", "456789123"));
        clientes.add(new Cliente(4, "Jessie", "Team Rocket HQ", "jessie@pokemon.com", "789123456"));
        clientes.add(new Cliente(5, "James", "Team Rocket HQ", "james@pokemon.com", "321654987"));
        clientes.add(new Cliente(6, "Gary Oak", "Pallet Town", "gary@pokemon.com", "112233445"));
        clientes.add(new Cliente(7, "Tracey Sketchit", "Orange Islands", "tracey@pokemon.com", "556677889"));
        clientes.add(new Cliente(8, "Nurse Joy", "Pokémon Center", "joy@pokemon.com", "999888777"));
        clientes.add(new Cliente(9, "Officer Jenny", "Viridian City", "jenny@pokemon.com", "101010101"));
        clientes.add(new Cliente(10, "Professor Oak", "Pallet Town", "oak@pokemon.com", "202020202"));

        return clientes;
    }

    public static List<Mascota> getMascotas() {
        List<Mascota> mascotas = new ArrayList<>();

        mascotas.add(new Mascota(1, "Pikachu", "Electric", LocalDate.of(2020, 5, 15)));
        mascotas.add(new Mascota(2, "Charizard", "Fire/Flying", LocalDate.of(2019, 8, 20)));
        mascotas.add(new Mascota(3, "Bulbasaur", "Grass/Poison", LocalDate.of(2021, 3, 10)));
        mascotas.add(new Mascota(4, "Starmie", "Water/Psychic", LocalDate.of(2020, 7, 5)));
        mascotas.add(new Mascota(5, "Psyduck", "Water", LocalDate.of(2022, 1, 12)));
        mascotas.add(new Mascota(6, "Golduck", "Water", LocalDate.of(2021, 9, 30)));
        mascotas.add(new Mascota(7, "Onix", "Rock/Ground", LocalDate.of(2018, 11, 18)));
        mascotas.add(new Mascota(8, "Geodude", "Rock/Ground", LocalDate.of(2023, 4, 22)));
        mascotas.add(new Mascota(9, "Meowth", "Normal", LocalDate.of(2022, 6, 14)));
        mascotas.add(new Mascota(10, "Arbok", "Poison", LocalDate.of(2020, 12, 1)));
        mascotas.add(new Mascota(11, "Growlie", "Poison", LocalDate.of(2021, 2, 8)));
        mascotas.add(new Mascota(12, "Weezing", "Poison", LocalDate.of(2019, 5, 25)));
        mascotas.add(new Mascota(13, "Eevee", "Normal", LocalDate.of(2023, 8, 17)));
        mascotas.add(new Mascota(14, "Marill", "Water/Fairy", LocalDate.of(2022, 11, 3)));

        return mascotas;
    }

    public static List<Medicamento> getMedicamentos() {
        List<Medicamento> medicamentos = new ArrayList<>();
        medicamentos.add(new Medicamento(1, "Antibiótico", 50, 12.5, LocalDate.of(2024, 5, 20)));
        medicamentos.add(new Medicamento(2, "Vacuna Rabia", 30, 25.0, LocalDate.of(2025, 3, 15)));
        medicamentos.add(new Medicamento(3, "Desparasitante", 100, 8.0, LocalDate.of(2023, 12, 31)));
        medicamentos.add(new Medicamento(4, "Antiinflamatorio", 45, 18.75, LocalDate.of(2024, 8, 10)));
        medicamentos.add(new Medicamento(5, "Analgesico", 70, 9.99, LocalDate.of(2024, 9, 5)));
        medicamentos.add(new Medicamento(6, "Vitaminas", 200, 4.50, LocalDate.of(2025, 1, 1)));
        medicamentos.add(new Medicamento(7, "Suero", 25, 30.0, LocalDate.of(2024, 7, 22)));
        medicamentos.add(new Medicamento(8, "Pomada Antifúngica", 60, 15.20, LocalDate.of(2024, 11, 30)));
        medicamentos.add(new Medicamento(9, "Antiparasitario", 80, 10.0, LocalDate.of(2024, 12, 15)));
        medicamentos.add(new Medicamento(10, "Sedante", 15, 45.0, LocalDate.of(2024, 10, 10)));

        return medicamentos;
    }

    public static List<Empleado> getEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1, "Juan Pérez", "Veterinario"));
        empleados.add(new Empleado(2, "Ana Gómez", "Asistente"));
        empleados.add(new Empleado(3, "Carlos Ruiz", "Farmacéutico"));
        empleados.add(new Empleado(4, "María López", "Recepcionista"));
        empleados.add(new Empleado(5, "Luis Fernández", "Veterinario"));
        empleados.add(new Empleado(6, "Sofía Martínez", "Técnico de Laboratorio"));

        return empleados;
    }

    public static List<Estado> getEstados() {
        List<Estado> estados = new ArrayList<>();
        estados.add(new Estado(1, "En tratamiento"));
        estados.add(new Estado(2, "Recuperado"));
        estados.add(new Estado(3, "Pendiente"));
        estados.add(new Estado(4, "En observación"));
        estados.add(new Estado(5, "Crítico"));
        estados.add(new Estado(6, "Alta"));
        estados.add(new Estado(7, "Cirugía programada"));

        return estados;
    }

    public static List<AplicacionMedicamento> getAplicaciones() {
        List<AplicacionMedicamento> aplicaciones = new ArrayList<>();
        aplicaciones.add(new AplicacionMedicamento(1, "Primera dosis", LocalDate.of(2023, 10, 1)));
        aplicaciones.add(new AplicacionMedicamento(2, "Vacuna anual", LocalDate.of(2023, 11, 15)));
        aplicaciones.add(new AplicacionMedicamento(3, "Desparasitación mensual", LocalDate.of(2023, 12, 1)));
        aplicaciones.add(new AplicacionMedicamento(4, "Antiinflamatorio post-cirugía", LocalDate.of(2023, 9, 20)));
        aplicaciones.add(new AplicacionMedicamento(5, "Vitaminas para pelaje", LocalDate.of(2023, 10, 10)));
        aplicaciones.add(new AplicacionMedicamento(6, "Suero para deshidratación", LocalDate.of(2023, 11, 5)));
        aplicaciones.add(new AplicacionMedicamento(7, "Pomada para hongos", LocalDate.of(2023, 12, 10)));
        aplicaciones.add(new AplicacionMedicamento(8, "Antiparasitario mensual", LocalDate.of(2023, 9, 30)));
        aplicaciones.add(new AplicacionMedicamento(9, "Sedante para viaje", LocalDate.of(2023, 10, 15)));
        aplicaciones.add(new AplicacionMedicamento(10, "Vacuna anual", LocalDate.of(2023, 11, 30)));
        aplicaciones.add(new AplicacionMedicamento(11, "Vitaminas para pelaje", LocalDate.of(2023, 12, 5)));
        aplicaciones.add(new AplicacionMedicamento(12, "Suero para deshidratación", LocalDate.of(2023, 9, 25)));
        aplicaciones.add(new AplicacionMedicamento(14, "Antiinflamatorio post-cirugía", LocalDate.of(2023, 10, 30)));
        aplicaciones.add(new AplicacionMedicamento(15, "Desparasitante mensual", LocalDate.of(2023, 11, 1)));
        aplicaciones.add(new AplicacionMedicamento(16, "Vacuna contra rabia", LocalDate.of(2023, 12, 15)));
        aplicaciones.add(new AplicacionMedicamento(17, "Vitaminas para pelaje", LocalDate.of(2023, 12, 20)));
        aplicaciones.add(new AplicacionMedicamento(18, "Antiparasitario mensual", LocalDate.of(2023, 12, 25)));
        aplicaciones.add(new AplicacionMedicamento(19, "Suero para deshidratación", LocalDate.of(2023, 10, 12)));
        aplicaciones.add(new AplicacionMedicamento(20, "Sedante para procedimiento médico", LocalDate.of(2023, 11, 10)));

        return aplicaciones;
    }

    public static void asociarAplicaciones(
            List<AplicacionMedicamento> aplicaciones,
            List<Mascota> mascotas,
            List<Medicamento> medicamentos,
            List<Empleado> empleados) {

        // Asignación de aplicaciones a medicamentos, mascotas y empleados
        asignarAplicacion(aplicaciones, 0, medicamentos.get(0), mascotas.get(0), empleados.get(0));  // antibiótico - Pikachu - Juan
        asignarAplicacion(aplicaciones, 1, medicamentos.get(1), mascotas.get(3), empleados.get(1));  // vacuna Rabia - Starmie - Ana
        asignarAplicacion(aplicaciones, 2, medicamentos.get(2), mascotas.get(2), empleados.get(4));  // desparasitante - Bulbasaur - Luis
        asignarAplicacion(aplicaciones, 3, medicamentos.get(3), mascotas.get(1), empleados.get(0));  // antiinflamatorio - Charizard - Juan
        asignarAplicacion(aplicaciones, 4, medicamentos.get(5), mascotas.get(4), empleados.get(1));  // vitaminas - Psyduck - Ana
        asignarAplicacion(aplicaciones, 5, medicamentos.get(6), mascotas.get(5), empleados.get(4));  // suero - Golduck - Luis
        asignarAplicacion(aplicaciones, 6, medicamentos.get(7), mascotas.get(6), empleados.get(1));  // pomada - Onix - Ana
        asignarAplicacion(aplicaciones, 7, medicamentos.get(8), mascotas.get(7), empleados.get(0));  // antiparasitario - Geodude - Juan
        asignarAplicacion(aplicaciones, 8, medicamentos.get(9), mascotas.get(8), empleados.get(1));  // sedante - Meowth - Ana
        asignarAplicacion(aplicaciones, 9, medicamentos.get(1), mascotas.get(9), empleados.get(4));  // vacuna Rabia - Arbok - Luis
        asignarAplicacion(aplicaciones, 10, medicamentos.get(5), mascotas.get(10), empleados.get(1)); // vitaminas - Growlie - Ana
        asignarAplicacion(aplicaciones, 11, medicamentos.get(6), mascotas.get(11), empleados.get(0)); // suero - Weezing - Juan
        asignarAplicacion(aplicaciones, 12, medicamentos.get(7), mascotas.get(12), empleados.get(1)); // pomada - Eevee - Ana
        asignarAplicacion(aplicaciones, 13, medicamentos.get(8), mascotas.get(13), empleados.get(4)); // antiparasitario - Marill - Luis
        asignarAplicacion(aplicaciones, 14, medicamentos.get(9), mascotas.get(0), empleados.get(1));  // sedante - Pikachu - Ana
        asignarAplicacion(aplicaciones, 15, medicamentos.get(1), mascotas.get(3), empleados.get(4));  // vacuna Rabia - Starmie - Luis
        asignarAplicacion(aplicaciones, 16, medicamentos.get(5), mascotas.get(4), empleados.get(1));  // vitaminas - Psyduck - Ana
        asignarAplicacion(aplicaciones, 17, medicamentos.get(6), mascotas.get(5), empleados.get(0));  // suero - Golduck - Juan
        asignarAplicacion(aplicaciones, 18, medicamentos.get(7), mascotas.get(6), empleados.get(1));  // pomada - Onix - Ana
        asignarAplicacion(aplicaciones, 19, medicamentos.get(8), mascotas.get(7), empleados.get(4));  // antiparasitario - Geodude - Luis
        asignarAplicacion(aplicaciones, 20, medicamentos.get(1), mascotas.get(4), empleados.get(0));  // vacuna Rabia - Psyduck - Juan
    }

    private static void asignarAplicacion(
            List<AplicacionMedicamento> aplicaciones, int indice,
            Medicamento medicamento, Mascota mascota, Empleado empleado) {
            aplicaciones.get(indice).setMedicamento(medicamento);
            aplicaciones.get(indice).setMascota(mascota);
            aplicaciones.get(indice).setEmpleado(empleado);
    }



    public class HistorialEstadoService {

        public static List<HistorialEstado> getHistorialEstados(
                List<Mascota> mascotas,
                List<Empleado> empleados,
                List<Estado> estados) {

            // Asignación de referencias
            Empleado juan = empleados.get(0);
            Empleado ana = empleados.get(1);
            Empleado luis = empleados.get(4);

            Estado enTratamiento = estados.get(0);
            Estado recuperado = estados.get(1);
            Estado pendiente = estados.get(2);
            Estado enObservacion = estados.get(3);
            Estado critico = estados.get(4);
            Estado alta = estados.get(5);

            List<HistorialEstado> historialEstados = new ArrayList<>();

            // Creación de historial de estados
            historialEstados.add(crearHistorial(1, "2023-10-02", mascotas.get(0), enTratamiento, juan));
            historialEstados.add(crearHistorial(2, "2023-11-16", mascotas.get(3), recuperado, ana));
            historialEstados.add(crearHistorial(3, "2023-12-02", mascotas.get(1), alta, luis));
            historialEstados.add(crearHistorial(4, "2023-09-25", mascotas.get(2), enObservacion, juan));
            historialEstados.add(crearHistorial(5, "2023-10-05", mascotas.get(4), pendiente, ana));
            historialEstados.add(crearHistorial(6, "2023-11-20", mascotas.get(5), enTratamiento, juan));
            historialEstados.add(crearHistorial(7, "2023-12-05", mascotas.get(6), enTratamiento, ana));
            historialEstados.add(crearHistorial(8, "2023-09-30", mascotas.get(7), enTratamiento, luis));
            historialEstados.add(crearHistorial(9, "2023-10-15", mascotas.get(8), enTratamiento, juan));
            historialEstados.add(crearHistorial(10, "2023-11-30", mascotas.get(9), enTratamiento, ana));
            historialEstados.add(crearHistorial(11, "2023-12-05", mascotas.get(10), enTratamiento, luis));
            historialEstados.add(crearHistorial(12, "2023-09-25", mascotas.get(11), enTratamiento, juan));
            historialEstados.add(crearHistorial(13, "2023-10-05", mascotas.get(12), enTratamiento, ana));
            historialEstados.add(crearHistorial(14, "2023-11-10", mascotas.get(13), enTratamiento, luis));
            historialEstados.add(crearHistorial(15, "2023-12-15", mascotas.get(0), enTratamiento, juan));
            historialEstados.add(crearHistorial(16, "2023-11-25", mascotas.get(1), critico, juan));
            historialEstados.add(crearHistorial(17, "2023-12-10", mascotas.get(9), critico, ana));
            historialEstados.add(crearHistorial(18, "2023-12-20", mascotas.get(13), critico, luis));

            return historialEstados;
        }

        private static HistorialEstado crearHistorial(int id, String fecha, Mascota mascota, Estado estado, Empleado empleado) {
            return new HistorialEstado(id, LocalDate.parse(fecha), mascota, estado, empleado);
        }
    }
}
