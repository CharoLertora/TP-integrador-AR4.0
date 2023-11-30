package Modelo;

public class Especialidad {
    
    String tipo;

    public enum Opciones {
        SOWINDOWS,
        SOLINUX,
        SOMACOS,
        HARDWARE,
        REDES,
        SEGURIDAD    
    }
    public Especialidad(Opciones opciones){

        switch (opciones) {
            case SOWINDOWS:
                this.tipo = "Soft. Windows";
                break;
            case SOLINUX:
                this.tipo = "Soft. Linux";
                break;
            case SOMACOS:
                this.tipo = "Soft. MacOS";
                break;
            case HARDWARE:
                this.tipo = "Hardware";
                break;
            case REDES:
                this.tipo = "Redes";
                break;
            case SEGURIDAD:
                this.tipo = "Seguridad";
                break;
            default:
                break;
        }
    }


    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
