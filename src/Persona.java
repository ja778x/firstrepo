import java.util.Date;

public class Persona {

    private int cedula;
    private String Nombre;
    private String correoElectronico;

    public Persona(int cedula, String Nombre, String correoElectronico) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.correoElectronico = correoElectronico;
    }
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }




}
