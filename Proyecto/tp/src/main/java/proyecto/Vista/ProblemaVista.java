package proyecto.Vista;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import proyecto.Controlador.ProblemaControlador;
import proyecto.Modelo.Problema;

public class ProblemaVista {
    Scanner dato = new Scanner(System.in);
    ProblemaControlador controlador;
    ArrayList<Problema> problemas = new ArrayList<>();

    public ProblemaVista(){
        this.controlador = new ProblemaControlador();
    }

    public void vistaCrearProblema() {
        String crearOtro = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        do {
            int tipo = 0;
            LocalDateTime tiempoResolucion;

            System.out.println("Ingrese el tipo de problema: \n");
            tipo = dato.nextInt();
            System.out.println("Ingrese la fecha de resolución con el siguiente formato: año-mes-dia HH:MM:SS \n");
            String tiempo = "";
            tiempo = dato.next();
            tiempoResolucion = LocalDateTime.parse(tiempo, formatter);

            Problema problema = controlador.crearProblema(tipo, tiempoResolucion);
            String respuesta;
            do {
                agregarEspecialidadesNecesarias(problema);
                System.out.println("Desea agregar otra especialidad?: (Responda con 'si' o 'no') \n");
                respuesta = dato.next();
            }while(respuesta == "si");
            problemas.add(problema);

            System.out.println("Desea agregar otro problema al sistema?: (Responda con 'si' o 'no') \n");
            crearOtro = dato.next();

        }while(crearOtro == "si");
    }

    public void agregarEspecialidadesNecesarias(Problema problema) {
        
        int opcion = 0;
        System.out.println("Las especialidades disponibles son: \n" +
        "1. Soft. Windows\n" +
        "2. Soft. Linux\n" +
        "3. Soft. MacOS\n" +
        "4. Hardware\n" +
        "5. Redes\n" +
        "6. Seguridad\n");

        System.out.println("Por favor, indique la opción con el número correspondiente a la especialidad que desea agregar.");
        opcion = dato.nextInt();

        controlador.agregarEspecialidadesNec(problema, opcion);;
    }

    public void vistaListarProblema(int idProblema) {
        controlador.mostrarDatos(problemas.get(idProblema));
    }

    public void vistaListadoProblemas() {
        for(int i = 0; i <= problemas.size(); i++) {
            controlador.mostrarDatos(problemas.get(i));
        }
    }
}
