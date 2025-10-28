package Unidad2_Archivos.Ejercicio9;

import Unidad2_Archivos.Persona;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RecuperarInstancias {
    public static void main(String[] args) {
        Mate mate = null;
        Mate mate2 = null;
        String archivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\mate3.txt";

        try(ObjectInputStream deserializador = new ObjectInputStream(new FileInputStream(archivo))) {
            mate = (Mate) deserializador.readObject();
            mate2 = (Mate) deserializador.readObject();
            System.out.println("Objeto deserializado: " + mate);
            System.out.println("Objeto deserializado: " + mate2);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Clase no encontrada");
        }

        System.out.println(mate.getColor());
    }
}
