package Unidad4_Recursividad;

public class UsoRecursion {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("El factorial de " + i + " es: " + getFactorial(i));
        }
    }

    public static int getFactorial(int numero) {
        if(numero == 0){
            return 1;
        }
        else{
            return numero * getFactorial(numero-1);
        }

    }
}
