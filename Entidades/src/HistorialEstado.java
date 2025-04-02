import java.time.LocalDate;

public class HistorialEstado {

    private Integer ID;
    private LocalDate fechaCambio;
    private Mascota mascota;
    private Estado estado;
    private Empleado veterinario;

    public HistorialEstado() {
    }

    public HistorialEstado(Integer ID, LocalDate fechaCambio, Mascota mascota, Estado estado, Empleado veterinario) {
        this.ID = ID;
        this.fechaCambio = fechaCambio;
        this.mascota = mascota;
        this.estado = estado;
        this.veterinario = veterinario;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public LocalDate getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(LocalDate fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Empleado getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Empleado veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "HistorialEstado{" +
                "ID=" + ID +
                ", fechaCambio=" + fechaCambio +
                ", estado=" + estado +
                '}';
    }
}
