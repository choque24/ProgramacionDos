package Unidad3_ListasSimples;
/*
Ejercicio 2:  Usar en un programa instancias de clase Lista simple de enteros  sin orden
Realizar un programa que cree dos instancias de Lista simple de Enteros, ListaUno y ListaDos (en ambos se debe permitir cargar la cantidad de elementos que usuario quiera) y luego informe por pantalla cual de las dos es mayor según la suma de sus elementos
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaSimpleEnterosSinOrden listaUno = new ListaSimpleEnterosSinOrden();
        ListaSimpleEnterosSinOrden listaDos = new ListaSimpleEnterosSinOrden();

        //Tendria que ir un while con la pregunta si desea seguir ingresando elementos
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un numero: ");
            int numero = sc.nextInt();//Suponemos que el usuario es piola
            listaUno.insertarAlPrincipio(numero);
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un numero: ");
            int numero = sc.nextInt();
            listaDos.insertarAlPrincipio(numero);
        }

        System.out.print("Lista uno: ");
        listaUno.mostrarLista();
        System.out.println("La suma de sus elementos es: " + listaUno.getSumaElementos());

        System.out.println("");
        System.out.print("Lista dos: ");
        listaDos.mostrarLista();
        System.out.println("La suma de sus elementos es: " + listaDos.getSumaElementos());

        System.out.println("La lista con la suma mas grande es: " +
                (listaUno.getSumaElementos() > listaDos.getSumaElementos() ? "listaUno" : "listaDos") +
        " con una suma de " + (Math.max(listaUno.getSumaElementos(), listaDos.getSumaElementos())));


    }
}
