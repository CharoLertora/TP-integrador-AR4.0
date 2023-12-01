package proyecto.Modelo;

import java.util.ArrayList;

import jakarta.persistence.*;

@Entity
@Table(name = "Técnico")
public class Tecnico {
    @Id
    @Column(name = "idTecnico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Especialidades")
    private ArrayList<String> especialidades = new ArrayList<>();

    Tecnico(){}
    
    public Tecnico(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<String> getEspecialidades() {
        return this.especialidades;
    }

    public void setEspecialidades(String especialidad) {
        this.especialidades.add(especialidad);
    }

    public String toString() {
        return "[Nombre: " + this.nombre + "\nApellido: " + this.apellido + "]";
    }

    public String listarEspecialidades() {
        String especialidades = "*Especialidades:* \n- ";
        for(int i = 0; i <= this.especialidades.size(); i++) {
            especialidades = especialidades + this.especialidades.get(i) + "\n-";
        }
        return especialidades;
    }
}

