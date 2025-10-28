package Unidad2_Archivos;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArchivoLectura {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\archivo5.txt";
        System.out.println("La ruta archivo es: " + rutaArchivo);

        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

        if (archivoExiste) {
            System.out.println("El archivo " + rutaArchivo + " existe y el contenido es: ");
            try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo " + rutaArchivo + " no existe");
        }
    }
}
