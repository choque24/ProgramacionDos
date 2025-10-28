package Unidad5_TiposDeListaYListaDeListas;

import java.util.Scanner;

/*  b)Hacer un programa que mediante un menú, permite crear una lista circular vacía, insertar un elemento, borrar un elemento, y mostrar la lista
 */
//todo Sistema try catch para manejar cuando el usuario no ingresa un entero
public class ListaCircularMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircular lista = new ListaCircular(); // o ListaCircularOrdenada si refactorizás

        int opcion, dato;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Dato a insertar: ");
                    dato = sc.nextInt();
                    lista.insertarElementoOrdenado(dato);
                    break;
                case 2:
                    System.out.print("Dato a eliminar: ");
                    dato = sc.nextInt();
                    lista.eliminarElementoOrdenado(dato);
                    break;
                case 3:
                    lista.mostrarLista();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
