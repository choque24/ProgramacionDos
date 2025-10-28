package Unidad2_Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*Ejercicio 4: Leer y Contar Líneas de un Archivo
Objetivo: Practicar la lectura línea por línea.
Descripción: Crear un programa que lea un archivo "datos.txt" y cuente cuántas líneas contiene. Mostrar el resultado en la consola.*/
public class Ejercicio4 {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\datos4.txt";
        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

        if (archivoExiste) {
            try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
                int contador = 0;
                while (br.readLine() != null) {
                    contador++;
                }
                System.out.println("El archivo en la ruta " + rutaArchivo + " tiene " + contador + " lineas.");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error en la lectura del archivo");
            }
        } else {
            System.out.println("El archivo no existe, por lo tanto no tiene lineas");
        }
    }
}
