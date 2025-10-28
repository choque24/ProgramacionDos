package Unidad5_TiposDeListaYListaDeListas;

/*3. Una estructura de datos Fila ó Cola, es una colección de elementos en donde el primer elemento en entrar es el primero en salir (pensar en un fila para entrar al cine). Implementar una clase FilaDeEnteros  como una lista vinculada(pensar en una representación de dos punteros). Luego codifique los  métodos: el constructor (inicia la fila vacia), agregar un elemento(lo agrega al final), extraer (extrae el primero), VerPrimero (retorna el elemento sin sacarlo), FilaVacia (retorna true si esta vacía); EscribirFila (muestra por pantalla todos los elementos)
 */
public class Fila {
    private NodoDobleEntero primero;
    private NodoDobleEntero ultimo;

    public Fila() {
        primero = null;
        ultimo = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    // Elimina el primero
    public void extraer() {
        if (primero != null) {
            primero = primero.getSiguiente();
            // No se si hace falta
            primero.setAnterior(null);
        }
    }

    public void insertarElementoAlFinal(int dato) {
        NodoDobleEntero nuevo = new NodoDobleEntero(dato);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
            return;
        }

        if (primero == ultimo) {
            primero.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setAnterior(primero);
            return;
        }

        NodoDobleEntero actual = primero;

        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        actual.setSiguiente(nuevo);
        ultimo = nuevo;
        ultimo.setAnterior(actual);
    }

    public void escribirFila() {
        if (primero == null) {
            System.out.println("Fila Vacia");
            return;
        }

        NodoDobleEntero actual = primero;

        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
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
