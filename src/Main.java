import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        List<Cliente> clientes = Poblador.getClientes();
        List<Mascota> mascotas = Poblador.getMascotas();
        List<Medicamento> medicamentos = Poblador.getMedicamentos();
        List<Empleado> empleados = Poblador.getEmpleados();
        List<Estado> estados = Poblador.getEstados();
        List<HistorialEstado> historial = Poblador.getHistorialEstados(mascotas, empleados, estados);
        List<AplicacionMedicamento> aplicaciones = Poblador.getAplicaciones();

        Poblador.asociarMascotasAClientes(clientes, mascotas);
        Poblador.asociarAplicaciones(aplicaciones, mascotas, medicamentos, empleados);

        mostrarClientesYMascotas(clientes);
        mostrarStockDeMedicamentos(medicamentos);
        mostrarCantidadMascotasPorEspecie(mascotas);
        listarMascotasEnEstadoCritico(historial);
    }

    private static void mostrarClientesYMascotas(List<Cliente> clientes) {
        System.out.println("=====================================================");
        System.out.println("EJERCICIO 1 - Clientes y sus Mascotas");
        System.out.println("=====================================================");

        System.out.println("Clientes y número de mascotas:");
        clientes.forEach(cliente ->
                System.out.println(cliente.getNombre() + " tiene " + cliente.getMascotas().size() + " mascota(s)."));

        System.out.println("=====================================================");
        System.out.println("Clientes y nombres de sus mascotas:");
        clientes.forEach(cliente -> {
            String nombresMascotas = cliente.getMascotas().stream()
                    .map(Mascota::getNombre)
                    .collect(Collectors.joining(", "));

            System.out.println(cliente.getNombre() + " tiene " + cliente.getMascotas().size() + " mascota(s): " + nombresMascotas);
        });
    }

    private static void mostrarStockDeMedicamentos(List<Medicamento> medicamentos) {
        System.out.println("=====================================================");
        System.out.println("EJERCICIO 2 - Stock de Medicamentos");
        System.out.println("=====================================================");

        medicamentos.forEach(med -> {
            String estadoStock = med.getCantidadStock() <= 20 ? "STOCK BAJO" : "";
            System.out.printf("• %s - %d unidades %s%n", med.getNombre(), med.getCantidadStock(), estadoStock);
        });
    }

    private static void mostrarCantidadMascotasPorEspecie(List<Mascota> mascotas) {
        System.out.println("=====================================================");
        System.out.println("EJERCICIO 3 - Cantidad de Mascotas por Especie");
        System.out.println("=====================================================");

        Map<String, Long> resumenPorEspecie = mascotas.stream()
                .collect(Collectors.groupingBy(Mascota::getEspecie, Collectors.counting()));

        resumenPorEspecie.forEach((especie, cantidad) -> System.out.println("• " + especie + ": " + cantidad));
    }

    private static void listarMascotasEnEstadoCritico(List<HistorialEstado> historial) {
        System.out.println("=====================================================");
        System.out.println("EJERCICIO 4 - Mascotas en Estado Crítico");
        System.out.println("=====================================================");

        historial.stream()
                .filter(h -> h.getEstado().getNombre().equalsIgnoreCase("Crítico"))
                .sorted(Comparator.comparing(HistorialEstado::getFechaCambio))
                .forEach(h -> System.out.println("• " + h.getMascota().getNombre() + " - " + h.getFechaCambio()));

    }

    ;

