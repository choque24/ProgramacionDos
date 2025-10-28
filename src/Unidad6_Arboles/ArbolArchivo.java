package Unidad6_Arboles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
/*1)Se tiene un archivo desordenado con números enteros. Se pretende que realice un procedimiento que lea todos los números del archivo y genere un árbol ordenado en forma ascendente.
 */
public class ArbolArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\ArbolArchivo.txt";
        Arbol arbol = new Arbol();

        boolean existe = Files.exists(Paths.get(rutaArchivo));

        if(existe) {
            try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    arbol.insertar(Integer.parseInt(linea));
                }
                System.out.println("Numeros insertados correctamente en el arbol");
                arbol.inOrdenAscendente();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No se puede leer el archivo");
            }
        } else {
            System.out.println("No se encontro el archivo");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
                System.out.println("Archivo creado en la locacion: " + rutaArchivo);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Ocurrio un error al crear el archivo");
            }
        }
    }
}
