import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private Integer ID;
    private String nombre;
    private String especie;
    private LocalDate fechaNacimiento;
    private List<HistorialEstado> historialEstados;
    private List<AplicacionMedicamento> aplicacionMedicamentos;

    public Mascota() {
    }

    public Mascota(Integer ID, String nombre, String especie, LocalDate fechaNacimiento) {
        this.ID = ID;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.historialEstados = new ArrayList<>();
        this.aplicacionMedicamentos = new ArrayList<>();
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<HistorialEstado> getHistorialEstados() {
        return historialEstados;
    }

    public void setHistorialEstados(List<HistorialEstado> historialEstados) {
        this.historialEstados = historialEstados;
    }

    public List<AplicacionMedicamento> getAplicacionMedicamentos() {
        return aplicacionMedicamentos;
    }

    public void setAplicacionMedicamentos(List<AplicacionMedicamento> aplicacionMedicamentos) {
        this.aplicacionMedicamentos = aplicacionMedicamentos;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
