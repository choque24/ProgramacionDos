package Unidad2_Archivos;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArchivoCreacion {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\archivo5.txt";

        // Verificar si el archivo ya existe
        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

        if (!archivoExiste) {
            // Crear o agregar al archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
                bw.write("Primer línea del archivo.....");
                bw.newLine();
                bw.write("Otra línea de contenido (ultima en la creacion).");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo " + rutaArchivo +
                    " ya existe, no voy a crearlo vacío de nuevo porque perdería lo que tiene !");
        }
    }
}
