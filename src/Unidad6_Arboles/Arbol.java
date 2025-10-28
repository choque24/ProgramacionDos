package Unidad6_Arboles;

public class Arbol {
    private NodoArbol raiz;
    private NodoAlumno raizAlumno;

    public Arbol() {
        raiz = null;
        raizAlumno = null;
    }

    public void insertarAlumno(AlumnoIntroProg alumno) {
        raizAlumno = insertarAlumnoRecursivo(raizAlumno, alumno);
    }

    private NodoAlumno insertarAlumnoRecursivo(NodoAlumno nodoAlumno, AlumnoIntroProg alumno) {
        if (nodoAlumno == null) {
            return new NodoAlumno(alumno);
        }

        if (alumno.getDni() > nodoAlumno.getAlumno().getDni()) {
            nodoAlumno.setMayores(insertarAlumnoRecursivo(nodoAlumno.getMayores(), alumno));
        } else if (alumno.getDni() < nodoAlumno.getAlumno().getDni()) {
            nodoAlumno.setMenores(insertarAlumnoRecursivo(nodoAlumno.getMenores(), alumno));
        }

        return nodoAlumno;
    }

    //Metodo para insertar un valor en el arbol`
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private NodoArbol insertarRecursivo(NodoArbol actual, int valor) {
        if (actual == null) {
            return new NodoArbol(valor);
        }

        if (valor > actual.getValor()) {
            actual.setMayores(insertarRecursivo(actual.getMayores(), valor));
        } else if (valor < actual.getValor()) {
            actual.setMenores(insertarRecursivo(actual.getMenores(), valor));
        }
        return actual;
    }


    ///  CODIGO CHATGOD
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private NodoArbol eliminarRec(NodoArbol actual, int valor) {
        if (actual == null) return null;

        if (valor < actual.valor) {
            actual.menores = eliminarRec(actual.menores, valor);
        } else if (valor > actual.valor) {
            actual.mayores = eliminarRec(actual.mayores, valor);
        } else {
            // Caso 1: sin hijos
            if (actual.menores == null && actual.mayores == null) {
                return null;
            }

            // Caso 2: un solo hijo
            if (actual.menores == null) {
                return actual.mayores;
            } else if (actual.mayores == null) {
                return actual.menores;
            }

            // Caso 3: dos hijos
            // Obtener el mayor del subárbol izquierdo
            int mayorIzquierdo = encontrarMayor(actual.menores);
            actual.valor = mayorIzquierdo;
            actual.menores = eliminarRec(actual.menores, mayorIzquierdo);
        }

        return actual;
    }

    private int encontrarMayor(NodoArbol nodo) {
        while (nodo.mayores != null) {
            nodo = nodo.mayores;
        }
        return nodo.valor;
    }
    //TERMINO EL CODIGO CHATGOD REBIEN

    public void borrar(int valor) {
        borrarRecursivo(valor, raiz);
    }

    private void borrarRecursivo(int valor, NodoArbol actual) {
        if (actual == null) {
            return;
        }

        if (valor > actual.getValor()) {
            borrarRecursivo(valor, actual.getMayores());
        } else if (valor < actual.getValor()) {
            borrarRecursivo(valor, actual.getMenores());
        }

        if (valor == actual.getMayores().getValor() || valor == actual.getMenores().getValor()) {
            eliminarNodo(actual, valor);
        }
    }

    private void eliminarNodo(NodoArbol padre, int valor) {
        NodoArbol nodoEliminar = null;
        if (padre.getMenores() != null && padre.getMenores().getValor() == valor) {
            nodoEliminar = padre.getMenores();
        } else {
            nodoEliminar = padre.getMayores();
        }
        //Si es raiz
        if (nodoEliminar.getMenores() == null && nodoEliminar.getMayores() == null) {
            if (padre.getMenores() == nodoEliminar) {
                padre.setMenores(null);
            } else {
                padre.setMayores(null);
            }
            //Pongo en null el puntero del padre
        }//Si tiene solo un subArbol
        else if (nodoEliminar.getMenores() == null || nodoEliminar.getMayores() == null) {
            //Asigno el hijo como el nuuevo hijo del actual padre
        } else {
            //Cosas complicadas
        }
    }

    //    6)Hacer un metodo que retorne la longitud de la mayor rama de un árbol.
    public int getLongitudMayorRama() {
        return getLongitudMayorRamaRecursivo(raiz, -1, 1);
    }

