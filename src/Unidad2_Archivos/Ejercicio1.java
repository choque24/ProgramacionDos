package Unidad2_Archivos;

/*
Ejercicio 1: Crear y Escribir en un Archivo de Texto Simple
Objetivo: Introducir la creación y escritura básica de archivos.
Descripción: Crear un programa en Java que genere un archivo de texto llamado "saludo.txt" y escriba en él la frase "Hola Mundo".
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio1 {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\saludo.txt";

        //Verificamos si el archivo ya existe
        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

        if (!archivoExiste) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
                String linea = "Hola mundo";
                bw.newLine();
                bw.write(linea);
                System.out.println("Archivo creada con exito, con la frase " + linea);
            } catch (IOException e){
                e.printStackTrace();
                System.out.println("No se puede crear el archivo");
            }
        } else {
            System.out.println("El archivo ya existe");
        }
    }
}
