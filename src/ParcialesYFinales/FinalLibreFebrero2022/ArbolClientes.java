package ParcialesYFinales.FinalLibreFebrero2022;

public class ArbolClientes {
    public static final int MINNIVEL = 2;
    public static final int MAXCLIENTE = 10;
    public static final int MINDNI = 10200300;

    private NodoArbol raiz;

    public ArbolClientes() {
        raiz = null;
    }

    public void generarLista(ListaCircular lista) {
        generarListaRecursivo(raiz, 0, lista);
    }

    private void generarListaRecursivo(NodoArbol actual, int nivel, ListaCircular circular) {
        if (actual != null) {
            if (actual.getNumeroCliente() >= MAXCLIENTE) {
                generarListaRecursivo(actual.getMenores(), nivel + 1, circular);
            } else {
                if (actual.getDni() > MINDNI && nivel > MINNIVEL) {
                    circular.insertar(actual);
                }
                generarListaRecursivo(actual.getMenores(), nivel + 1, circular);
                generarListaRecursivo(actual.getMayores(), nivel + 1, circular);
            }
        }
    }
}
