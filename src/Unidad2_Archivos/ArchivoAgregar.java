package Unidad2_Archivos;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArchivoAgregar {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\archivo2.txt";

        // Verificar si el archivo ya existe
        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

        if (archivoExiste) {
            // Agregar al final del archivo
            String texto = leerTexto();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, true))) { // El "true" indica abrirlo para append
                bw.newLine(); // Agregar un nuevo salto de línea si el archivo ya existe
                bw.write(texto);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo " + rutaArchivo + " NO existe, no puedo agregarle contenido al final !");
        }
    }

    private static String leerTexto() {
        //Hubiera sido bueno un try cathc
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine(); // Lee toda la línea de entrada
        scanner.close();
        return cadena;
    }
}