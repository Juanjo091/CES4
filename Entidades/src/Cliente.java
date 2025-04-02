import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer ID;
    private String Nombre;
    private String Telefono;
    private String Email;
    private String Direccion;
    private List<Mascota> Mascotas;

    public Cliente(Integer ID, String Nombre, String Telefono, String Email, String Direccion) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Mascotas = new ArrayList<>();
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

    public String GetTelefono() {
        return Telefono;
    }

    public void SetTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String GetEmail() {
        return Email;
    }

    public void SetEmail(String Email) {
        this.Email = Email;
    }

    public String GetDireccion() {
        return Direccion;
    }

    public void SetDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public List<Mascota> GetMascotas() {
        return Mascotas;
    }

    public void SetMascotas(Mascota Mascota) {
        this.Mascotas.add(Mascota);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "ID=" + this.ID +
                ", Nombre='" + this.Nombre + '\'' +
                ", Telefono='" + this.Telefono + '\'' +
                ", Email='" + this.Email + '\'' +
                ", Direccion='" + this.Direccion + '\'' +
                ", Mascotas=" + this.Mascotas +
                '}';
    }

    public void RegistrarMascota(Mascota Mascota) {
        if (Mascotas.size() >= 5) {
            throw new IllegalStateException("Un cliente no puede tener más de 5 mascotas.");
        }
        Mascotas.add(Mascota);
    }

    public List<Mascota> ObtenerMascotas() {
        return Mascotas;
    }
}
