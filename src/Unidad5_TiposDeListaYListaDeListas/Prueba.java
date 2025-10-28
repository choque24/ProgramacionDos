package Unidad5_TiposDeListaYListaDeListas;

public class Prueba {
    public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();

        listaCircular.mostrarLista();
        listaCircular.insertarElementoOrdenado(9);
        listaCircular.mostrarLista();
        listaCircular.eliminarElementoOrdenado(9);
        listaCircular.mostrarLista();

        listaCircular.insertarElementoOrdenado(5);
        listaCircular.insertarElementoOrdenado(3);
        listaCircular.insertarElementoOrdenado(20);
        listaCircular.insertarElementoOrdenado(31);
        listaCircular.mostrarLista();

        listaCircular.eliminarElementoOrdenado(40);
        System.out.println("Lista luego de eliminacion: ");
        listaCircular.mostrarLista();

    }
}
