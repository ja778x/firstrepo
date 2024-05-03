import java.util.ArrayList;

public class Inventario {

    private ArrayList<Vehiculo> listaDeVehiculos = new ArrayList<Vehiculo>();
    public Inventario(ArrayList<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public ArrayList<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(ArrayList<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }


}
