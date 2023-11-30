package Modelo;

import java.util.ArrayList;

import jakarta.persistence.*;

@Entity
@Table
public class Cliente {
    @Id
    @Column(name = "CUIT")
    int cuit;
    @Column(name = "RazonSocial")
    String razonSocial;
    @Column(name = "ServiciosContratados")
    ArrayList<String> serviciosContratados;


    public Cliente() {}

    public Cliente(int cuit, String razonSocial, ArrayList<String> serviciosContratados) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.serviciosContratados = serviciosContratados;
    }

    public int getCuit() {
        return this.cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<String> getServiciosContratados() {
        return this.serviciosContratados;
    }

    public void setServiciosContratados(ArrayList<String> serviciosContratados) {
        this.serviciosContratados = serviciosContratados;
    }

}
