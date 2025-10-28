package Unidad4_Recursividad;

public class BusquedaBinariaRecursiva {
    public static final int LONGITUD = 10;

    public static void main(String[] args) {
        int[] numeros = new int[LONGITUD];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 2;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        int dato = -1;
        int posicionNumero = busquedaBinaria(numeros, dato);

        System.out.println("El numero " + dato + " esta en la posicion: " + posicionNumero);
    }

    public static int busquedaBinaria(int[] arregloNumeros, int dato) {
        return busquedaBinariaRecursiva(arregloNumeros, dato, 0, LONGITUD - 1);
    }

    public static int busquedaBinariaRecursiva(int[] arregloNumeros, int dato, int inicio, int fin) {
        int medio;
        if (inicio > fin) {
            return -1;
        } else {
            medio = (inicio + fin) / 2;
            if (dato > arregloNumeros[medio]) {
                return busquedaBinariaRecursiva(arregloNumeros, dato, medio + 1, fin);
            } else {
                if (dato < arregloNumeros[medio]) {
                    return busquedaBinariaRecursiva(arregloNumeros, dato, inicio, medio - 1);
                } else {
                    return medio;
                }
            }
        }
    }
}
