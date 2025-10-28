package Unidad2_Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*Ejercicio 3: Escribir Varias Líneas en un Archivo
Objetivo: Ampliar el conocimiento de escritura en archivos.
Descripción: Crear un programa que escriba varias líneas de texto en un archivo llamado "datos.txt". Las líneas pueden ser introducidas por el usuario a través de la consola.*/

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las lineas de texto que desee: ");
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\datos4.txt";

        //No hace falta esta previa verificacion ya que el file writer crea el archivo si es que no existe
        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

        //El true permite agregar contenido si ya existe el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            String linea = "";
            while (!(linea = sc.nextLine()).equals("adios")) {
                writer.newLine();
                writer.write(linea);
            }
            System.out.println("Se ha ingresado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        No hace falta ya que usamos try with resources, que una vez terminado cierra el write para ahorrar recursos y prevenir futuros errores
//        finally {
//            sc.close(); // opcional pero recomendable
//        }

    }
}