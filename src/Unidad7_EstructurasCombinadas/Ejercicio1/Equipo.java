package Unidad7_EstructurasCombinadas.Ejercicio1;

import java.io.Serializable;

public class Equipo implements Serializable {
    private int puntaje;
    private String nombre;

    public Equipo(int puntaje, String nombre) {
        this.puntaje = puntaje;
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