    //    7)Dado un árbol transformarlo en lista recorriendolo en preorden.
    public void intoListaPreorder(ListaSimple lista) {
        intoListaPreOrderRecursivo(lista, raiz);
    }

    private void intoListaPreOrderRecursivo(ListaSimple lista, NodoArbol actual) {
        if (actual == null) {
            return;
        }
        lista.insertar(actual.getValor());
        intoListaPreOrderRecursivo(lista, actual.getMenores());
        intoListaPreOrderRecursivo(lista, actual.getMayores());
    }

    //    8)  Dado un árbol binario de números enteros, sumarle a cada nodo padre los valores de sus hijos de manera que la raíz pase a tener la suma de todos los elementos del árbol.
    public void sumarPadreNodoHijos() {
        sumarPadreNodoHijosRecursivo(raiz);
    }

    //    9 a) hacer un metodo que retorne  la cantidad de nodos del árbol
    public int getCantidadNodos() {
        return getCantidadNodosRecursivo(raiz, 0);
    }

    private int getCantidadNodosRecursivo(NodoArbol actual, int cantidad) {
        if (actual == null) {
            return cantidad;
        }

        cantidad++;

        cantidad = getCantidadNodosRecursivo(actual.getMenores(), cantidad);
        cantidad = getCantidadNodosRecursivo(actual.getMayores(), cantidad);

        return cantidad;
    }

    //    VERSION CHATGOD 9A
    public int getCantidadNodosChat() {
        return getCantidadNodosRec(raiz);
    }

    private int getCantidadNodosRec(NodoArbol actual) {
        if (actual == null) {
            return 0;
        }
        return 1 + getCantidadNodosRec(actual.getMenores())
                + getCantidadNodosRec(actual.getMayores());
    }
    //    TERMINO CHATGOD

//    b)  hacer un metodo que retorne  la cantidad de nodos del árbol que hay considerando sólo  aquellos nodos cuyo valor de entero esté ente entre minValor y maxValor,  dados como parámetros. No recorrer el árbol innecesariamente.
    public int getCantidadNodosEntre(int minValor, int maxValor) {
        return getCantidadNodosEntreRecursivo(raiz, minValor, maxValor);
    }

    private int getCantidadNodosEntreRecursivo(NodoArbol actual, int minValor, int maxValor) {
        if(actual == null) {
            return 0;
        }

        if(actual.getValor() >= minValor && actual.getValor() <= maxValor) {
            return 1 + getCantidadNodosEntreRecursivo(actual.getMenores(), minValor, maxValor) + getCantidadNodosEntreRecursivo(actual.getMayores(), minValor, maxValor);
        } else if(actual.getValor() < minValor) {
            return getCantidadNodosEntreRecursivo(actual.getMayores(), minValor, maxValor);
        } else {
            return getCantidadNodosEntreRecursivo(actual.getMenores(), minValor, maxValor);
        }
    }

    private int sumarPadreNodoHijosRecursivo(NodoArbol actual) {
        if (actual == null) {
            return 0;
        }

        actual.valor += sumarPadreNodoHijosRecursivo(actual.getMenores());
        actual.valor += sumarPadreNodoHijosRecursivo(actual.getMayores());

        return actual.getValor();
    }

    private int getLongitudMayorRamaRecursivo(NodoArbol actual, int longitudMayorRama, int longitudActual) {
        if (actual == null) {
            return longitudMayorRama;
        }
        if (longitudActual > longitudMayorRama) {
            longitudMayorRama = longitudActual;
        }

        longitudMayorRama = getLongitudMayorRamaRecursivo(actual.getMenores(), longitudMayorRama, longitudActual + 1);
        longitudMayorRama = getLongitudMayorRamaRecursivo(actual.getMayores(), longitudMayorRama, longitudActual + 1);

        return longitudMayorRama;
    }

    //b)Hacer un procedimiento/función que dado un  Nro. de Alumno retorne el DNI asociado
    public int getDni(int nroAlumno) {
        return getDniRecursivo(raizAlumno, nroAlumno, -1);
    }

    private int getDniRecursivo(NodoAlumno alumnoActual, int nroAlumno, int dni) {
        if (alumnoActual != null && alumnoActual.getAlumno().getNroAlumno() == nroAlumno) {
            return alumnoActual.getAlumno().getDni();
        }

        if (alumnoActual != null) {
            dni = getDniRecursivo(alumnoActual.getMenores(), nroAlumno, dni);
            dni = getDniRecursivo(alumnoActual.getMayores(), nroAlumno, dni);
        }

        return dni;
    }

