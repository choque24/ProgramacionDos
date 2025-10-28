package Unidad5_TiposDeListaYListaDeListas;

/*
1. a)Complete la clase ListaCircular de enteros de la teoría agregando un metodo eliminar(num).
  b)Hacer un programa que mediante un menú, permite crear una lista circular vacía, insertar un elemento, borrar un elemento, y mostrar la lista

*/

//todo: Refactorizar para tener una clase padre y las hijas(Ordenada y Desordenada)

public class ListaCircular {
    private NodoEntero primero;

    public ListaCircular() {
        primero = null;
    }

    public void mostrarLista() {
        if (primero == null) {
            System.out.println("Lista vacia");
            return;
        }

        NodoEntero actual = primero;

        while (actual.getSiguiente() != primero) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println(actual.getDato());
    }

    public void insertarElementoOrdenado(int dato) {
        NodoEntero nuevo = new NodoEntero(dato);

        if (primero == null) {
            primero = nuevo;
            nuevo.setSiguiente(primero);
            return;
        }

        NodoEntero actual = primero;

        if (actual.getDato() > dato) {
            nuevo.setSiguiente(actual);
            while (actual.getSiguiente() != primero) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            primero = nuevo;
            return;
        }

        while (actual.getSiguiente() != primero && actual.getSiguiente().getDato() < dato) {
            actual = actual.getSiguiente();
        }

        nuevo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevo);
    }

    public void eliminarElementoOrdenado(int dato) {
        /// Si la lista esta vacia salgo de una
        if (primero == null) {
            return;
        }

        NodoEntero actual = primero;

        if (actual.getDato() == dato) {
            /// Si el elemento es el primero vacio la lista
            if (primero.getSiguiente() == primero) {
                primero = null;
                return;
            }
            while (actual.getSiguiente() != primero) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(primero.getSiguiente());
            primero = primero.getSiguiente();
            return;
        }

        while (actual.getSiguiente() != primero && actual.getSiguiente().getDato() < dato) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente().getDato() == dato) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }

    public void setPrimero(int dato) {
        this.primero = new NodoEntero(dato);
    }

}
