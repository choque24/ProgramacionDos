package Unidad7_EstructurasCombinadas.Ejercicio1;

public class NodoEquipo {
    private Equipo equipo;
    private NodoEquipo menores;
    private NodoEquipo mayores;
    private NodoEquipo siguientePuntaje;

    public NodoEquipo(Equipo equipo) {
        this.equipo = equipo;
        menores = null;
        mayores = null;
        siguientePuntaje = null;
    }


    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public NodoEquipo getMenores() {
        return menores;
    }

    public void setMenores(NodoEquipo menores) {
        this.menores = menores;
    }

    public NodoEquipo getMayores() {
        return mayores;
    }

    public void setMayores(NodoEquipo mayores) {
        this.mayores = mayores;
    }

    public NodoEquipo getSiguientePuntaje() {
        return siguientePuntaje;
    }

    public void setSiguientePuntaje(NodoEquipo siguientePuntaje) {
        this.siguientePuntaje = siguientePuntaje;
    }
}
