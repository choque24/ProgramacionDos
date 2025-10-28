package ParcialesYFinales.FinalAbril2025;

public class Main {
    public static void main(String[] args) {
        //Creo el arbol y le insertoValores
        ArbolEnterosOrdenado arbol = new ArbolEnterosOrdenado();

        arbol.mostrarArbol();
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(0);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(7);
        arbol.insertar(13);
        arbol.insertar(18);
        arbol.insertar(22);
        arbol.insertar(3);
        arbol.insertar(-5);
        arbol.insertar(-3);
        arbol.insertar(-8);
        arbol.insertar(21);
        arbol.insertar(25);
        arbol.insertar(16);
        arbol.insertar(17);
        arbol.insertar(4);
        arbol.insertar(6);

        System.out.println("Muestro el arbol en Preorden");
        arbol.mostrarArbol();
        System.out.println("Muestro la lista ordenada");

        arbol.generarListaDoblementeEnlazada();
        arbol.mostrarLista();
        lista = null;
        lista = arbol.generarListaDoblementeEnlazada();
        lista.mostrarLista
    }
}