    //    a) Hacer un procedimiento/función que dado un DNI retorne el Nro. de Alumno asociado
    public int getNroAlumno(int dni) {
        return getNroAlumnoRecursivo(raizAlumno, dni);
    }

    private int getNroAlumnoRecursivo(NodoAlumno alumnoActual, int dni) {
        if (alumnoActual == null) {
            return -1;
        }

        if (alumnoActual.getAlumno().getDni() > dni) {
            return getNroAlumnoRecursivo(alumnoActual.getMenores(), dni);
        } else if (alumnoActual.getAlumno().getDni() < dni) {
            return getNroAlumnoRecursivo(alumnoActual.getMayores(), dni);
        } else {
            return alumnoActual.getAlumno().getNroAlumno();
        }
    }

    //Get menor para arbol ordenado
    public NodoArbol getMenor() {
        return getMenorRecursivo(raiz);
    }

    private NodoArbol getMenorRecursivo(NodoArbol nodoActual) {
        if (nodoActual == null) {
            return null;
        }

        if (nodoActual.getMenores() != null) {
            return getMenorRecursivo(nodoActual.getMenores());
        }

        return nodoActual;
    }

    public NodoArbol getMenorDesordenado() {
        return getMenorDesordenadoRec(raiz, raiz);
    }

    private NodoArbol getMenorDesordenadoRec(NodoArbol nodoActual, NodoArbol nodoMenor) {
        if (nodoActual == null) {
            return nodoMenor;
        }

        if (nodoActual.getValor() < nodoMenor.getValor()) {
            nodoMenor = nodoActual;
        }

        nodoMenor = getMenorDesordenadoRec(nodoActual.getMenores(), nodoMenor);
        nodoMenor = getMenorDesordenadoRec(nodoActual.getMayores(), nodoMenor);

        return nodoMenor;
    }

    public void inOrdenAscendente() {
        inOrdenAscendenteRecursivo(raiz);
        System.out.println(" ");
    }

    private void inOrdenAscendenteRecursivo(NodoArbol actual) {
        if (actual != null) {
            inOrdenAscendenteRecursivo(actual.getMenores());
            System.out.print(actual.getValor() + " ");
            inOrdenAscendenteRecursivo(actual.getMayores());
        }
    }

    public void inOrdenAscendenteAlumno() {
        inOrdenAscendenteRecursivoAlumno(raizAlumno);
        System.out.println(" ");
    }

    private void inOrdenAscendenteRecursivoAlumno(NodoAlumno actual) {
        if (actual != null) {
            inOrdenAscendenteRecursivoAlumno(actual.getMenores());
            System.out.print(actual.getAlumno().getNombre() + " ");
            inOrdenAscendenteRecursivoAlumno(actual.getMayores());
        }
    }

    public void inOrdenDescendente() {
        inOrdenDescendenteRecursivo(raiz);
        System.out.println(" ");
    }

    private void inOrdenDescendenteRecursivo(NodoArbol actual) {
        if (actual != null) {
            inOrdenDescendenteRecursivo(actual.getMayores());
            System.out.print(actual.getValor() + " ");
            inOrdenDescendenteRecursivo(actual.getMenores());
        }
    }

    public void preOrden() {
        preOrdenRecursivo(raiz);
        System.out.println(" ");
    }

    private void preOrdenRecursivo(NodoArbol actual) {
        if (actual != null) {
            System.out.print(actual.getValor() + " ");
            preOrdenRecursivo(actual.getMenores());
            preOrdenRecursivo(actual.getMayores());
        }
    }

    public void postOrden() {
        postOrdenRecursivo(raiz);
        System.out.println(" ");
    }

    private void postOrdenRecursivo(NodoArbol actual) {
        if (actual != null) {
            postOrdenRecursivo(actual.getMenores());
            postOrdenRecursivo(actual.getMayores());
            System.out.print(actual.getValor() + " ");
        }
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(NodoArbol actual, int valor) {
        if (actual == null) {
            return false;
        }

        if (valor == actual.getValor()) {
            return true;
        }

        if (valor > actual.getValor()) {
            return buscarRecursivo(actual.getMayores(), valor);
        } else {
            return buscarRecursivo(actual.getMenores(), valor);
        }
    }

}
