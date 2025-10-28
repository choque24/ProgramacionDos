package Unidad2_Archivos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Ejercicio 5: Escribir y Leer un Archivo de Texto con Datos Numéricos
Objetivo: Introducir la lectura y escritura de datos numéricos.
Descripción: Crear un programa que permita al usuario ingresar 5 números enteros, los escriba en un archivo "numeros.txt" (uno por línea) y luego los lea y los muestre en la consola. Para esto deberá utilizar una utilidad de conversión de tipos (investigue).
*/
public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\numeros2.txt";
        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

        if (!archivoExiste) {
            escribirArchivo(rutaArchivo);
            leerArchivo(rutaArchivo);
        } else {
            System.out.println("Ya existe el archivo. Y no pienso Borrarlo");
        }
    }

    public static void leerArchivo(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escribirArchivo(String rutaArchivo) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (int i = 0; i < 5; i++) {
                br.write(String.valueOf(obtenerEntero()));
                br.newLine();
            }
            System.out.println("5 numeros enteros escritos con exito");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se puede escribir el archivo");
        }
    }

    //Pido un entero al usuario
    public static int obtenerEntero() {
        boolean esCorrecto = false;
        int entero = 0;

        while (!esCorrecto) {
            System.out.print("Ingrese un numero: ");
            try {
                entero = sc.nextInt();
                esCorrecto = true;
            } catch (Exception e) {
                System.out.println("Te dije un entero papa! Hacelo de vuelta pero no me hagas enojar");
                sc.nextLine();
            }
        }
        return entero;
    }
}
