package proyecto.Controlador;

import java.time.LocalDateTime;

import proyecto.Modelo.Incidente;

public class IncidenteControlador {
    
    public Incidente crearIncidente(int idTecnino, int idCliente, String descripcion, LocalDateTime fechaIngreso, LocalDateTime fechaResolucion, int tipoProblema) {

        Incidente incidente = new Incidente(idTecnino, idCliente, descripcion, fechaIngreso, fechaResolucion, tipoProblema);

        return incidente;
    }

    public void editarIdTecnico(Incidente incidente, int idNuevo) {
        incidente.setIdTecnico(idNuevo);
    }

    public void editarIdCliente(Incidente incidente, int idNuevo) {
        incidente.setIdCliente(idNuevo);
    }

    public void editarDescripción(Incidente incidente, String descripcion) {
        incidente.setDescripcion(descripcion);
    }

    public void editarFechaIngreso(Incidente incidente, LocalDateTime fechaIngresoNueva) {
        incidente.setFechaIngreso(fechaIngresoNueva);
    }

    public void editarFechaResolucion(Incidente incidente, LocalDateTime nuevaFechaResolucion) {
        incidente.setFechaResolucion(nuevaFechaResolucion);
    }

    public void editarTipoProblema(Incidente incidente, int tipoProblema) {
        incidente.setTipoProblema(tipoProblema);
    }

    public void mostrarDatos(Incidente incidente) {
        incidente.toString();
    }

    public void eliminarCliente(Incidente incidente) {
        incidente.setDescripcion(null);
        incidente.setFechaIngreso(null);
        incidente.setFechaResolucion(null);
        incidente.setIdCliente(0);
        incidente.setIdIncidente(0);
        incidente.setIdTecnico(0);
        incidente.setTipoProblema(0);
    }
}
