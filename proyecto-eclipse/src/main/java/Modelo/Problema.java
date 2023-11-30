package Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

import jakarta.persistence.*;

@Entity
@Table
public class Problema {
    @Id
    @Column(name = "idProblema")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProblema;
    @Column(name = "TipoProblema")
    private String tipo;
    @Column(name = "EspecialidadesNecesarias")
    private ArrayList<String> especialidadesNec;
    @Column(name = "TiempoDeResolución")
    private LocalDateTime tiempoResolucion;


    public Problema() {
    }

    public Problema(String tipo, ArrayList<String> especialidadesNec, LocalDateTime tiempoResolucion) {
        this.tipo = tipo;
        this.especialidadesNec = especialidadesNec;
        this.tiempoResolucion = tiempoResolucion;
    }

    public int getIdProblema() {
        return this.idProblema;
    }

    public void setIdProblema(int idProblema) {
        this.idProblema = idProblema;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getEspecialidadesNec() {
        return this.especialidadesNec;
    }

    public void setEspecialidadesNec(ArrayList<String> especialidadesNec) {
        this.especialidadesNec = especialidadesNec;
    }

    public LocalDateTime getTiempoResolucion() {
        return this.tiempoResolucion;
    }

    public void setTiempoResolucion(LocalDateTime tiempoResolucion) {
        this.tiempoResolucion = tiempoResolucion;
    }

}
