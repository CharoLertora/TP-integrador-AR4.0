package proyecto.Controlador;

import proyecto.Modelo.Cliente;
import proyecto.Modelo.Servicio;

public class ClienteControlador {
    
    public Cliente CrearCliente(int cuit, String razonSocial) {
        
        Cliente cliente = new Cliente(cuit, razonSocial);
        return cliente;
    }

    public void agregarServicioContratado(Cliente cliente, int opcion) {
        Servicio servicio = new Servicio();
        switch (opcion) {
            case 1:
                cliente.setServiciosContratados(servicio.servicioLinux());
                break;
            case 2:
                cliente.setServiciosContratados(servicio.servicioWindows());
                break;
            case 3:
                cliente.setServiciosContratados(servicio.servicioMacOS());
                break;
            case 4:
                cliente.setServiciosContratados(servicio.servicioConexionInternet());
                break;
            case 5:
                cliente.setServiciosContratados(servicio.servicioAnticirus());
                break;
            default:
                break;
        }
    }

    public void mostrarDatos(Cliente cliente) {
        cliente.toString();
        cliente.listarServiciosCliente();
    }

    public void editarRazonSocial(Cliente cliente, String nuevaRazonSocial) {
        cliente.setRazonSocial(nuevaRazonSocial);
    }

    public void eliminarCliente(Cliente cliente) {
        cliente.setCuit(0);
        cliente.setRazonSocial(null);
        cliente.setServiciosContratados(null);
    }

}
