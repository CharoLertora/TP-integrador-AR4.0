package proyecto;

import java.util.Scanner;

import proyecto.Vista.ClienteVista;
import proyecto.Vista.IncidenteVista;
import proyecto.Vista.ProblemaVista;
import proyecto.Vista.TecnicoVista;

public class Main {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        ClienteVista vistaCliente = new ClienteVista();
        TecnicoVista vistaTecnico = new TecnicoVista();
        IncidenteVista vistaIncidente = new IncidenteVista();
        ProblemaVista vistaProblema = new ProblemaVista();

        int opcion;
        System.out.println("Bienvenido a nuestro sistema! Qué desea hacer?: \n" +
        "1. Agregar un técnico al sistema.\n" + 
        "2. Agregar un cliente al sistema.\n" + 
        "3. Agregar un tipo de problema al sistema.\n" + 
        "4. Reportar un incidente.\n" + 
        "5. Listar todos los clientes.\n" + 
        "6. Listar todos los técnicos de la empresa.\n" +
        "7. Listar todos los incidentes.\n"
        );
        System.out.println("Por favor, indique la opción con el número correspondiente a lo que desea realizar.\n");
        opcion = dato.nextInt();

        switch (opcion) {
            case 1:
                vistaTecnico.vistaCrearTecnico();
                break;
            case 2:
                vistaCliente.vistaCrearCliente();
                break;
            case 3:
                vistaProblema.vistaCrearProblema();
                break;
            case 4:
                vistaIncidente.vistaCrearIncidente();
                break;
            case 5:
                vistaCliente.vistaListadoClientes();
                break;
            case 6:
                vistaTecnico.vistaListadoTecnicos();
                break;
            case 7:
                vistaIncidente.vistaListadoIncidentes();
            default:
                break;
        }
    }
}