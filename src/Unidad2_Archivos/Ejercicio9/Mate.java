package Unidad2_Archivos.Ejercicio9;
import java.io.Serializable;

public class Mate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String color;
    private int capacidadLitros;

    public Mate(String color, int capacidadLitros) {
        this.color = color;
        this.capacidadLitros = capacidadLitros;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCapacidadLitros() {
        return capacidadLitros;
    }
    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public void llenarMate(){
        System.out.println("Mate de " + color + " llenado");
    }
    public void vaciarMate(){
        System.out.println("Mate vaciado");
    }

    @Override
    public String toString() {
        return "Mate {color = " + color + ", capacidadLitros = " + capacidadLitros + "}";
    }
}
