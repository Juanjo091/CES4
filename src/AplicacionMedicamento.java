import java.time.LocalDate;


public class AplicacionMedicamento {
    private Integer ID;
    private String Comentario;
    private LocalDate FechaAplicacion;
    private Medicamento Medicamento;
    private Mascota Mascota;
    private Empleado Empleado;

    public AplicacionMedicamento(Integer ID, String Comentario, LocalDate FechaAplicacion) {
        this.ID = ID;
        this.Comentario = Comentario;
        this.FechaAplicacion = FechaAplicacion;
    }

    public Integer GetID() {
        return ID;
    }

    public void SetID(Integer ID) {
        this.ID = ID;
    }

    public String GetComentario() {
        return Comentario;
    }

    public void SetComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public LocalDate GetFechaAplicacion() {
        return FechaAplicacion;
    }

    public void SetFechaAplicacion(LocalDate FechaAplicacion) {
        this.FechaAplicacion = FechaAplicacion;
    }

    public Medicamento GetMedicamento() {
        return Medicamento;
    }

    public void SetMedicamento(Medicamento Medicamento) {
        this.Medicamento = Medicamento;
    }

    public Mascota GetMascota() {
        return Mascota;
    }

    public void SetMascota(Mascota Mascota) {
        this.Mascota = Mascota;
    }

    public Empleado GetEmpleado() {
        return Empleado;
    }

    public void SetEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }

    @Override
    public String toString() {
        return "AplicacionMedicamento{" +
                "ID=" + ID +
                ", Comentario='" + Comentario + '\'' +
                ", FechaAplicacion=" + FechaAplicacion +
                '}';
    }
}
