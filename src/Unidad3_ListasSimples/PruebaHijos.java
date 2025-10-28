package Unidad3_ListasSimples;
/*
Ejercicio 4:  Usar en un programa instancias de clase Lista simple de enteros  ordenada
Realizar un programa que cree una lista ordenada con datos cargados por el usuario y luego debe informar por pantalla si se encuentra un elemento dado por el usuario
*/

import java.util.Scanner;

public class PruebaHijos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaSimpleEnterosSinOrdenHijo lista = new ListaSimpleEnterosSinOrdenHijo();
        ListaSimpleEnteros listaNormal = new ListaSimpleEnteros();
        ListaSimpleEnterosOrdenada listaOrdenada = new ListaSimpleEnterosOrdenada();

        lista.insertarAlPrincipio(10);
        lista.insertarAlPrincipio(20);
        lista.insertarAlPrincipio(30);
        lista.insertarAlPrincipio(5);
        lista.mostrarLista();
        System.out.println("El primero es: " + lista.getPrimero().getDato());
        System.out.println("El nodo minimo es: " + lista.getNodoMinimo().getDato());
//        listaOrdenada.insertarElementoOrdenado(10);
//        listaOrdenada.insertarElementoOrdenado(20);
//        listaOrdenada.insertarElementoOrdenado(30);
//        listaOrdenada.insertarElementoOrdenado(20);
//        listaOrdenada.insertarElementoOrdenado(5);
//        listaOrdenada.insertarElementoOrdenado(50);
//        listaOrdenada.mostrarLista();
//
//        listaOrdenada.borrarElementoOrdenado(10);
//        listaOrdenada.borrarElementoOrdenado(5);
//        listaOrdenada.borrarElementoOrdenado(50);
//        listaOrdenada.borrarElementoOrdenado(50);
//        System.out.println("Lista normal:");
//        listaOrdenada.mostrarLista();
//        System.out.println("lista recursivo:");
//        listaOrdenada.mostrarListaRecursivo();
//        System.out.println("ListaInversaRecursivo:");
//        listaOrdenada.mostrarListaInversaRecursivo();
//
//        System.out.println("Ingrese el primer elemento para buscarlo en la lista: ");
//        int elemento = sc.nextInt();
//        System.out.println("El elemento " + elemento + " se encuentra en lista?: " +
//                listaOrdenada.estaElemento(elemento));
//
//        System.out.println("Ingrese el segundo elemento para buscarlo en la lista: ");
//        elemento = sc.nextInt();
//        System.out.println("El elemento " + elemento + " se encuentra en lista?: " +
//                listaOrdenada.estaElemento(elemento));
//
//        Nodo nodo = new Nodo(elemento);
//        listaNormal.setPrimero(nodo);
//
//        listaNormal.mostrarLista();
//        listaNormal.mostrarListaRecursivo();
//        listaNormal.mostrarListaInversaRecursivo();
//        System.out.println("La cantidad de elementos es: " + listaNormal.getCantidadElementos());
//        System.out.println("La suma de los elementos es: " + listaNormal.getSumaElementos());
//        System.out.println("La suma de los elementos Recursiva es: " + listaNormal.getSumaElementosRecursivo());
//        System.out.println("La suma de los elementos Recursiva es: " + listaOrdenada.getSumaElementosRecursivo());
    }
}
