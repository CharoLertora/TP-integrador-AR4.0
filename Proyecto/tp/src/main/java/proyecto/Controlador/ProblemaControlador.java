package proyecto.Controlador;

import java.time.LocalDateTime;

import proyecto.Modelo.Especialidad;
import proyecto.Modelo.Problema;

public class ProblemaControlador {
    
    public Problema crearProblema(int tipo, LocalDateTime tiempoResolucion) {
        
        Problema problema = new Problema(tipo, tiempoResolucion);
        return problema;
    }

    public void agregarEspecialidadesNec(Problema problema, int opcion) {
        Especialidad e = new Especialidad();
        switch (opcion) {
            case 1:
                problema.setEspecialidadesNec(e.especialidadSOWindows());
                break;
            case 2:
                problema.setEspecialidadesNec(e.especialidadSOLinux());
                break;
            case 3:
                problema.setEspecialidadesNec(e.especialidadSOMacOS());
                break;
            case 4:
                problema.setEspecialidadesNec(e.especialidadHardware());
                break;
            case 5:
                problema.setEspecialidadesNec(e.especialidadRedes());
                break;
            case 6:
                problema.setEspecialidadesNec(e.especialidadSeguridad());
                break;
            default:
                break;
        }
    }

    public void editarTipoProblema(Problema problema, int nuevoTipo) {
        problema.setTipo(nuevoTipo);
    }

    public void editarTiempoResolucion(Problema problema, LocalDateTime nuevoTiempo) {
        problema.setTiempoResolucion(nuevoTiempo);
    }

    public void mostrarDatos(Problema problema) {
        problema.toString();
        problema.listarEspecialidadesNec();
    }

    public void eliminarProblema(Problema problema) {
        problema.setEspecialidadesNec(null);
        problema.setIdProblema(0);
        problema.setTiempoResolucion(null);
        problema.setTipo(0);
    }
}
