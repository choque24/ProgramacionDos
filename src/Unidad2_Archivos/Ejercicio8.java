package Unidad2_Archivos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*Ejercicio 8: Buscar y Reemplazar Texto en un Archivo
Objetivo: Introducir conceptos más avanzados de procesamiento de archivos.
Descripción: Crear un programa que lea un archivo "texto.txt", busque una palabra dada por el usuario y la reemplace por otra palabra también dada por el usuario, guardando el resultado en un nuevo archivo "resultado.txt".
*/
public class Ejercicio8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String rutaArchivoTexto = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\texto.txt";
        String rutaArchivoResultado = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\resultado.txt";

        boolean archivoExisteTexto = Files.exists(Paths.get(rutaArchivoTexto));

        System.out.println("Ingrese la palabra a buscar: ");
        String texto = sc.nextLine();

        System.out.println("Ingrese la palabra con la que lo quiere reemplazar: ");
        String reemplazo = sc.nextLine();

        if (archivoExisteTexto) {
            buscarYReemplazarTexto(rutaArchivoTexto, rutaArchivoResultado, texto, reemplazo);
        } else {
            System.out.println("Archivo no encontrado, no se trabajar el archivo");
        }
    }

    public static void buscarYReemplazarTexto(String rutaArchivo, String rutaArchivoResultado, String texto, String reemplazo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivoResultado))) {
            String linea;
            while ((linea = br.readLine()) != null) {
//              En caso de buscar mauri y querer reemplazarlo con hora, cuando encuentra mauricio, termina horacio
//                Para que solamente sea la palabra entera mauri y no cuente mauricio podemos usar esta linea
//                String lineaModificada = linea.replaceAll("\\b" + texto + "\\b", reemplazo);
                String lineaModificada = linea.replace(texto, reemplazo);
                System.out.println("Linea Original: " + linea);
                System.out.println("Linea Modificada: " + lineaModificada);
                bw.write(lineaModificada);
                bw.newLine();
            }
            System.out.println("Archivo Copiado Correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
