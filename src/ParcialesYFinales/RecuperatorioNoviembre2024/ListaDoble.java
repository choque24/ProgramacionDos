package ParcialesYFinales.RecuperatorioNoviembre2024;

public class ListaDoble {
    private NodoLista primero;

    public ListaDoble() {
        primero = null;
    }

    public void insertar(int categoria) {
        NodoLista nuevo = new NodoLista(categoria);

        if (primero == null) {
            primero = nuevo;
            return;
        }

        if (categoria > primero.getCategoria()) {
            primero.setAnterior(nuevo);
            nuevo.setSiguiente(primero);
            primero = nuevo;
            return;
        }

        NodoLista actual = primero;

        while (actual.getSiguiente() != null && actual.getSiguiente().getCategoria() > categoria) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() == null) {
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
        } else if (actual.getSiguiente().getCategoria() != categoria) {
            actual.getSiguiente().setAnterior(nuevo);
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
        }
    }

    public NodoLista getPrimero() {
        return primero;
    }

    public void setPrimero(NodoLista primero) {
        this.primero = primero;
    }
}
