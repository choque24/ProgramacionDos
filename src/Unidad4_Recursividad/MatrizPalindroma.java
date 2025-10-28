package Unidad4_Recursividad;

/*Realizar un metodo que verifique  recursivamente que una matriz cuadrada de MaxFilas por MaxColumnas de caracteres de  lado es palíndroma (capicúa en todas sus filas y columnas).
todo Sistema de deteccion de Capicua en cada columna
 */
public class MatrizPalindroma {
    public static final int MAX_FILAS = 4;
    public static final int MAX_COLUMNAS = 4;

    public static void main(String[] args) {
        System.out.println("Matriz Palindroma");
        char[][] matriz = new char[MAX_FILAS][MAX_COLUMNAS];
//        Fila 1
        matriz[0][0] = 'b';
        matriz[0][1] = 'a';
        matriz[0][2] = 'a';
        matriz[0][3] = 'b';
//        Fila 2
        matriz[1][0] = 'a';
        matriz[1][1] = 'a';
        matriz[1][2] = 'a';
        matriz[1][3] = 'a';
//        Fila 3
        matriz[2][0] = 'a';
        matriz[2][1] = 'a';
        matriz[2][2] = 'a';
        matriz[2][3] = 'a';
//        Fila 4
        matriz[3][0] = 'b';
        matriz[3][1] = 'a';
        matriz[3][2] = 'a';
        matriz[3][3] = 'b';

        printMatrix(matriz);

        System.out.println("La matriz es palindroma?: " + esMatrizPalindroma(matriz));
    }

    public static void printMatrix(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    private static boolean esMatrizPalindroma(char[][] matriz) {
        return esMatrizPalindromaPrivado(matriz, 0);
    }

    public static boolean esMatrizPalindromaPrivado(char[][] matriz, int fila) {
        if (fila >= MAX_FILAS) {
            return true;
        }

        if (esArregloPalindroma(matriz[fila], 0, MAX_COLUMNAS - 1)) {
            return esMatrizPalindromaPrivado(matriz, fila + 1);
        } else {
            return false;
        }
    }

    public static boolean esArregloPalindroma(char[] arreglo, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (arreglo[inicio] == arreglo[fin]) {
            return esArregloPalindroma(arreglo, inicio + 1, fin - 1);
        } else {
            return false;
        }
    }
}
