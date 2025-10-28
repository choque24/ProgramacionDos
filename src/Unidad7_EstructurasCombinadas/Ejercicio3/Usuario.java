package Unidad7_EstructurasCombinadas.Ejercicio3;

public class Usuario {
    private int nro_usuario;
    private String nombre;

    public Usuario(int nro_usuario, String nombre) {
        this.nro_usuario = nro_usuario;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro_usuario() {
        return nro_usuario;
    }

    public void setNro_usuario(int nro_usuario) {
        this.nro_usuario = nro_usuario;
    }
}
