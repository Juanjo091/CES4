import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private Integer id;
    private String nombre;
    private int Stock_cant;
    private double precio;
    private LocalDate fechaVencimiento;
    private List<AplicacionMedicamento> aplicacionMedicamentos;

    public Medicamento() {
    }

    public Medicamento(Integer id, String nombre, int Stock_cant, double precio, LocalDate fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.Stock_cant = Stock_cant;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.aplicacionMedicamentos = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock_cant() {
        return Stock_cant;
    }

    public void setStock_cant(int Stock_cant) {
        this.Stock_cant = Stock_cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public List<AplicacionMedicamento> getAplicacionMedicamentos() {
        return aplicacionMedicamentos;
    }

    public void setAplicacionMedicamentos(List<AplicacionMedicamento> aplicacionMedicamentos) {
        this.aplicacionMedicamentos = aplicacionMedicamentos;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", Stock_cant=" + getStock_cant() +
                ", precio=" + getPrecio() +
                ", fechaVencimiento=" + getFechaVencimiento() +
                '}';
    }

    public void reducirStock(int cantidad) {
        if (Stock_cant < cantidad) {
            throw new IllegalStateException("No hay suficiente stock disponible.");
        }
        Stock_cant -= cantidad;
    }
}
