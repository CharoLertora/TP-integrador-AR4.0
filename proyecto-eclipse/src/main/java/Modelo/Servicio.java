package Modelo;


public class Servicio{
    String tipo;

    public enum opcionesServicio {
        LINUX,
        WINDOWS,
        MACOS,
        CONEXIONINTERNET,
        DISPOSITIVO,
        ANTIVIRUS
    }

    public Servicio(opcionesServicio opciones){

        switch (opciones) {
            case LINUX:
                this.tipo = "LINUX";
                break;
            case WINDOWS:
                this.tipo = "WINDOWS";
                break;
            case MACOS:
                this.tipo = "MACOS";
                break;
            case CONEXIONINTERNET:
                this.tipo = "Conexión de Internet";
                break;
            case DISPOSITIVO:
                this.tipo = "Compra de dispositivo";
                break;
            case ANTIVIRUS:
                this.tipo = "Compra de antivirus";
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

