import java.util.Scanner;
public class Menu {

    private Scanner scan = new Scanner (System.in);
    int opcion;

    ConcesionarioService CS = new ConcesionarioService();

    public Menu () {
        menuInicial();
    }

    public void menuInicial() {
        try {
            System.out.println("****Menu Principal****");
            System.out.print("Opcion1: Opciones de cliente.\n Opcion2: Opciones de Carro:\n Opcion 3: Opciones de Venta \n Opcion 4: Menu de Vendedores \n Opcion 5: Salir.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    opcion = 1;
                    menuCliente();
                case 2:
                    opcion = 2;
                    menuVehiculo();
                case 3:
                    opcion = 3;
                    menuVentas();
                case 4:
                    opcion = 4;
                    menuVendedores();
                case 5:
                    opcion = 5;


                    System.out.print("Gracias por usar esta vara");
                    break;


                default:
                    System.out.print("error");
                    menuInicial();
            }

        } catch (Exception e){
            System.out.println("Error Intente de new");
            menuInicial();
        }


    }
    public void menuCliente() {
        try{
        System.out.println("****Menu Cliente****");
        System.out.print("Opcion1: Registrar Cliente.\n Opcion2: Editar Cliente:\n Opcion 3: Borrar Cliente \n Opcion 4: Salir \n");
        opcion = scan.nextInt();
        switch(opcion) {
            case 1: opcion = 1;
                CS.MenuAgregarCliente();
                menuInicial();
            case 2: opcion = 2;
                CS.EditarClientes();
                menuInicial();
            case 3: opcion = 3;
                CS.BorrarCliente();
                menuCliente();
            case 4: opcion = 4;
            menuInicial();





            default:
                System.out.print("error");
                menuInicial();
        }


    }catch (Exception e){
            System.out.println("Error Intente de new");
            menuInicial();
        }

    }

    public void menuVehiculo(){
        try{
        System.out.println("****Menu Vehiculo****");
        System.out.print("Opcion1: Agregar Vehiculo.\n Opcion2: Editar Vehiculo:\n Opcion 3: Borrar Vehiculo \n Opcion 4: Salir \n");
        opcion = scan.nextInt();
        switch(opcion) {
            case 1: opcion = 1;
                CS.MenuAgregarVehiculo();
                menuVehiculo();
            case 2: opcion = 2;
                CS.EditarVehiculo();
                menuVehiculo();
            case 3: opcion = 3;
                CS.BorrarVehiculo();
                menuVehiculo();
            case 4: opcion = 4;
                menuInicial();





            default:
                System.out.print("error");
                menuInicial();
        }
        }catch (Exception e){
            System.out.println("Error Intente de new");
            menuInicial();
        }

    }

    public void menuVentas() {
        try {

            System.out.println("****Menu De Ventas****");
            System.out.print("Opcion1: Agregar Venta.\n Opcion2: Mostrar Venta:\n Opcion 3: Salir \n");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    opcion = 1;
                    CS.MenuAgregarVenta();
                    menuVentas();
                case 2:
                    opcion = 2;
                    CS.MostrarVentas();
                    menuVentas();
                case 3:
                    opcion = 3;
                    menuInicial();


                default:
                    System.out.print("error");
                    menuInicial();
            }


        }catch (Exception e){
            System.out.println("Error Intente de new");
            menuInicial();
        }
    }

    public void menuVendedores() {
        try {

            System.out.println("****Menu De Vendedores****");
            System.out.print("Opcion1: Agregar Vendedor.\n Opcion2: Editar Vendedor:\n Opcion 3: Borrar Vendedor \n Opcion 4: Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    opcion = 1;
                    CS.MenuAgregarVendedores();
                    menuVendedores();
                case 2:
                    opcion = 2;
                    CS.EditarVendedores();
                    menuVendedores();
                case 3:
                    opcion = 3;
                    CS.BorrarVendedor();
                    menuVendedores();


                default:
                    System.out.print("error");
                    menuInicial();
            }


        }catch (Exception e){
            System.out.println("Error Intente de new");
            menuInicial();
        }
    }

}
