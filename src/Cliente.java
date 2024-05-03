import java.util.Date;

public class Cliente extends Persona{
    private double notaCrediticia;




    public Cliente(int cedula, String Nombre, String correoElectronico, double notaCrediticia) {
        super(cedula, Nombre, correoElectronico);
        this.notaCrediticia = notaCrediticia;
    }

    public double getNotaCrediticia() {
        return notaCrediticia;
    }

    public void setNotaCrediticia(double notaCrediticia) {
        this.notaCrediticia = notaCrediticia;
    }
}
