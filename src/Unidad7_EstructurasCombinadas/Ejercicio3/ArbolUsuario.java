package Unidad7_EstructurasCombinadas.Ejercicio3;

import java.util.Scanner;

public class ArbolUsuario {
    private NodoUsuario arbol_nro;
    private NodoUsuario arbol_nombre;

    public ArbolUsuario() {
        arbol_nro = null;
        arbol_nombre = null;
    }

    // Método principal para crear el árbol ordenado por nombre
    public void crearArbolPorNombre() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese número mínimo: ");
        int min_nro = scanner.nextInt();

        System.out.print("Ingrese número máximo: ");
        int max_nro = scanner.nextInt();

        // Limpiar el árbol por nombre anterior (si existe)
        limpiarArbolNombre();

        // Recorrer el árbol por número y filtrar nodos en el rango
        filtrarYCrearArbolNombre(arbol_nro, min_nro, max_nro);

        scanner.close();
    }

    // Método para limpiar los punteros de nombre de todos los nodos
    private void limpiarArbolNombre() {
        limpiarPunterosNombre(arbol_nro);
        arbol_nombre = null;
    }

    // Método recursivo para limpiar punteros de nombre
    private void limpiarPunterosNombre(NodoUsuario nodo) {
        if (nodo != null) {
            nodo.setAntNombre(null);
            nodo.setSigNombre(null);
            limpiarPunterosNombre(nodo.getAntNro());
            limpiarPunterosNombre(nodo.getSigNro());
        }
    }

    // Método para filtrar nodos en rango y crear árbol por nombre
    private void filtrarYCrearArbolNombre(NodoUsuario nodo, int min_nro, int max_nro) {
        if (nodo == null) {
            return;
        }

        // Si el número actual es menor que min_nro, solo buscar en la derecha
        if (nodo.getNroUsuario() < min_nro) {
            filtrarYCrearArbolNombre(nodo.getSigNro(), min_nro, max_nro);
        }
        // Si el número actual es mayor que max_nro, solo buscar en la izquierda
        else if (nodo.getNroUsuario() > max_nro) {
            filtrarYCrearArbolNombre(nodo.getAntNro(), min_nro, max_nro);
        }
        // Si está en el rango, procesar este nodo y buscar en ambos lados
        else {
            // Procesar nodo actual (está en rango)
            insertarEnArbolNombre(nodo);

            // Continuar búsqueda en ambos subárboles
            filtrarYCrearArbolNombre(nodo.getAntNro(), min_nro, max_nro);
            filtrarYCrearArbolNombre(nodo.getSigNro(), min_nro, max_nro);
        }
    }

    // Método para insertar un nodo en el árbol ordenado por nombre
    private void insertarEnArbolNombre(NodoUsuario nuevoNodo) {
        if (arbol_nombre == null) {
            arbol_nombre = nuevoNodo;
            return;
        }

        arbol_nombre = insertarEnArbolNombreRecursivo(arbol_nombre, nuevoNodo);
    }

    // Método recursivo para insertar en árbol por nombre
    private NodoUsuario insertarEnArbolNombreRecursivo(NodoUsuario raiz, NodoUsuario nuevoNodo) {
        if (raiz == null) {
            return nuevoNodo;
        }

        int comparacion = nuevoNodo.getNombre().compareTo(raiz.getNombre());

        // Si el nombre es menor o igual (duplicados van a la izquierda para mantener juntos)
        if (comparacion <= 0) {
            raiz.setAntNombre(insertarEnArbolNombreRecursivo(raiz.getAntNombre(), nuevoNodo));
        } else {
            raiz.setSigNombre(insertarEnArbolNombreRecursivo(raiz.getSigNombre(), nuevoNodo));
        }

        return raiz;
    }

    // Método para mostrar el árbol por número (InOrder)
    public void mostrarArbolPorNumero() {
        System.out.println("\nÁrbol ordenado por número:");
        mostrarInOrderNumero(arbol_nro);
    }

    // Método recursivo para mostrar árbol por número
    private void mostrarInOrderNumero(NodoUsuario nodo) {
        if (nodo != null) {
            mostrarInOrderNumero(nodo.getAntNro());
            System.out.println("Nro: " + nodo.getNroUsuario() + " - Nombre: " + nodo.getNombre());
            mostrarInOrderNumero(nodo.getSigNro());
        }
    }

    // Método para mostrar el árbol por nombre (InOrder)
    public void mostrarArbolPorNombre() {
        System.out.println("\nÁrbol ordenado por nombre (rango filtrado):");
        mostrarInOrderNombre(arbol_nombre);
    }

    // Método recursivo para mostrar árbol por nombre
    private void mostrarInOrderNombre(NodoUsuario nodo) {
        if (nodo != null) {
            mostrarInOrderNombre(nodo.getAntNombre());
            System.out.println("Nombre: " + nodo.getNombre() + " - Nro: " + nodo.getNroUsuario());
            mostrarInOrderNombre(nodo.getSigNombre());
        }
    }

    // Método para simular carga inicial del árbol por número (solo para pruebas)
    public void cargarArbolInicial() {
        // Simulamos que ya existe el árbol cargado por número
        insertarPorNumero(new NodoUsuario(new Usuario(15, "Carlos")));
        insertarPorNumero(new NodoUsuario(new Usuario(10, "Ana")));
        insertarPorNumero(new NodoUsuario(new Usuario(20, "Luis")));
        insertarPorNumero(new NodoUsuario(new Usuario(5, "María")));
        insertarPorNumero(new NodoUsuario(new Usuario(12, "Ana")));
        insertarPorNumero(new NodoUsuario(new Usuario(18, "Pedro")));
        insertarPorNumero(new NodoUsuario(new Usuario(25, "Carlos")));
        insertarPorNumero(new NodoUsuario(new Usuario(8, "Luis")));
        insertarPorNumero(new NodoUsuario(new Usuario(22, "José")));
    }

    // Método auxiliar para insertar en árbol por número (solo para pruebas)
    private void insertarPorNumero(NodoUsuario nuevoNodo) {
        if (arbol_nro == null) {
            arbol_nro = nuevoNodo;
            return;
        }

        arbol_nro = insertarPorNumeroRecursivo(arbol_nro, nuevoNodo);
    }

    // Método recursivo para insertar por número (solo para pruebas)
    private NodoUsuario insertarPorNumeroRecursivo(NodoUsuario raiz, NodoUsuario nuevoNodo) {
        if (raiz == null) {
            return nuevoNodo;
        }

        if (nuevoNodo.getNroUsuario() < raiz.getNroUsuario()) {
            raiz.setAntNro(insertarPorNumeroRecursivo(raiz.getAntNro(), nuevoNodo));
        } else if (nuevoNodo.getNroUsuario() > raiz.getNroUsuario()) {
            raiz.setSigNro(insertarPorNumeroRecursivo(raiz.getSigNro(), nuevoNodo));
        }

        return raiz;
    }

    public NodoUsuario getArbol_nro() {
        return arbol_nro;
    }

    public void setArbol_nro(NodoUsuario arbol_nro) {
        this.arbol_nro = arbol_nro;
    }

    public NodoUsuario getArbol_nombre() {
        return arbol_nombre;
    }

    public void setArbol_nombre(NodoUsuario arbol_nombre) {
        this.arbol_nombre = arbol_nombre;
    }
}
