package ParcialesYFinales.FinalAbril2025;

public class ArbolEnterosOrdenado {
    private final static int COTA_MINIMA = 0;
    private final static int COTA_MAXIMA = 20;
    private final static int NIVEL_MINIMO = 1;
    private final static int HIJOS_PARES = 2;
    private NodoArbol raiz;
    private NodoArbol primeroLista;

    public ArbolEnterosOrdenado() {
        raiz = null;
        primeroLista = null;
    }

    /// CODIGO FUNCIONAL HECHO POR MI, MAURICIO CHOQUE DEL 2025!!!

    public void generarListaDoblementeEnlazada() {
//        generarListaDoblementeEnlazadaRecursivo(raiz, 0);
        generarListaDoblementeEnlazadaRecursivo2(raiz, 0);

    }

    private void generarListaDoblementeEnlazadaRecursivo(NodoArbol actual, int nivelNodo) {
        if (actual == null || actual.getDato() >= COTA_MAXIMA && actual.getDato() <= COTA_MINIMA) {
            return;
        }

        if (nivelNodo > NIVEL_MINIMO && getDescendientesPares(actual) == HIJOS_PARES) {
            generarListaDoblementeEnlazadaRecursivo(actual.getMenores(), nivelNodo + 1);
            insertarNodoEnLista(primeroLista, actual);
            generarListaDoblementeEnlazadaRecursivo(actual.getMayores(), nivelNodo + 1);
        } else {
            generarListaDoblementeEnlazadaRecursivo(actual.getMenores(), nivelNodo + 1);
            generarListaDoblementeEnlazadaRecursivo(actual.getMayores(), nivelNodo + 1);
        }
    }

    private void generarListaDoblementeEnlazadaRecursivo2(NodoArbol actual, int nivelNodo) {
        if (actual == null) {
            return;
        }

        if (actual.getDato() <= COTA_MINIMA) {
            generarListaDoblementeEnlazadaRecursivo2(actual.getMayores(), nivelNodo + 1);
            return;//Se puede reemplazar con un else y anidar
        }

        if (actual.getDato() >= COTA_MAXIMA) {
            generarListaDoblementeEnlazadaRecursivo2(actual.getMenores(), nivelNodo + 1);
            return;
        }

        if (nivelNodo > NIVEL_MINIMO && getDescendientesPares(actual) == HIJOS_PARES) {
            generarListaDoblementeEnlazadaRecursivo2(actual.getMenores(), nivelNodo + 1);
            insertarNodoEnLista(primeroLista, actual);
            generarListaDoblementeEnlazadaRecursivo2(actual.getMayores(), nivelNodo + 1);
        } else {
            generarListaDoblementeEnlazadaRecursivo2(actual.getMenores(), nivelNodo + 1);
            generarListaDoblementeEnlazadaRecursivo2(actual.getMayores(), nivelNodo + 1);
        }
    }


    //Dado que recorro el arbol InOrden siempre inserto en la lista al final sin previa comprobacion para insertar al principio
    public void insertarNodoEnLista(NodoArbol actual, NodoArbol nuevo) {
        if (primeroLista == null) {
            primeroLista = nuevo;
            return;
        }

        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
        nuevo.setAnterior(actual);
    }

    public int getDescendientesPares(NodoArbol actual) {
        return getDescendientesParesRecursivo(actual.getMayores()) + getDescendientesParesRecursivo(actual.getMenores());
    }

    private int getDescendientesParesRecursivo(NodoArbol actual) {
        if (actual == null) {
            return 0;
        }

        if (actual.getDato() % 2 == 0) {
            return 1 + getDescendientesParesRecursivo(actual.getMenores()) + getDescendientesParesRecursivo(actual.getMayores());
        } else {
            return getDescendientesParesRecursivo(actual.getMenores()) + getDescendientesParesRecursivo(actual.getMayores());
        }
    }

    /// TERMINO EL FINAL

    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private NodoArbol insertarRecursivo(NodoArbol actual, int dato) {
        if (actual == null) {
            return new NodoArbol(dato);
        }

        if (actual.getDato() > dato) {
            actual.setMenores(insertarRecursivo(actual.getMenores(), dato));
        } else if (actual.getDato() < dato) {
            actual.setMayores(insertarRecursivo(actual.getMayores(), dato));
        }
        return actual;
    }

    public void mostrarArbol() {
        mostrarArbolRecursivo(raiz);
        System.out.println("  ");
    }

    private void mostrarArbolRecursivo(NodoArbol actual) {
        if (actual != null) {
            System.out.print(actual.getDato() + " ");
            mostrarArbolRecursivo(actual.getMenores());
            mostrarArbolRecursivo(actual.getMayores());
        }
    }

    public void mostrarLista() {
        mostrarListaRecursivo(primeroLista);
        System.out.println(" ");
    }

    private void mostrarListaRecursivo(NodoArbol actual) {
        if (actual != null) {
            System.out.print(actual.getDato() + " ");
            mostrarListaRecursivo(actual.getSiguiente());
        }
    }

    /// GETTERS Y SETTERS

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public NodoArbol getPrimeroLista() {
        return primeroLista;
    }

    public void setPrimeroLista(NodoArbol primeroLista) {
        this.primeroLista = primeroLista;
    }
}
