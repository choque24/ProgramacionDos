package Unidad2_Archivos.Ejercicio9;
/*
*     Ejercicio 9: Grabar y Leer Instancias
Objetivo: Persistir instancias mediante archivos.
Descripción: Programe una clase (puede utilizar alguna de las definidas en el Práctico 1) con sus atributos y luego cree una Clase GuardarInstancias.java que cree dos instancias y las guarde en un archivo y luego la clase RecuperarInstancias.java que lea la información de ese archivo y cree de nuevo las dos instancias con todos los mismos valores de atributos que tenían las originales.
*/
import Unidad2_Archivos.Persona;

import java.io.*;

public class GuardarInstancias {

    public static void main(String[] args) {
        Persona persona = new Persona("Mauricio", 19);
        Persona persona2 = new Persona("Juan", 20);
        Mate mate = new Mate("Verde", 20);
        Mate mate2 = new Mate("Azul", 10);

        Mate mateArreglo[] = new Mate[3];
        mateArreglo[0] = new Mate("Rojo", 10);
        mateArreglo[1] = new Mate("Violeta", 10);

        mateArreglo[0].llenarMate();
        System.out.println(mateArreglo[0]);

        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\mate3.txt";

        try(ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream(rutaArchivo))){
//            for(int i = 0; i < mateArreglo.length; i++){
//                serializador.writeObject(mateArreglo[i]);
//                System.out.println(mateArreglo[i]);
//            }
            serializador.writeObject(mate);
            serializador.writeObject(mate2);
            System.out.println("Objetos guardado en el archivo: " + rutaArchivo);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
