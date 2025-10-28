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
public class Ejercicio7 {
    public static void main(String[] args) {
        String rutaArchivoACopiar = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\datosCopy.txt";
        String rutaArchivoAPegar = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\datosPaste.txt";

        boolean archivoCopyExiste = Files.exists(Paths.get(rutaArchivoACopiar));
        boolean archivoPasteExiste = Files.exists(Paths.get(rutaArchivoAPegar));

        if (archivoCopyExiste && archivoPasteExiste) {
            copiarArchivo(rutaArchivoACopiar, rutaArchivoAPegar);
        } else {
            System.out.println("No rompas las bolas");
        }
    }

    public static void escribirArchivo(String rutaArchivoPaste, String linea) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivoPaste, true))) {
            bw.write(linea);
            bw.newLine();
            System.out.println("Copiando la linea: " + linea);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void copiarArchivo(String rutaArchivo, String rutaArchivoPaste) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                escribirArchivo(rutaArchivoPaste, linea);
            }
            System.out.println("Archivo copiado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
