import java.util.ArrayList;

public class Venta {

    private int ventaID;
    private String vendedor;
    private String cliente;
    private String articulo;
    private double precio;


    public Venta(int ventaID, String vendedor, String cliente, String articulo, double precio) {
        this.ventaID = ventaID;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.articulo = articulo;
        this.precio = precio;
    }



    public int getVentaID() {
        return ventaID;
    }

    public void setVentaID(int ventaID) {
        this.ventaID = ventaID;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
