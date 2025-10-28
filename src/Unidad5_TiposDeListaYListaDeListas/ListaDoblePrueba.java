package Unidad5_TiposDeListaYListaDeListas;

public class ListaDoblePrueba {
    public static void main(String[] args) {
        ListaDobleVinculadaOrdenadaEnteros lista = new ListaDobleVinculadaOrdenadaEnteros();

        lista.mostrarListaDoble();
        lista.insertarElementoOrdenado(3);
        lista.insertarElementoOrdenado(10);
        lista.insertarElementoOrdenado(20);
        lista.insertarElementoOrdenado(1);
        lista.mostrarListaDoble();
        System.out.println("Lista Inversa: ");
        lista.mostrarListaDobleInversa();
        System.out.println("Lista Luego de eliminacion: ");
        lista.eliminarElementoOrdenado(1);
        lista.eliminarElementoOrdenado(20);
        lista.mostrarListaDoble();

        lista.insertarElementoOrdenado(30);
        lista.insertarElementoOrdenado(20);
        lista.eliminarElementoOrdenado(3);
        lista.eliminarElementoOrdenado(25);

        lista.mostrarListaDoble();
        System.out.println("Lista Inversa: ");
        lista.mostrarListaDobleInversa();

        System.out.println(lista.getUltimo().getDato());
        System.out.println(lista.getPrimero().getDato());

    }
}
