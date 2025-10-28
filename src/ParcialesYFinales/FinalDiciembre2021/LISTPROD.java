package ParcialesYFinales.FinalDiciembre2021;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Se pide guardar la información de los nodos de los árboles que se encuentran en un nivel
//mayor a NIVELMIN (El nodo raíz del árbol es NIVEL=0), tienen anio menor a ANIOMAX, y
//corresponden a un producto con id_producto mayor a IDMIN.
/*Se pide guardar la información de los nodos de los árboles que se encuentran en un nivel
mayor a NIVELMIN (El nodo raíz del árbol es NIVEL=0), tienen anio menor a ANIOMAX, y
corresponden a un producto con id_producto mayor a IDMIN.

Para todos los nodos que cumplan con estas condiciones, se debe guardar su información en un archivo de registros
de nombre “aniosproductos.dat”. Cada registro de este archivo tiene el anio y las cantidades
de ventas acumuladas de ese anio. El archivo debe crearse, no tiene orden y los anios no
se pueden repetir*/
public class LISTPROD {
    private static final int ID_MIN = 0;
    private static final int ANIO_MAX = 100;
    private static final int NIVEL_MIN = 2;
    private static final String RUTA_ARCHIVO = "C:\\Users\\mauri\\Downloads\\Mauri\\aniosProductos.dat";
    private NodoListProd primero;

    public LISTPROD() {
        primero = null;
    }

    private void procesarLista() {
        procesarListaRecursivo(primero);
    }

    public void procesarListaRecursivo(NodoListProd actual) {
        if(actual == null) {
            return;
        }

        while (actual.getSiguiente() != null) {
            if (actual.getIdProducto() > ID_MIN) {
                procesarArbol(actual.getPrimeroArbol());
            }
            actual = actual.getSiguiente();
        }
    }

    public void procesarArbol(NodoArbol arbol) {
        procesarArbolRecursivo(arbol, 0);
    }

    private void procesarArbolRecursivo(NodoArbol actual, int nivel) {
        if (actual != null) {
            if (actual.getAnio() >= ANIO_MAX) {
                procesarArbolRecursivo(actual.getMenores(), nivel + 1);
            } else if (nivel > NIVEL_MIN) {
                procesarArbolRecursivo(actual.getMenores(), nivel + 1);
                insertarEnArchivo(actual);
                procesarArbolRecursivo(actual.getMayores(), nivel + 1);
            } else{
                procesarArbolRecursivo(actual.getMenores(), nivel + 1);
                procesarArbolRecursivo(actual.getMayores(), nivel + 1);
            }
        }
    }

//Cada registro de este archivo tiene el anio y las cantidades de ventas acumuladas de ese anio
    private void insertarEnArchivo(NodoArbol arbol) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            bw.write("El anio: " + arbol.getAnio() +  " hubo " + arbol.getCantidadVentas() + " ventas en total");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
