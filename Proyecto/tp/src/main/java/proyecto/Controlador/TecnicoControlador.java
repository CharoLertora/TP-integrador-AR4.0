package proyecto.Controlador;

import proyecto.Modelo.Especialidad;
import proyecto.Modelo.Tecnico;

public class TecnicoControlador {

    public TecnicoControlador(){}

    public Tecnico crearTecnico(String nombre, String apellido) {
        
        Tecnico tecnico = new Tecnico(nombre, apellido);

        return tecnico;
    }

    public void agregarEspecialidad(int opcion, Tecnico tecnico) {
        
        Especialidad e = new Especialidad();
        switch (opcion) {
            case 1:
                tecnico.setEspecialidades(e.especialidadSOWindows());
                break;
            case 2:
                tecnico.setEspecialidades(e.especialidadSOLinux());
                break;
            case 3:
                tecnico.setEspecialidades(e.especialidadSOMacOS());
                break;
            case 4:
                tecnico.setEspecialidades(e.especialidadHardware());
                break;
            case 5:
                tecnico.setEspecialidades(e.especialidadRedes());
                break;
            case 6:
                tecnico.setEspecialidades(e.especialidadSeguridad());
                break;
            default:
                break;
        }
    }

    public void editarNombre(Tecnico tecnico, String nuevoNombre) {
        tecnico.setNombre(nuevoNombre);
    }

    public void editarApellido(Tecnico tecnico, String nuevoApellido) {
        tecnico.setApellido(nuevoApellido);
    }

    public void mostrarDatos(Tecnico tecnico) {
        tecnico.toString();
        tecnico.listarEspecialidades();
    }

    public void eliminarTecnico(Tecnico tecnico) {
        tecnico.setId(0);
        tecnico.setNombre(null);
        tecnico.setApellido(null);
        tecnico.setEspecialidades(null);
    }
}
