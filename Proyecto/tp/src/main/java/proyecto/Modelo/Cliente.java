package proyecto.Modelo;

import java.util.ArrayList;

import jakarta.persistence.*;

@Entity
@Table
public class Cliente {
    @Id
    @Column(name = "CUIT")
    private int cuit;
    @Column(name = "RazonSocial")
    private String razonSocial;
    @Column(name = "ServiciosContratados")
    private ArrayList<String> serviciosContratados;


    public Cliente() {}

    public Cliente(int cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }

    protected int getCuit() {
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

    public void setServiciosContratados(String servicio) {
        this.serviciosContratados.add(servicio);
    }

    public String toString() {
        return "Cliente: [cuit= " + this.cuit + "\n Razon Social: " + this.razonSocial + "]";
    }

    public String listarServiciosCliente() {
        String servicios = "*Servicios Contratados:* \n- ";
        
        for (int i = 0; i <= this.serviciosContratados.size(); i++) {
            servicios = servicios + this.serviciosContratados.get(i) + "\n-";
        }

        return servicios;
    }
}
