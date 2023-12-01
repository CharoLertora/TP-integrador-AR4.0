package proyecto.Vista;

import java.util.ArrayList;
import java.util.Scanner;

import proyecto.Controlador.ClienteControlador;
import proyecto.Modelo.Cliente;


public class ClienteVista {
    Scanner dato = new Scanner(System.in);
    ClienteControlador controlador;
    ArrayList<Cliente> clientes = new ArrayList<>();

    public ClienteVista() {
        this.controlador = new ClienteControlador();
    }

    public void vistaCrearCliente() {
        String crearOtro = "";
        do {
            int cuit = 0;
            System.out.println("Ingrese el CUIT del cliente: \n");
            cuit = dato.nextInt();
            String razonSocial = "";
            System.out.println("Ingrese la razón social del cliente: \n");
            razonSocial = dato.next();

            Cliente cliente = controlador.CrearCliente(cuit, razonSocial);

            String respuesta;
            do{
                agregarServicios(cliente);
                System.out.println("Desea agregar otro servicio?: (Responda con 'si' o 'no') \n");
                respuesta = dato.next();
            }while(respuesta == "si");
            clientes.add(cliente);
            System.out.println("Desea agregar otro cliente al sistema?: (Responda con 'si' o 'no') \n");
            crearOtro = dato.next();

        }while(crearOtro == "si");
    }

    public void agregarServicios(Cliente cliente) {
        
        int opcion = 0;
        System.out.println("Los servicios disponibles son: \n" +
        "1. Windows\n" +
        "2. Linux\n" +
        "3. MacOS\n" +
        "4. Conexión a Internet\n" +
        "5. Antivirus\n");

        System.out.println("Por favor, indique la opción con el número correspondiente a la especialidad que desea agregar.");
        opcion = dato.nextInt();

        controlador.agregarServicioContratado(cliente, opcion);
    }

    public void vistaListarCliente(int cuitCliente) {
        controlador.mostrarDatos(clientes.get(cuitCliente));
    }

    public void vistaListadoClientes() {
        for(int i = 0; i <= clientes.size(); i++) {
            controlador.mostrarDatos(clientes.get(i));
        }
    }
}
