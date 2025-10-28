package Unidad3_ListasSimples;

public class ListaSimpleEnterosClase {
    private Nodo primero;

    //Constructor
    public ListaSimpleEnterosClase() {
        this.primero = null; //Al inicio la lista esta vacia
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(primero); //El siguiente del nuevo nodo apunta al actual primero
        this.primero = nuevoNodo; // El nuevo nodo ahora es el primero
    }

    public void mostrarLista() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println("");
    }

    public void eliminarNodo(int dato) {
        Nodo actual = primero;
        Nodo anterior = null;

        //Buscar el nodo que contiene el dato a eliminar
        while (actual != null && actual.getDato() != dato) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        //Si actual es null, el dato no esta en la lista
        if (actual == null) {
            System.out.println("El dato " + dato + " no existe.");
        } else {
            //Enlazar el nodo anterior con el siguiente nodo despues del nodo actual
            if (actual == primero) {
                primero = primero.getSiguiente();//Caso especial: el dato esta en el primer nodo
            } else {
                anterior.setSiguiente(primero.getSiguiente());//Enlazar el nodo anterior con el siguiente
            }
        }
    }

    public void insertarOrdenado(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (this.primero == null || this.primero.getDato() > dato) {
            nuevoNodo.setSiguiente(primero);
            this.primero = nuevoNodo;
        } else {

            Nodo anterior = primero;
            Nodo actual = primero;

            while (actual != null && actual.getDato() < dato) {
                anterior = actual;
                actual = actual.getSiguiente();
            }
            nuevoNodo.setSiguiente(actual);
            anterior.setSiguiente(nuevoNodo);
        }
    }
}
