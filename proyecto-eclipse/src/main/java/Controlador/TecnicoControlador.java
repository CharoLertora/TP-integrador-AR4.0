package Controlador;

import org.hibernate.Session;

import Modelo.Tecnico;
import jakarta.persistence.*;


public class TecnicoControlador {

    public String CrearTecnico(String nombre, String Apellido) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
    }
}
