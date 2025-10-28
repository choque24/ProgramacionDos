package ProgramaUno;
/*
Objetivo: A lo largo de este práctico, trabajarás con un conjunto de ejercicios que te permitirán explorar los conceptos de programación orientada a objetos. Deberás identificar y modelar objetos del mundo real, utilizando herencia, composición, atributos y métodos.

        Ejercicio 1: Modelado Básico de Clases
        Elige un escenario del mundo real (por ejemplo, una biblioteca, una tienda de mascotas, una escuela, etc.). Intenta que no sea ninguno de estos nombrados arriba ni de los modelos ya conocidos.
        Identifica al menos tres objetos que pertenezcan a ese escenario.
        Para cada objeto, define una clase con al menos tres atributos y dos métodos.
        Escribe el código java incluyendo las clases, atributos y encabezados de los métodos, no es necesario desarrollarlos.
*/

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero entero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int edad = obtenerEdad(10);
        System.out.println("El numero es: " + numero + " y el edad es: " + edad);


    }
    public static int obtenerEdad(int edad) {
        return edad;
    }
}
