package proyecto.Vista;

import java.util.ArrayList;
import java.util.Scanner;

import proyecto.Controlador.TecnicoControlador;
import proyecto.Modelo.Tecnico;

public class TecnicoVista {
    
    Scanner dato = new Scanner(System.in);
    TecnicoControlador controlador;
    ArrayList<Tecnico> tecnicos = new ArrayList<>();

    public TecnicoVista() {
        this.controlador = new TecnicoControlador();
    }

    public void vistaCrearTecnico() {
        
        String crearOtro = "";
        do {
            String nombre = "";
            System.out.println("Ingrese nombre del técnico: \n");
            nombre = dato.next();

            String apellido = "";
            System.out.println("Ingrese apellido del técnico: \n");
            apellido = dato.next();

            Tecnico tecnico = controlador.crearTecnico(nombre, apellido);
            String respuesta;
            do {
                agregarEspecialidades(tecnico);
                System.out.println("Desea agregar otra especialidad?: (Responda con 'si' o 'no') \n");
                respuesta = dato.next();
            }while(respuesta == "si");
            tecnicos.add(tecnico);
            System.out.println("Desea agregar otro técnico al sistema?: (Responda con 'si' o 'no') \n");
            crearOtro = dato.next();

        }while(crearOtro == "si");
        
    }

    public void agregarEspecialidades(Tecnico tecnico) {
        
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

        controlador.agregarEspecialidad(opcion, tecnico);
    }

    public void vistaListarTecnico(int idTecnico) {
        controlador.mostrarDatos(tecnicos.get(idTecnico));
    }

    public void mostrarListadoTecnicos() {
        for(int i = 0; i <= tecnicos.size(); i++) {
            controlador.mostrarDatos(tecnicos.get(i));
        }
    }
}
