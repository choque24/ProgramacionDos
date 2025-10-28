package Unidad5_TiposDeListaYListaDeListas;

public class ListaEmpleados {
    private NodoCategoria primeraCategoria;

    public ListaEmpleados(){
        this.primeraCategoria = null;
    }

    public void insertarEmpleado(Empleado empleado){
        char categoria = empleado.getCategoria();

        // 1. Buscar o insertar la categoría en orden
        NodoCategoria actual = primeraCategoria;
        NodoCategoria anterior = null;

        // Recorremos la lista de categorías para buscar dónde va
        while (actual != null && actual.getCategoria() < categoria) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        // Si la categoría ya existe, actual apunta a ella
        if (actual != null && actual.getCategoria() == categoria) {
            // Insertar en la sublista de empleados de esa categoría
            insertarEmpleadoOrdenado(actual, empleado);
        } else {
            // Crear nueva categoría y conectarla
            NodoCategoria nuevoNodoCategoria = new NodoCategoria(categoria);
            nuevoNodoCategoria.setSiguiente(actual);

            if (anterior == null) {
                primeraCategoria = nuevoNodoCategoria; // nueva cabeza
            } else {
                anterior.setSiguiente(nuevoNodoCategoria);
            }

            // Insertar el primer empleado en esa nueva categoría
            insertarEmpleadoOrdenado(nuevoNodoCategoria, empleado);
        }
    }

    private void insertarEmpleadoOrdenado(NodoCategoria nodoCategoria, Empleado empleado) {
        NodoEmpleado actual = nodoCategoria.getInicioEmpleado();
        NodoEmpleado anterior = null;

        while (actual != null) {
            Empleado e = actual.getEmpleado();
            String claveActual = e.getApellido().toLowerCase() + e.getNombre().toLowerCase();
            String claveNuevo = empleado.getApellido().toLowerCase() + empleado.getNombre().toLowerCase();

            if (claveNuevo.compareTo(claveActual) < 0) break;

            anterior = actual;
            actual = actual.getSiguiente();
        }

        NodoEmpleado nuevoNodo = new NodoEmpleado();
        nuevoNodo.setEmpleado(empleado);
        nuevoNodo.setSiguiente(actual);

        if (anterior == null) {
            nodoCategoria.setInicioEmpleado(nuevoNodo);
        } else {
            anterior.setSiguiente(nuevoNodo);
        }
    }

    public void mostrarEmpleadosDeCategoria(char categoriaBuscada) {
        NodoCategoria actual = primeraCategoria;

        while (actual != null && actual.getCategoria() < categoriaBuscada) {
            actual = actual.getSiguiente();
        }

        if (actual != null && actual.getCategoria() == categoriaBuscada) {
            System.out.println("Empleados de la categoría " + categoriaBuscada + ":");
            NodoEmpleado nodoEmp = actual.getInicioEmpleado();
            while (nodoEmp != null) {
                Empleado e = nodoEmp.getEmpleado();
                System.out.println("  - " + e.getApellido() + ", " + e.getNombre() + " | Sueldo: $" + e.getSueldo());
                nodoEmp = nodoEmp.getSiguiente();
            }
        } else {
            System.out.println("No se encontró la categoría " + categoriaBuscada);
        }
    }


    public NodoCategoria getPrimero() {
        return primeraCategoria;
    }

    public void setPrimero(NodoCategoria primero) {
        this.primeraCategoria = primero;
    }
}
