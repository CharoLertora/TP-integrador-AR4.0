package proyecto.Vista;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import proyecto.Controlador.IncidenteControlador;
import proyecto.Modelo.Incidente;

public class IncidenteVista {
    Scanner dato = new Scanner(System.in);
    IncidenteControlador controlador;
    ArrayList<Incidente> incidentes = new ArrayList<>();

    public IncidenteVista() {
        this.controlador = new IncidenteControlador();
    }

    public void vistaCrearIncidente() {
      String crearOtro = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        do {
            int idTecnico;
            int idCliente;
            String descripcion;
            LocalDateTime fechaIngreso;
            LocalDateTime fechaResolucion;
            int tipoProblema;

            System.out.println("Ingrese el id del tecnico asignado: \n");
            idTecnico = dato.nextInt();
            System.out.println("Ingrese el id del cliente asignado: \n");
            idCliente = dato.nextInt();
            System.out.println("Ingrese una descripción del incidente: \n");
            descripcion = dato.next();
            System.out.println("Ingrese la fecha de ingreso con el siguiente formato: año-mes-dia HH:MM:SS \n");
            String tiempo = "";
            tiempo = dato.next();
            fechaIngreso = LocalDateTime.parse(tiempo, formatter);
            System.out.println("Ingrese la fecha en la que debe ser resuelto el incidente con el siguiente formato: año-mes-dia HH:MM:SS \n");
            tiempo = dato.next();
            fechaResolucion = LocalDateTime.parse(tiempo, formatter);
            System.out.println("Ingrese el tipo de problema: \n");
            tipoProblema = dato.nextInt();

            Incidente incidente = controlador.crearIncidente(idTecnico, idCliente, descripcion, fechaIngreso, fechaResolucion, tipoProblema);
            incidentes.add(incidente);

            System.out.println("Desea agregar otro incidente al sistema?: (Responda con 'si' o 'no') \n");
            crearOtro = dato.next();

        }while(crearOtro == "si");
    }

    public void vistaListarIncidente(int idIncidente) {
        controlador.mostrarDatos(incidentes.get(idIncidente));
    }

    public void vistaListadoIncidentes() {
        for(int i = 0; i < incidentes.size(); i++) {
            controlador.mostrarDatos(incidentes.get(i));
        }
    }
}
