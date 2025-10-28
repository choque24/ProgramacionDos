package Unidad3_ListasSimples;

/*Ejercicio 1:  Implementar clase Lista simple de enteros  sin orden
Implementar una clase Lista simple de Enteros sin ningún orden con todos los métodos necesarios para insertar al principio, insertar al final, borrar un elemento y mostrar todos los elementos. Además implemente los métodos públicos y (privados de ser necesario) para realizar las siguientes tareas:
Retornar  la suma de los elementos de la lista simple.
Retornar la cantidad de elementos de la lista
Retornar el promedio de los elementos de la lista
Retornar el mínimo nodo de la  lista.
*/
public class ListaSimpleEnterosSinOrden {
    private Nodo primero = null;
    private Nodo ultimo = null;

    //CONSTRUCTOR
    public ListaSimpleEnterosSinOrden() {
        primero = null;
        ultimo = null;
    }

    //    METODOS CRUD
//Insercion
    public void insertarAlPrincipio(int dato) {
        Nodo nodo = new Nodo(dato);
        nodo.setSiguiente(primero);
        setPrimero(nodo);
    }

    public void insertarAlFinal(int dato) {
        Nodo nodo = new Nodo(dato);
        Nodo actual = primero;

        if (actual == null) {
            setPrimero(nodo);
            return;
        }

        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nodo);
    }

    //Eliminacion
    public void borrarElemento(int dato) {
        Nodo actual = primero;
        Nodo anterior = null;

        //Recorro la lista hasta encontrar el dato
        while (actual != null && dato != actual.getDato()) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        /// No se elimina ningun nodo(Lista vacia o sin el elemento)
        if (actual == null) {
            System.out.println("No se encontro el elemento");
            return;
        }

        if (anterior == null) {
            /// El nodo esta en el principio
            setPrimero(primero.getSiguiente());
        } else {
            /// El nodo a borrar esta en la mitad o el final
            anterior.setSiguiente(actual.getSiguiente());
        }
    }

    //    Metodos Especificos
    public void mostrarLista() {
        Nodo actual = primero;

        if (actual == null) {
            System.out.print("Lista Vacia");
        }
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println(" ");
    }

    //    Retornar  la suma de los elementos de la lista simple.
    public int getSumaElementos() {
        Nodo actual = primero;
        int suma = 0;

        while (actual != null) {
            suma += actual.getDato();
            actual = actual.getSiguiente();
        }
        return suma;
    }

    //    Retornar la cantidad de elementos de la lista
    public int getCantidadElementos() {
        Nodo actual = primero;
        int cantidad = 0;
        while (actual != null) {
            cantidad++;
            actual = actual.getSiguiente();
        }
        return cantidad;
    }

    //Retornar el promedio de los elementos de la lista
    public double getPromedioElementos() {
        double cantidadElementos = getCantidadElementos();

        if (cantidadElementos == 0) {
            return 0;
        }

        double sumaElementos = getSumaElementos();
        return (sumaElementos / cantidadElementos);

    }

    //    Retornar el mínimo nodo de la  lista.
    public Nodo getNodoMinimo() {
        Nodo nodoActual = primero;
        Nodo nodoMinimo = null;
        int valorMinimo = 0;

        if (nodoActual == null) {
            return null;
        }

        nodoMinimo = nodoActual;
        valorMinimo = nodoActual.getDato();

        while (nodoActual != null) {
            if (nodoActual.getDato() < valorMinimo) {
                nodoMinimo = nodoActual;
                valorMinimo = nodoActual.getDato();
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return nodoMinimo;
    }

    //    GETTERS Y SETTERS
    public Nodo getPrimero() {
        return primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
}
