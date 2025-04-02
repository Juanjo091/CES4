import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private Integer ID;
    private String Nombre;
    private String Puesto;
    private List<AplicacionMedicamento> AplicacionMedicamentos;
    private List<HistorialEstado> HistorialEstados;

    public Empleado(Integer ID, String Nombre, String Puesto) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Puesto = Puesto;
        this.AplicacionMedicamentos = new ArrayList<>();
        this.HistorialEstados = new ArrayList<>();
    }

    public Empleado() {
    }

    public Integer GetID() {
        return ID;
    }

    public void SetID(Integer ID) {
        this.ID = ID;
    }

    public String GetNombre() {
        return Nombre;
    }

    public void SetNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String GetPuesto() {
        return Puesto;
    }

    public void SetPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public List<AplicacionMedicamento> GetAplicacionMedicamentos() {
        return AplicacionMedicamentos;
    }

    public void SetAplicacionMedicamentos(List<AplicacionMedicamento> AplicacionMedicamentos) {
        this.AplicacionMedicamentos = AplicacionMedicamentos;
    }

    public List<HistorialEstado> GetHistorialEstados() {
        return HistorialEstados;
    }

    public void SetHistorialEstados(List<HistorialEstado> HistorialEstados) {
        this.HistorialEstados = HistorialEstados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "ID=" + ID +
                ", Nombre='" + Nombre + '\'' +
                ", Puesto='" + Puesto + '\'' +
                '}';
    }

    public boolean EsVeterinario() {
        return "Veterinario".equalsIgnoreCase(Puesto);
    }

    public boolean EsAdmin() {
        return "Admin".equalsIgnoreCase(Puesto);
    }
}