import java.time.LocalDate;
import java.util .*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

    public class Main {
        public static void main(String[] args) {
            Logger logger = Logger.getLogger(Main.class.getName());

            List<Cliente> clientes = Poblador.getClientes();
            List<Mascota> mascotas = Poblador.getMascotas();
            List<Medicamento> medicamentos = Poblador.getMedicamentos();
            List<Empleado> empleados = Poblador.getEmpleados();
            List<Estado> estados = Poblador.getEstados();
            List<HistorialEstado> historial = Poblador.getHistorialEstados(mascotas, empleados, estados);
            List<AplicacionMedicamento> aplicaciones = Poblador.getAplicaciones();

            Poblador.asociarMascotasAClientes(clientes, mascotas);
            Poblador.asociarAplicaciones(aplicaciones, mascotas, medicamentos, empleados);

            mostrarClientesYMascotas(clientes);
            mostrarStockMedicamentos(medicamentos);
            mostrarCantidadMascotasPorEspecie(mascotas);
            listarMascotasCriticas(historial);
            mostrarAplicacionesPorVeterinario(aplicaciones);
            mostrarHistorialEstadosMascota(mascotas, historial);
            mostrarClientesMasVisitas(aplicaciones, clientes);
        }

        private static void mostrarClientesYMascotas(List<Cliente> clientes) {
            System.out.println("=====================================================");
            System.out.println("EJERCICIO 1 - Clientes y sus mascotas");
            System.out.println("=====================================================");

            clientes.forEach(cliente -> {
                String nombresMascotas = cliente.getMascotas().stream()
                        .map(Mascota::getNombre)
                        .collect(Collectors.joining(", "));

                System.out.println(cliente.getNombre() + " tiene " +
                        cliente.getMascotas().size() + " mascota(s): " + nombresMascotas);
            });
        }

        private static void mostrarStockMedicamentos(List<Medicamento> medicamentos) {
            System.out.println("=====================================================");
            System.out.println("EJERCICIO 2 - Stock de Medicamentos");
            System.out.println("=====================================================");

            medicamentos.forEach(med -> {
                String estadoStock = med.getCantidadStock() <= 20 ? "STOCK BAJO" : "";
                System.out.printf("• %s - %d unidades %s%n", med.getNombre(), med.getCantidadStock(), estadoStock);
            });
        }

        private static void mostrarCantidadMascotasPorEspecie(List<Mascota> mascotas) {
            System.out.println("=====================================================");
            System.out.println("EJERCICIO 3 - Cantidad de Mascotas por Especie");
            System.out.println("=====================================================");

            mascotas.stream()
                    .collect(Collectors.groupingBy(Mascota::getEspecie, Collectors.counting()))
                    .forEach((especie, cantidad) -> System.out.println("• " + especie + ": " + cantidad));
        }

        private static void listarMascotasCriticas(List<HistorialEstado> historial) {
            System.out.println("=====================================================");
            System.out.println("EJERCICIO 4 - Mascotas en Estado Crítico");
            System.out.println("=====================================================");

            historial.stream()
                    .filter(h -> h.getEstado().getNombre().equalsIgnoreCase("Crítico"))
                    .sorted(Comparator.comparing(HistorialEstado::getFechaCambio))
                    .forEach(h -> System.out.printf("• %s - %s (Atendido por %s)%n",
                            h.getMascota().getNombre(), h.getFechaCambio(), h.getVeterinario().getNombre()));
        }

        private static void mostrarAplicacionesPorVeterinario(List<AplicacionMedicamento> aplicaciones) {
            LocalDate inicio = LocalDate.of(2023, 10, 1);
            LocalDate fin = LocalDate.of(2023, 12, 31);

            System.out.println("=====================================================");
            System.out.println("EJERCICIO 5 - Aplicaciones por Veterinario");
            System.out.println("=====================================================");

            aplicaciones.stream()
                    .filter(app -> app.getEmpleado().getPuesto().equalsIgnoreCase("Veterinario")
                            && !app.getFechaAplicacion().isBefore(inicio)
                            && !app.getFechaAplicacion().isAfter(fin))
                    .collect(Collectors.groupingBy(app -> app.getEmpleado().getNombre(), Collectors.counting()))
                    .forEach((nombre, cantidad) -> System.out.println("• " + nombre + ": " + cantidad + " aplicación(es)"));
        }

        private static void mostrarHistorialEstadosMascota(List<Mascota> mascotas, List<HistorialEstado> historial) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=====================================================");
            System.out.println("EJERCICIO 6 - Historial de Estados de una Mascota");
            System.out.println("=====================================================");

            mascotas.forEach(m -> System.out.println("• ID: " + m.getID() + " - " + m.getNombre()));
            System.out.print("Ingrese el ID de la mascota para ver su historial: ");
            long idSeleccionado = scanner.nextLong();

            Mascota mascota = mascotas.stream()
                    .filter(m -> m.getID() == idSeleccionado)
                    .findFirst().orElse(null);

            if (mascota == null) {
                System.out.println("Mascota no encontrada.");
                return;
            }

            System.out.println("\nHistorial de estados para " + mascota.getNombre() + ":\n");
            historial.stream()
                    .filter(h -> h.getMascota().equals(mascota))
                    .sorted(Comparator.comparing(HistorialEstado::getFechaCambio))
                    .forEach(h -> System.out.printf("• %s - %s (Atendido por %s)%n",
                            h.getFechaCambio(), h.getEstado().getNombre(), h.getVeterinario().getNombre()));
        }

        private static void mostrarClientesMasVisitas(List<AplicacionMedicamento> aplicaciones, List<Cliente> clientes) {
            LocalDate hoy = LocalDate.of(2023, 12, 31);
            LocalDate hace6Meses = hoy.minusMonths(6);

            System.out.println("=====================================================");
            System.out.println("EJERCICIO 7 - Clientes con más Visitas Médicas");
            System.out.println("=====================================================");

            Map<Mascota, Cliente> mapaMascotaCliente = new HashMap<>();
            clientes.forEach(cliente -> cliente.getMascotas().forEach(mascota -> mapaMascotaCliente.put(mascota, cliente)));

            aplicaciones.stream()
                    .filter(app -> !app.getFechaAplicacion().isBefore(hace6Meses))
                    .map(app -> mapaMascotaCliente.get(app.getMascota()))
                    .filter(Objects::nonNull)
                    .collect(Collectors.groupingBy(Cliente::getNombre, Collectors.counting()))
                    .forEach((nombre, cantidad) -> System.out.println("• " + nombre + ": " + cantidad + " visita(s)"));
            // Mostrar clientes con más consultas médicas recientes
            System.out.println("Clientes con más consultas médicas en los últimos 6 meses:\n");

            visitasPorCliente.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // Orden descendente por número de consultas
                    .forEach(entry -> {
                        System.out.println("• " + entry.getKey() + ": " + entry.getValue() + " consulta(s)");
                    });

            // =====================================================
            // EJERCICIO 8
        /*
        Mascotas que requieren vacunación en el mes actual.
        */
            System.out.println("=====================================================");
            System.out.println("EJERCICIO 8");
            System.out.println("=====================================================");
            LocalDate fechaActual = LocalDate.now();
            int mesActual = fechaActual.getMonthValue();
            int anioActual = fechaActual.getYear();

            System.out.println("Mascotas que deben recibir vacunas este mes (" + fechaActual.getMonth() + " " + anioActual + "):\n");

            aplicaciones.stream()
                    .filter(aplicacion -> {
                        Medicamento medicamento = aplicacion.getMedicamento();
                        LocalDate fechaAplicacion = aplicacion.getFechaAplicacion();

                        boolean esEsteMes = fechaAplicacion.getMonthValue() == mesActual && fechaAplicacion.getYear() == anioActual;
                        boolean esVacuna = medicamento.getNombre().toLowerCase().contains("vacuna");

                        return esEsteMes && esVacuna;
                    })
                    .forEach(aplicacion -> {
                        System.out.printf("• %s debe recibir %s el %s (Veterinario: %s)%n",
                                aplicacion.getMascota().getNombre(),
                                aplicacion.getMedicamento().getNombre(),
                                aplicacion.getFechaAplicacion(),
                                aplicacion.getEmpleado().getNombre());
                    });

            // =====================================================
            // EJERCICIO 9
        /*
        Resumen del uso de medicamentos, mostrando la cantidad de aplicaciones realizadas y el stock utilizado.
        */
            System.out.println("=====================================================");
            System.out.println("EJERCICIO 9");
            System.out.println("=====================================================");
            System.out.println("Resumen de uso de medicamentos:\n");

            Map<Medicamento, Long> aplicacionesPorMedicamento = aplicaciones.stream()
                    .map(AplicacionMedicamento::getMedicamento)
                    .filter(Objects::nonNull)
                    .collect(Collectors.groupingBy(
                            medicamento -> medicamento,
                            Collectors.counting()
                    ));

            aplicacionesPorMedicamento.entrySet().stream()
                    .sorted(Map.Entry.<Medicamento, Long>comparingByValue().reversed())
                    .forEach(entry -> {
                        Medicamento medicamento = entry.getKey();
                        Long totalAplicaciones = entry.getValue();
                        int stockUsadoEstimado = totalAplicaciones.intValue(); // Suponiendo 1 unidad por aplicación

                        System.out.printf("• %s: %d aplicación(es), %d unidad(es) usadas (Stock inicial: %d)%n",
                                medicamento.getNombre(),
                                totalAplicaciones,
                                stockUsadoEstimado,
                                medicamento.getCantidadStock());
                    });

            // =====================================================
            // EJERCICIO 10
        /*
        Calcular el total de ingresos diarios por ventas de medicamentos.
        */
            System.out.println("=====================================================");
            System.out.println("EJERCICIO 10");
            System.out.println("=====================================================");
            System.out.println("Total de ingresos diarios por ventas de medicamentos:\n");

            // Agrupar por fecha y sumar los precios de los medicamentos aplicados ese día
            Map<LocalDate, Double> ingresosPorDia = aplicaciones.stream()
                    .filter(aplicacion -> aplicacion.getMedicamento() != null)
                    .collect(Collectors.groupingBy(
                            AplicacionMedicamento::getFechaAplicacion,  // Agrupación por fecha
                            Collectors.summingDouble(aplicacion -> aplicacion.getMedicamento().getPrecio()) // Suma de precios
                    ));

            // Ordenar por fecha ascendente y mostrar los ingresos diarios
            ingresosPorDia.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> {
                        LocalDate fecha = entry.getKey();
                        Double totalIngresos = entry.getValue();
                        System.out.printf("• %s: $%.2f%n", fecha, totalIngresos);
                    });
        }
    }
}