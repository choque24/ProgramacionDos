package Unidad2_Archivos;

import java.io.BufferedReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/*Ejercicio 2: Leer y Mostrar Contenido de un Archivo de Texto
Objetivo: Introducir la lectura de archivos.
Descripción: Crear un programa que lea el archivo "saludo.txt" creado en el ejercicio anterior y muestre su contenido en la consola.*/
public class Ejercicio2 {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\saludo.txt";
        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));
        if (archivoExiste) {
            try(BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                while((linea = lector.readLine()) != null){
                    System.out.println(linea);
                }
            } catch (IOException e){
                e.printStackTrace();
                System.out.println("No se ha podido leer el archivo");
            }
        } else {
            System.out.println("El archivo " + rutaArchivo + " no existe");
        }
    }
}
