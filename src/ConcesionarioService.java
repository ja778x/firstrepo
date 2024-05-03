import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ConcesionarioService {

    private ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
    private ArrayList<Vendedor> listaDeVendedores = new ArrayList<Vendedor>();
    private ArrayList<Vehiculo> listaDeVehiculo = new ArrayList<Vehiculo>();
    private ArrayList<Venta> listaDeVentas= new ArrayList<Venta>();
    private Scanner scan = new Scanner (System.in);
    private Random Rand = new Random();
    public ConcesionarioService (){
        listaDeClientes.add(new Cliente(4111, "Jona", "Jona.Jona@Jona.com", 500));
        listaDeClientes.add(new Cliente(4222, "Cress", "Jona.Jon@Jona.com", 100000));

        listaDeVendedores.add(new Vendedor(5888, "Vendedor1", "papaya@verduras.com", 1000 ));
        listaDeVendedores.add(new Vendedor(6888, "Vendedor2", "papaya@verduras.com", 1001 ));

        listaDeVehiculo.add(new Vehiculo("Lamborgini","Gallardo", 7000000, 2023, "Morado", 4000));
        listaDeVehiculo.add(new Vehiculo("Lamborgini","URUS", 263000, 2024, "Negro", 4001));

        listaDeVentas.add(new Venta(1000,"Vendedor1","Cress","BMW", 700000));
        listaDeVentas.add(new Venta(1001,"Vendedor2","Jona","Ferrari", 800000));

    }
    public void MenuAgregarCliente(){
        int ced;
        String Nom;
        String Correo;
        double Cred;
        System.out.print("Cual es la Cedula del cliente? \n");
        ced = scan.nextInt();
        System.out.print("Cual es el Nombre del cliente? \n");
        Nom = scan.next();
        System.out.print("Cual es la Correo del cliente? \n");
        Correo = scan.next();
        System.out.print("Cual es la Nota crediticia del cliente? \n");
        Cred = scan.nextInt();
        try{
            listaDeClientes.add(new Cliente(ced, Nom, Correo,Cred));
            System.out.println("Se agrego el cliente exitosamente. \n");

        }catch(Exception e){
            System.out.println("Error. Intente de nuevo. \n");
        }
    }
    private void MenuEditarCliente(int i){
        String Nom;
        String Correo;
        double Cred;
        System.out.print("A cual es el nombre que desea cambiar? \n");
        Nom = scan.next();
        System.out.print("A cual es el correo que desea cambiar\n");
        Correo = scan.next();
        System.out.print("A cual nota crediticia desea cambiar \n");
        Cred = scan.nextInt();
        try{
            listaDeClientes.get(i).setNombre(Nom);
            listaDeClientes.get(i).setCorreoElectronico(Correo);
            listaDeClientes.get(i).setNotaCrediticia(Cred);

            System.out.println("Se edito el cliente exitosamente. \n");

        }catch(Exception e){
            System.out.println("Error. Intente de nuevo. \n");
            EditarClientes();
        }
    }
    public void MostrarClientes(){
        for(int i = 0; i < listaDeClientes.size(); i++){
            System.out.println("----------");
            System.out.println("Nombre: " + listaDeClientes.get(i).getNombre());
            System.out.println("Cedula: " + listaDeClientes.get(i).getCedula());
            System.out.println("Correo Electronico:" + listaDeClientes.get(i).getCorreoElectronico());
            System.out.println("Nota Crediticia: " + listaDeClientes.get(i).getNotaCrediticia());

            System.out.println("---------- \n");

        }
    }
    public void EditarClientes(){
        MostrarClientes();
        System.out.println("Digite Cedula de Cliente a editar. \n");
        try{
            int ced = scan.nextInt();
            for(int i = 0; i < listaDeClientes.size(); i++){
                if (listaDeClientes.get(i).getCedula() == ced) {
                    MenuEditarCliente(i);
                }   else{
                }

            }
        }catch (Exception e){
            System.out.println("Error. Intente de nuevo. \n");
            EditarClientes();
        }

    }

    public void BorrarCliente(){
        MostrarClientes();
        System.out.println("Digite Cedula de Cliente a editar. \n");
        try{
            int ced = scan.nextInt();
            for(int i = 0; i < listaDeClientes.size(); i++){
                if (listaDeClientes.get(i).getCedula() == ced) {
                    listaDeClientes.remove(i);
                    System.out.println("Cliente Borrado. ");
                }   else{

                }

            }
        }catch (Exception e){
            System.out.println("Error. Intente de nuevo. \n");
            EditarClientes();
        }

    }

    // Opciones de Vehiculos.
    public void MenuAgregarVehiculo(){
        String Marca;
        String Mod;
        int Price;
        int year;
        String Col;
        int ID;
        try{
        System.out.print("Cual es la marca del Vehiculo? \n");
        Marca = scan.next();
        System.out.print("Cual es el Modelo del Vehiculo? \n");
        Mod = scan.next();
        System.out.print("Cual es el precio del Vehiculo? \n");
        Price = scan.nextInt();
        System.out.print("Cual es el anio del Vehiculo? \n");
        year = scan.nextInt();
        System.out.print("Cual es el Color del Vehiculo? \n");
        Col = scan.next();
        System.out.print("Cual es el ID del Vehiculo? \n");
        ID = scan.nextInt();

            listaDeVehiculo.add(new Vehiculo(Marca, Mod, Price, year, Col, ID));
            System.out.println("Se agrego el Vehiculo exitosamente. \n");

        }catch(Exception e){
            System.out.println("Error. Intente de nuevo. \n");
        }
    }

    private void MenuEditarVehiculo(int i){
        String Marca;
        String Mod;
        double Price;
        int year;
        String Col;
        int ID;
        try{
        System.out.print("A cual es la marca de Vehiculo que desea cambiar? \n");
        Marca = scan.next();
        System.out.print("A cual modelo desea cambiar\n");
        Mod = scan.next();
        System.out.print("Cual es el precio que desea? \n");
        Price= scan.nextInt();
        System.out.print("Cual anio de Vehiculo desea? \n");
        year = scan.nextInt();
        System.out.print("A cual color de Vehiculo que desea cambiar? \n");
        Col = scan.next();


            listaDeVehiculo.get(i).setMarca(Marca);
            listaDeVehiculo.get(i).setModelo(Mod);
            listaDeVehiculo.get(i).setPrecio(Price);
            listaDeVehiculo.get(i).setAnio(year);
            listaDeVehiculo.get(i).setColor(Col);

            System.out.println("Se ha editado el Vehiculo exitosamente. \n");

        }catch(Exception e){
            System.out.println("Error. Intente de nuevo. \n");
            EditarClientes();
        }
    }

    public void EditarVehiculo(){
        MostrarVehiculos();
        System.out.println("Digite el ID del Vehiculo a Editar. \n");
        try{
            int cedV = scan.nextInt();
            for(int i = 0; i < listaDeVehiculo.size(); i++){
                if (listaDeVehiculo.get(i).getID() == cedV) {
                    MenuEditarVehiculo(i);
                }   else{
                }

            }
        }catch (Exception e){
            System.out.println("Error. Intente de nuevo. \n");
            EditarVehiculo();
        }

    }

    public void MostrarVehiculos(){
        for(int i = 0; i < listaDeVehiculo.size(); i++){
            System.out.println("----------");
            System.out.println("Marca: " + listaDeVehiculo.get(i).getMarca());
            System.out.println("Modelo: " + listaDeVehiculo.get(i).getModelo());
            System.out.println("Anio:" + listaDeVehiculo.get(i).getAnio());
            System.out.println("Precio: " + listaDeVehiculo.get(i).getPrecio());
            System.out.println("Color: " + listaDeVehiculo.get(i).getColor());
            System.out.println("ID :" + listaDeVehiculo.get(i).getID());


            System.out.println("---------- \n");

        }
    }

    public void BorrarVehiculo(){
        MostrarVehiculos();
        System.out.println("Digite el ID del Vehiculo a remover. \n");
        try{
            int ID = scan.nextInt();
            for(int i = 0; i < listaDeVehiculo.size(); i++){
                if (listaDeVehiculo.get(i).getID() == ID) {
                    listaDeVehiculo.remove(i);
                    System.out.println("Vehiculo Borrado. ");
                }   else{

                }

            }
        }catch (Exception e){
            System.out.println("Error. Intente de nuevo. \n");
            EditarVehiculo();
        }

    }

    //Ventas


    public void MenuAgregarVendedores(){
        int ced;
        String Nom;
        String Correo;
        int CodV;
        try{
        System.out.print("Cual es la Cedula del Vendedor? \n");
        ced = scan.nextInt();
        System.out.print("Cual es el Nombre del Vendedor? \n");
        Nom = scan.next();
        System.out.print("Cual es la Correo del Vendedor? \n");
        Correo = scan.next();
        System.out.print("Cual es el codigo Vendedor? \n");
        CodV = scan.nextInt();

            listaDeVendedores.add(new Vendedor(ced, Nom, Correo,CodV));
            System.out.println("Se agrego el vendedor exitosamente. \n");

        }catch(Exception e){
            System.out.println("Error. Intente de nuevo. \n");
        }
    }


    private void MenuEditarVendedores(int i){
        String Nom;
        String Correo;
        System.out.print("A cual es el nombre que desea cambiar? \n");
        Nom = scan.next();
        System.out.print("A cual es el correo que desea cambiar\n");
        Correo = scan.next();
        try{
            listaDeVendedores.get(i).setNombre(Nom);
            listaDeVendedores.get(i).setCorreoElectronico(Correo);

            System.out.println("Se edito el Vendedor exitosamente. \n");

        }catch(Exception e){
            System.out.println("Error. Intente de nuevo. \n");
            EditarVendedores();
        }
    }

    public void EditarVendedores(){
        MostrarVendedores();
        System.out.println("Digite la cedula de Vendedor a editar. \n");
        try{
            int ced = scan.nextInt();
            for(int i = 0; i < listaDeVendedores.size(); i++){
                if (listaDeVendedores.get(i).getCedula() == ced) {
                    MenuEditarVendedores(i);
                }   else{
                }

            }
        }catch (Exception e){
            System.out.println("Error. Intente de nuevo. \n");
            EditarVendedores();
        }

    }
    public void BorrarVendedor(){
        MostrarVendedores();
        System.out.println("Digite la cedula del vendedor a remover. \n");
        try{
            int ID = scan.nextInt();
            for(int i = 0; i < listaDeVendedores.size(); i++){
                if (listaDeVendedores.get(i).getCedula() == ID) {
                    listaDeVendedores.remove(i);
                    System.out.println("Vendedor Borrado. ");
                }   else{

                }

            }
        }catch (Exception e){
            System.out.println("Error. Intente de nuevo. \n");

        }

    }

    public void MenuAgregarVenta(){
        int ArtID;
        double P = 0;
        int ClienteID;
        int VendedorID;
        int ID = Rand.ints(1000,9999).findFirst().getAsInt();
        MostrarVendedores();
        System.out.print("Quien es el ID del vendedor de esta venta? \n");
        VendedorID = scan.nextInt();
        MostrarVehiculos();
        System.out.print("Cual es el ID del articulo asociado a la venta? \n");
        ArtID = scan.nextInt();
        MostrarClientes();
        System.out.print("Cual es la Cedula del cliente? \n");
        ClienteID = scan.nextInt();


        try{
            boolean ExisteV = false;
            String nomV = "";
            for(int i = 0; i < listaDeVendedores.size(); i++){
                if(listaDeVendedores.get(i).getCodigoVendedor() == VendedorID){
                    nomV = listaDeVendedores.get(i).getNombre();
                    ExisteV = true;
                } else{

                }

            }
            if(ExisteV == true){

            }else {
                System.out.println("No Existe un Vendedor con ese ID . Intente de nuevo.");
                return;
            }


            boolean ExisteA = false;
            String nomA = "";

            for(int i = 0; i < listaDeVehiculo.size(); i++){
                if(listaDeVehiculo.get(i).getID() == ArtID){
                    nomA = listaDeVehiculo.get(i).getMarca() + " " + listaDeVehiculo.get(i).getModelo();
                    P = listaDeVehiculo.get(i).getPrecio();
                    ExisteA = true;
                } else{

                }
            }
            if(ExisteA == true){

            }else {
                System.out.println("No Existe un vehiculo con ese ID. Intente de nuevo.");
                return;
            }

            boolean ExisteC = false;
            String nomC = "";

            for(int i = 0; i < listaDeClientes.size(); i++){
                if(listaDeClientes.get(i).getCedula() == ClienteID){
                    nomC = listaDeClientes.get(i).getNombre();
                    ExisteC = true;
                } else {

                }
            }
            if(ExisteC == true){

            }else {
                System.out.println("No Existe un Cliente con ese ID. Intente de nuevo.");
                return;
            }

            listaDeVentas.add(new Venta(ID, nomV, nomC, nomA, P));
            System.out.println("Se agrego la venta exitosamente. \n");

        }catch(Exception e){
            System.out.println("Error. Intente de nuevo. \n");
        }
    }

    public void MostrarVendedores(){
        for(int i = 0; i < listaDeVendedores.size(); i++){
            System.out.println("----------");
            System.out.println("cedula: " + listaDeVendedores.get(i).getCedula());
            System.out.println("Codigo de Vendedor:" + listaDeVendedores.get(i).getCodigoVendedor());
            System.out.println("Nombre de Vendedor:" + listaDeVendedores.get(i).getNombre());
            System.out.println("Correo Electronico:" + listaDeVendedores.get(i).getCorreoElectronico());


            System.out.println("---------- \n");

        }
    }

    public void MostrarVentas(){
        for(int i = 0; i < listaDeVentas.size(); i++){
            System.out.println("----------");
            System.out.println("ID de Venta: " + listaDeVentas.get(i).getVentaID());
            System.out.println("Cliente: " +  listaDeVentas.get(i).getCliente());
            System.out.println("Articulo: " + listaDeVentas.get(i).getArticulo());
            System.out.println("Precio: " + listaDeVentas.get(i).getPrecio());
            System.out.println("Vendedor: " + listaDeVentas.get(i).getVendedor());

            System.out.println("---------- \n");

        }
    }
}
