package Unidad3_ListasSimples;

/*Ejercicio 3:  Implementar clase Lista simple de enteros  ordenada
Implementar una clase Lista simple de Enteros ordenada de menor a mayor con los métodos insertar Ordenado, borrarElemento y buscar un elemento.
*/
public class ListaSimpleEnterosOrdenada extends ListaSimpleEnteros {

    public ListaSimpleEnterosOrdenada() {
        super();
    }

    public boolean estaElemento(int elemento) {
       Nodo actual = primero;

        while (actual != null && actual.getDato() < elemento) {
            actual = actual.getSiguiente();
        }

        return (actual != null && elemento == actual.getDato());
    }

    public void insertarElementoOrdenado(int elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (primero == null || primero.getDato() > elemento) {
            nuevo.setSiguiente(primero);
            primero = nuevo;
            return;
        }

        Nodo actual = primero;
//arte
        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() < elemento) {
            actual = actual.getSiguiente();
        }
        nuevo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevo);
    }

    public void borrarElementoOrdenado(int elemento) {
        Nodo actual = primero;

        //Si la lista esta vacia o el primer elemento ya es mayor no elimina nada
        if (primero == null || primero.getDato() > elemento) {
            return;
        }

        //Si el primero de la lista es el elemento lo elimino
        if (primero.getDato() == elemento) {
            primero = primero.getSiguiente();
            return;
        }

        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() < elemento) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null && actual.getSiguiente().getDato() == elemento) {
//            actual = actual.getSiguiente().getSiguiente();
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }
}
