package Unidad2_Archivos;
/*
* Ejercicio 6: Appender (Agregar Datos) a un Archivo Existente
Objetivo: Aprender a agregar información a un archivo ya existente.
Descripción: Modificar el programa del ejercicio 3 para que en lugar de sobreescribir el archivo "datos.txt", agregue nuevas líneas al final del archivo sin borrar las existentes. Para esto tenga en cuenta el segundo parámetro del método FileWriter
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las lineas de texto que desee: ");
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\datos.txt";

        //No hace falta esta previa verificacion ya que el file writer crea el archivo si es que no existe
//        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

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