package ParcialesYFinales.RecuperatorioNoviembre2024;

public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public void generarLista(ListaDoble lista, int minValor, int maxValor) {
        generarListaRecursivo(lista, minValor, maxValor, raiz);
    }

    private void generarListaRecursivo(ListaDoble lista, int minValor, int maxValor, NodoArbol actual) {
        if (actual != null) {
            if (actual.getValor() <= maxValor) {
                generarListaRecursivo(lista, minValor, maxValor, actual.getMayores());
            } else if (actual.getValor() >= minValor) {
                generarListaRecursivo(lista, minValor, maxValor, actual.getMenores());
            } else {
                if (getNodosDescendientes(actual.getMenores()) > getNodosDescendientes(actual.getMayores())) {
                    lista.insertar(actual.getCategoriaArbol());
                }
                generarListaRecursivo(lista, minValor, maxValor, actual.getMenores());
                generarListaRecursivo(lista, minValor, maxValor, actual.getMayores());
            }
        }
    }

    public int getNodosDescendientes(NodoArbol actual) {
        if (actual == null) {
            return 0;
        }

        return 1 + getNodosDescendientes(actual.getMayores()) + getNodosDescendientes(actual.getMenores());
    }


    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
}
