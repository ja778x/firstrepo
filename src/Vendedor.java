import java.util.Date;

public class Vendedor extends Persona{

    private int CodigoVendedor;

    public Vendedor(int cedula, String Nombre, String correoElectronico, int CodigoDeVendedor) {
        super(cedula, Nombre, correoElectronico);
        this.CodigoVendedor = CodigoDeVendedor;
    }

    public int getCodigoVendedor() {
        return CodigoVendedor;
    }
}


