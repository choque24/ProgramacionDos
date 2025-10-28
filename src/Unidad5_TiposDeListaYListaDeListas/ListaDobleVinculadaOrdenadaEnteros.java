package Unidad5_TiposDeListaYListaDeListas;

/*2. a) Implementar la clase ListaDobleVinculada Ordenada de enteros con la representación de un puntero inicial y otro final. b)Hacer un programa que mediante un menú, permite crear una lista vacía, insertar un elemento, borrar, recorrer desde el inicio y recorrer desde el final.
 */
public class ListaDobleVinculadaOrdenadaEnteros {
    private NodoDobleEntero primero;
    private NodoDobleEntero ultimo;

    public ListaDobleVinculadaOrdenadaEnteros() {
        primero = null;
        ultimo = null;
    }

    public void insertarElementoOrdenado(int dato) {
        NodoDobleEntero nuevo = new NodoDobleEntero(dato);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(null);
            primero.setAnterior(null);
            return;
        }

        if (primero.getDato() > dato) {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
            return;
        }

        NodoDobleEntero actual = primero;

        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() < dato) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() == null) {
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
            setUltimo(nuevo);
            ultimo = nuevo;
        } else {
            actual.getSiguiente().setAnterior(nuevo);
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
        }
    }

    public void eliminarElementoOrdenado(int dato) {
        if (primero == null) {
            return;
        }

        if (primero.getDato() == dato) {
            if (primero.getSiguiente() == null) {
                primero = null;
                ultimo = null;
            } else {
                primero = primero.getSiguiente();
                primero.setAnterior(null);
            }
            return;
        }

        NodoDobleEntero actual = primero;

        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() < dato) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null && actual.getSiguiente().getDato() == dato) {
            NodoDobleEntero nodoEliminar = actual.getSiguiente();
            actual.setSiguiente(nodoEliminar.getSiguiente());

            if (nodoEliminar.getSiguiente() == null) {
                ultimo = actual;
            } else {
                nodoEliminar.getSiguiente().setAnterior(actual);
            }
        }
    }

    public void mostrarListaDoble() {
        if (primero == null) {
            System.out.println("Lista Vacia");
            return;
        }

        NodoDobleEntero actual = primero;

        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println(" ");
    }

    public void mostrarListaDobleInversa() {
        if (primero == null) {
            System.out.println("Lista Vacia");
            return;
        }

        NodoDobleEntero actual = ultimo;

        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getAnterior();
        }
        System.out.println(" ");
    }

    public NodoDobleEntero getPrimero() {
        return primero;
    }

    public void setPrimero(NodoDobleEntero primero) {
        this.primero = primero;
    }

    public NodoDobleEntero getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDobleEntero ultimo) {
        this.ultimo = ultimo;
    }
}
