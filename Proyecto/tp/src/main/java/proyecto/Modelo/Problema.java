package proyecto.Modelo;

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
    private int tipo;
    @Column(name = "EspecialidadesNecesarias")
    private ArrayList<String> especialidadesNec;
    @Column(name = "TiempoDeResolución")
    private LocalDateTime tiempoResolucion;


    public Problema() {
    }

    public Problema(int tipo, LocalDateTime tiempoResolucion) {
        this.tipo = tipo;
        this.tiempoResolucion = tiempoResolucion;
    }

    public int getIdProblema() {
        return this.idProblema;
    }

    public void setIdProblema(int idProblema) {
        this.idProblema = idProblema;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getEspecialidadesNec() {
        return this.especialidadesNec;
    }

    public void setEspecialidadesNec(String especialidad) {
        this.especialidadesNec.add(especialidad);
    }

    public LocalDateTime getTiempoResolucion() {
        return this.tiempoResolucion;
    }

    public void setTiempoResolucion(LocalDateTime tiempoResolucion) {
        this.tiempoResolucion = tiempoResolucion;
    }

    public String toString() {
        return "[Tipo de problema: " + this.tipo + "\nTiempo de resolución estimada: " + this.tiempoResolucion + "]";
    }

    public String listarEspecialidadesNec() {
        String especialidades = "*Especialidades Necesarias:* \n- ";
        for(int i = 0; i <= especialidadesNec.size(); i++) {
            especialidades = especialidades + this.especialidadesNec.get(i) + "\n-";
        }
        return especialidades;
    }
}
