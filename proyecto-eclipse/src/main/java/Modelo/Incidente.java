package Modelo;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "Incidente")
public class Incidente {
    @Id
    @Column(name = "idIncidente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidente;
    @Column(name = "idTecnico")
    private int idTecnico;
    @Column(name = "idCliente")
    private int idCliente;
    @Column(name = "Descripción")
    private String descripcion;
    @Column(name = "FechaDeIngreso")
    private LocalDateTime fechaIngreso;
    @Column(name = "FechaDeResolución")
    private LocalDateTime fechaResolucion;
    @Column(name = "TipoDeProblema")
    private int tipoProblema;

    public Incidente() {}

    public Incidente(int idTecnico, int idCliente, String descripcion, LocalDateTime fechaIngreso, LocalDateTime fechaResolucion, int tipoProblema) {
        this.idTecnico = idTecnico;
        this.idCliente = idCliente;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.fechaResolucion = fechaResolucion;
        this.tipoProblema = tipoProblema;
    }

    public int getIdIncidente() {
        return this.idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public int getIdTecnico() {
        return this.idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaResolucion() {
        return this.fechaResolucion;
    }

    public void setFechaResolucion(LocalDateTime fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getTipoProblema() {
        return this.tipoProblema;
    }

    public void setTipoProblema(int tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

}
