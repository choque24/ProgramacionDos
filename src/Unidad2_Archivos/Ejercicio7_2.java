package Unidad2_Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*Ejercicio 7: Copiar el Contenido de un Archivo a Otro
Objetivo: Introducir la manipulación de archivos más avanzada.
Descripción: Crear un programa que lea el contenido de un archivo "datos.txt" y lo copie en otro archivo llamado "copia.txt".
*/
public class Ejercicio7_2 {
    public static void main(String[] args) {
        String rutaArchivoACopiar = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\datosCopy.txt";
        String rutaArchivoAPegar = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\datosPaste.txt";

        boolean archivoCopyExiste = Files.exists(Paths.get(rutaArchivoACopiar));
        boolean archivoPasteExiste = Files.exists(Paths.get(rutaArchivoAPegar));
        if (archivoCopyExiste && archivoPasteExiste) {
            copiarArchivoEn(rutaArchivoACopiar, rutaArchivoAPegar);
        } else {
            System.out.println("No se puede copiar el archivo");
        }
    }

    public static void copiarArchivoEn(String rutaArchivoACopiar, String rutaArchivoPaste) {
        try (
                BufferedReader lector = new BufferedReader(new FileReader(rutaArchivoACopiar));
                BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivoPaste, true))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();
                System.out.println("Copiando linea: " + linea);
            }
            System.out.println("\nArchivo copiado");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se puede copiar el archivo");
        }
    }
}