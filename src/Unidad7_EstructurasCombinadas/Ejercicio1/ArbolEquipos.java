package Unidad7_EstructurasCombinadas.Ejercicio1;

import java.io.*;

public class ArbolEquipos {
    private NodoEquipo raiz;
    private NodoEquipo ordenPuntaje;

    public ArbolEquipos() {
        raiz = null;
        ordenPuntaje = null;
    }

    // Metodo para insertar un equipo
    public boolean insertar(Equipo equipo) {
        // Verificar si ya existe el equipo
        if (buscarEquipo(equipo.getNombre()) != null) {
            return false; // Ya existe, no insertar
        }

        // Insertar en el árbol binario de búsqueda
        raiz = insertarEnArbol(raiz, equipo);

        // Insertar en la lista ordenada por puntaje
        NodoEquipo nuevoNodo = buscarNodoPorNombre(raiz, equipo.getNombre());
        insertarEnListaPuntaje(nuevoNodo);

        return true;
    }

    // Metodo privado para insertar en el árbol BST
    private NodoEquipo insertarEnArbol(NodoEquipo nodo, Equipo equipo) {
        if (nodo == null) {
            return new NodoEquipo(equipo);
        }

        int comparacion = compararAlfabeticamente(equipo.getNombre(), nodo.getEquipo().getNombre());

        if (comparacion < 0) {
            nodo.setMayores(insertarEnArbol(nodo.getMayores(), equipo));
        } else if (comparacion > 0) {
            nodo.setMenores(insertarEnArbol(nodo.getMenores(), equipo));
        }

        return nodo;
    }

    // Metodo para buscar un equipo por nombre
    private NodoEquipo buscarEquipo(String nombre) {
        return buscarNodoPorNombre(raiz, nombre);
    }

    // Metodo recursivo para buscar un nodo por nombre
    private NodoEquipo buscarNodoPorNombre(NodoEquipo nodo, String nombre) {
        if (nodo == null) {
            return null;
        }

        int comparacion = compararAlfabeticamente(nombre, nodo.getEquipo().getNombre());

        if (comparacion == 0) {
            return nodo;
        } else if (comparacion < 0) {
            return buscarNodoPorNombre(nodo.getMenores(), nombre);
        } else {
            return buscarNodoPorNombre(nodo.getMayores(), nombre);
        }
    }

    // Metodo para insertar en la lista ordenada por puntaje
    private void insertarEnListaPuntaje(NodoEquipo nuevoNodo) {
        if (ordenPuntaje == null || nuevoNodo.getEquipo().getPuntaje() < ordenPuntaje.getEquipo().getPuntaje()) {
            // Insertar al inicio
            nuevoNodo.setSiguientePuntaje(ordenPuntaje);
            ordenPuntaje = nuevoNodo;
        } else {
            // Buscar posición correcta
            NodoEquipo actual = ordenPuntaje;
            while (actual.getSiguientePuntaje() != null &&
                    actual.getSiguientePuntaje().getEquipo().getPuntaje() <= nuevoNodo.getEquipo().getPuntaje()) {
                actual = actual.getSiguientePuntaje();
            }

            // Insertar después de actual
            nuevoNodo.setSiguientePuntaje(actual.getSiguientePuntaje());
            actual.setSiguientePuntaje(nuevoNodo);
        }
    }

    // Metodo para comparar strings alfabéticamente usando compareTo
    private int compararAlfabeticamente(String str1, String str2) {
        return str1.compareTo(str2);
    }

    // Metodo para cargar equipos desde archivo
    public void cargarDesdeArchivo(String nombreArchivo) {
        try(
            FileInputStream fileIn = new FileInputStream(nombreArchivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn))
        {
            try {
                while (true) {
                    Equipo equipo = (Equipo) objectIn.readObject();
                    insertar(equipo);
                }
            } catch (EOFException e) {
                // Fin del archivo alcanzado
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Metodo para recorrer el árbol en orden alfabético (InOrder)
    public void recorrerArbolAlfabetico() {
        System.out.println("Recorrido alfabético del árbol:");
        recorrerInOrder(raiz);
    }

    // Metodo recursivo para recorrido InOrder
    private void recorrerInOrder(NodoEquipo nodo) {
        if (nodo != null) {
            recorrerInOrder(nodo.getMenores());
            System.out.println("Equipo: " + nodo.getEquipo().getNombre() +
                    " - Puntaje: " + nodo.getEquipo().getPuntaje());
            recorrerInOrder(nodo.getMayores());
        }
    }

    // Método para recorrer la lista por puntaje
    public void recorrerListaPorPuntaje() {
        System.out.println("\nRecorrido por puntaje (ascendente):");
        NodoEquipo actual = ordenPuntaje;

        while (actual != null) {
            System.out.println("Equipo: " + actual.getEquipo().getNombre() +
                    " - Puntaje: " + actual.getEquipo().getPuntaje());
            actual = actual.getSiguientePuntaje();
        }
    }

    public void setRaiz(NodoEquipo raiz) {
        this.raiz = raiz;
    }

    public void setOrdenPuntaje(NodoEquipo ordenPuntaje) {
        this.ordenPuntaje = ordenPuntaje;
    }

    public NodoEquipo getRaiz() {
        return raiz;
    }

    public NodoEquipo getOrdenPuntaje() {
        return ordenPuntaje;
    }
}
