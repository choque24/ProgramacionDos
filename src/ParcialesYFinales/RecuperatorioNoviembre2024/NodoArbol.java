package ParcialesYFinales.RecuperatorioNoviembre2024;

public class NodoArbol {
    private int valor;
    private int categoriaArbol;
    private NodoArbol menores;
    private NodoArbol mayores;

    public NodoArbol(int valor, int categoria) {
        this.valor = valor;
        this.categoriaArbol = categoria;
        menores = null;
        mayores = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCategoriaArbol() {
        return categoriaArbol;
    }

    public void setCategoriaArbol(int categoriaArbol) {
        this.categoriaArbol = categoriaArbol;
    }

    public NodoArbol getMenores() {
        return menores;
    }

    public void setMenores(NodoArbol menores) {
        this.menores = menores;
    }

    public NodoArbol getMayores() {
        return mayores;
    }

    public void setMayores(NodoArbol mayores) {
        this.mayores = mayores;
    }
}
