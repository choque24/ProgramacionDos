package Unidad3_ListasSimples;

public class ejemploUso {
    public static void main(String[] args) {
/*
     ListaSimpleEnterosClase lista = new ListaSimpleEnterosClase();
     lista.insertarAlInicio(15);
     lista.insertarAlInicio(25);
     lista.mostrarLista();

     lista.eliminarNodo(25);
     lista.mostrarLista();

     lista.insertarAlInicio(10);
     lista.insertarOrdenado(12);
     lista.mostrarLista();
*/
        ListaSimpleEnterosSinOrden sinOrden = new ListaSimpleEnterosSinOrden();
        sinOrden.insertarAlFinal(100);
        System.out.println("Hola?");
        System.out.println("HOla esta es la suma: " + sinOrden.getSumaElementos());
        System.out.println("Esta es la cantidad de elementos: " + sinOrden.getCantidadElementos());
        System.out.println("Este es el nodo mas chico: " + sinOrden.getNodoMinimo().getDato());
        sinOrden.mostrarLista();
        sinOrden.insertarAlPrincipio(10);
        sinOrden.insertarAlPrincipio(20);
        sinOrden.insertarAlPrincipio(30);
        sinOrden.mostrarLista();

        System.out.println("HOla esta es la suma: " + sinOrden.getSumaElementos());
        System.out.println("Esta es la cantidad de elementos: " + sinOrden.getCantidadElementos());
        System.out.println("Este es el promedio de elementos: " + sinOrden.getPromedioElementos());
        System.out.println("Este es el nodo mas chico: " + sinOrden.getNodoMinimo().getDato());
        sinOrden.insertarAlFinal(40);
        sinOrden.insertarAlFinal(12);
        sinOrden.mostrarLista();
        System.out.println("HOla esta es la suma: " + sinOrden.getSumaElementos());
        System.out.println("Esta es la cantidad de elementos: " + sinOrden.getCantidadElementos());
        System.out.println("Este es el promedio de elementos: " + sinOrden.getPromedioElementos());
        System.out.println("Este es el nodo mas chico: " + sinOrden.getNodoMinimo().getDato());
        sinOrden.borrarElemento(10);
        sinOrden.borrarElemento(12);
        sinOrden.borrarElemento(30);
        sinOrden.mostrarLista();
        sinOrden.borrarElemento(1000);
        sinOrden.borrarElemento(20);
        sinOrden.borrarElemento(100);
        sinOrden.borrarElemento(30);

        System.out.println("HOla esta es la suma: " + sinOrden.getSumaElementos());
        System.out.println("Esta es la cantidad de elementos: " + sinOrden.getCantidadElementos());
        System.out.println("Este es el promedio de elementos: " + sinOrden.getPromedioElementos());
        System.out.println("Este es el nodo mas chico: " + sinOrden.getNodoMinimo().getDato());
        sinOrden.mostrarLista();
        sinOrden.borrarElemento(40);
        sinOrden.mostrarLista();
        sinOrden.borrarElemento(12);
        System.out.println("Esta es la cantidad de elementos: " + sinOrden.getCantidadElementos());
        System.out.println("Este es el promedio de elementos: " + sinOrden.getPromedioElementos());
//        System.out.println("Este es el nodo mas chico: " + sinOrden.getNodoMinimo().getDato());

    }
}
