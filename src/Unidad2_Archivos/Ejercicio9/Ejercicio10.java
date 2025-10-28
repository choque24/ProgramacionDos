package Unidad2_Archivos.Ejercicio9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.EOFException;
/*Ejercicio 10: Búsqueda
Objetivo: Realizar búsquedas en archivos.
Descripción: Haga un programa que le pida al usuario el valor de algún atributo de la clase definida en el ejercicio anterior y muestre por pantalla la primer instancia que contiene ese valor si es que existe.*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mate mate = null;
        boolean encontrado = false;

        System.out.println("Ingrese un atributo: ");
        String valorAtributo = sc.nextLine();

        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\mateasdjk.txt";

        try (ObjectInputStream deserializador = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            while (!encontrado) {
                mate = (Mate) deserializador.readObject();
//                Elijo buscar el atributo color
                if ((mate.getColor()).equals(valorAtributo)) {
                    encontrado = true;
                    System.out.println(mate);
                }
            }
        } catch (EOFException e) {
            if (!encontrado) {
                System.out.println("No se encontró ningún objeto con ese valor de atributo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
