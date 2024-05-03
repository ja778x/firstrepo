public class Vehiculo {

    private String marca;
    private String modelo;
    private double precio;
    private int anio;
    private String color;



    private int ID;

    public Vehiculo(String marca, String modelo, double precio, int anio, String color, int ID) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.anio = anio;
        this.color = color;
        this.ID = ID;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }


}
