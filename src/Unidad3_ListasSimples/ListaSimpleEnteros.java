package Unidad3_ListasSimples;

/*
4.Implemente recursivamente los métodos  MostrarInvertido(), sumarValores, devolverMenor() de una Lista Simple de Enteros. Discutir si esta implementación es mejor o no que una Solución iterativa.
*/

public class ListaSimpleEnteros {
    protected Nodo primero;

    //Constructor
    public ListaSimpleEnteros() {
        this.primero = null; //Al inicio la lista esta vacia
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

    //    Retornar  la suma de los elemento s de la lista simple.
    public int getSumaElementos() {
        Nodo actual = primero;
        int suma = 0;

        while (actual != null) {
            suma += actual.getDato();
            actual = actual.getSiguiente();
        }
        return suma;
    }

    public int getSumaElementosRecursivo() {
        return getSumaElementosRecursivoPrivado(primero);
    }

    private int getSumaElementosRecursivoPrivado(Nodo actual) {
        if (actual == null) {
            return 0;
        } else {
            return (actual.getDato() + getSumaElementosRecursivoPrivado(actual.getSiguiente()));
        }
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

    public void mostrarLista() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println("");
    }

    public void mostrarListaRecursivo() {
        mostrarListaRecusivoPrivado(primero);
        System.out.println("");
    }

    private void mostrarListaRecusivoPrivado(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.getDato() + " ");//Mostrar el dato del nodo Actual
            mostrarListaRecusivoPrivado(actual.getSiguiente());
        }
    }

    public void mostrarListaInversaRecursivo() {
        mostrarListaInversaRecursivoPrivado(primero);
        System.out.println("");
    }

    private void mostrarListaInversaRecursivoPrivado(Nodo actual) {
        if (actual != null) {
            mostrarListaInversaRecursivoPrivado(actual.getSiguiente());
            System.out.print(actual.getDato() + " ");
        }
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

}
