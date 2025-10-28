package Unidad4_Recursividad;

/*2. Para verificar que un arreglo es capicúa de manera recursiva se sigue la siguiente estrategia. Un arreglo es capicúa si el primer elemento es igual al último y si el “subarreglo” que queda entre estos dos elementos también es capicúa. Ejemplo:
 */
public class Capicua {
    public static final int LONGITUD = 1;

    public static void main(String[] args) {
        int[] num = new int[LONGITUD];
        num[0] = 1;
//        num[1] = 2;
//        num[2] = 2;
//        num[3] = 1;

        boolean esCapicua = esCapicua(num);
        System.out.println("El arreglo es capicua? " + esCapicua);
    }

    public static boolean esCapicua(int[] num) {
        return esCapicuaRecursivo(num, 0, LONGITUD - 1);
    }

    private static boolean esCapicuaRecursivo(int[] num, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }

        if (num[inicio] == num[fin]) {
             return esCapicuaRecursivo(num, inicio + 1, fin - 1);
        } else {
            return false;
        }
    }
}
