package Unidad6_Arboles;

import java.util.Scanner;

/*
* 2)Hacer un procedimiento que imprima los números del árbol del ejercicio 1: a) en orden ascendente(in-order). b) en orden descendente(in-order) c) imprimir de tal forma que no se imprima un padre si no se han impreso todos sus hijos (post-order). d) imprimir los números del árbol anterior de tal forma que no se imprima un nodo si no se ha impreso su padre (pre-order).
 */
public class UsoArbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();

        System.out.println("Arbol Recien iniciado. Vacio: " + arbol);
        System.out.println("La cantidad de Nodos que tiene el arbol es: " + arbol.getCantidadNodos());
        arbol.inOrdenAscendente();

        arbol.insertar(10);

        arbol.insertar(20);
//
        arbol.insertar(30);
//
        System.out.println("La cantidad de Nodos que tiene el arbol (3 elementos): " + arbol.getCantidadNodos());
//        arbol.insertar(30);
//
//        arbol.insertar(10);
//
//        arbol.insertar(25);
//
        arbol.insertar(5);
//        arbol.insertar(40);
        arbol.insertar(7);
        arbol.insertar(6);
//        arbol.insertar(15);
//        arbol.insertar(45);

        System.out.println("La cantidad de Nodos que tiene el arbol es: " + arbol.getCantidadNodos());
        System.out.println("Arbol en Orden Ascendente: ");
        arbol.inOrdenAscendente();

        System.out.println("Arbol en Orden Descendente: ");
        arbol.inOrdenDescendente();

        System.out.println("Arbol en Orden Pre Orden: ");
        arbol.preOrden();

        System.out.println("Arbol en Orden Post Orden: ");
        arbol.postOrden();


//        for (int i = 0; i < 10; i++) {
//            System.out.print("Ingrese valor para eliminarlo del arbol: ");
//            int valor = sc.nextInt();
//            arbol.insertar(valor);
//            System.out.println("El menor de los elementos del arbol es: " + arbol.getMenor().getValor());
//            arbol.eliminar(valor);
//            System.out.println("");
//
//            System.out.println("Arbol en Orden Ascendente: ");
//            arbol.inOrdenAscendente();
//
//            System.out.println("Arbol en Orden Descendente: ");
//            arbol.inOrdenDescendente();
//
//            System.out.println("Arbol en Orden Pre Orden: ");
//            arbol.preOrden();
//
//            System.out.println("Arbol en Orden Post Orden: ");
//            arbol.postOrden();
//
//            System.out.println("");
//        }

        System.out.println("El menor si estuviera desordenado: " + arbol.getMenorDesordenado().getValor());
        System.out.println("La longitud mayor del arbol es: " + arbol.getLongitudMayorRama());

//        ListaSimple lista = new ListaSimple();
//        lista.mostrarLista();
//
//        arbol.intoListaPreorder(lista);
//        lista.mostrarLista();
//        arbol.sumarPadreNodoHijos();
//        arbol.inOrdenAscendente();
//        arbol.postOrden();

        System.out.println("La cantidad de Nodos que tiene el arbol es: " + arbol.getCantidadNodos());
        System.out.println("La cantidad de Nodos que tiene el arbol es: " + arbol.getCantidadNodosChat());
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ingrese los valores Min y max para obtener la cantidad de nodos que hay en el arbol; ");
//            int minValor = sc.nextInt();
//            int maxValor = sc.nextInt();
//
//            System.out.println("La cantidad de nodos que hay entre " + minValor + " y max " + maxValor + " es: " + arbol.getCantidadNodosEntre(minValor, maxValor));
//            sc.nextLine();
        ListaSimple lista = new ListaSimple();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        System.out.println("La cantidad de elementos de la lista es: " + lista.getCantidadElementos());
        lista.mostrarLista();
        
    }
}
