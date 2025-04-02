import java.util.ArrayList;
import java.util.List;

public class Estado {
    private Integer ID;
    private String nombre;
    private List<HistorialEstado> historialEstados;

    public Estado() {
    }

    public Estado(Integer ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
        this.historialEstados = new ArrayList<>();
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

    public List<HistorialEstado> getHistorialEstados() {
        return historialEstados;
    }

    public void setHistorialEstados(List<HistorialEstado> historialEstados) {
        this.historialEstados = historialEstados;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
