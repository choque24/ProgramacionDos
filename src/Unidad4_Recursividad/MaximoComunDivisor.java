package Unidad4_Recursividad;

import java.util.Scanner;

/*1.Calcular recursivamente el Máximo Común Divisor de dos enteros no negativos basándose en las siguientes fórmulas matemáticas:
MCD(X,X)=X             X<Y⇒MCD(X,Y)=MCD(Y,X)        X>Y⇒MCD(X,Y)=MCD(X−Y,Y)
MCD(X,0)=X          X<Y⇒MCD(X,Y)=MCD(Y,X)        X≥Y⇒MCD(X,Y)=MCD(Y,MOD(X,Y))
*/
public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int divisor = maximoComunDivisorUno(num, num2);
        System.out.println("El Maximo Comun Divisor entre " + num + " y " + num2 + " es: " + divisor);
    }

    public static int maximoComunDivisorUno(int a, int b) {
        return maximoComunDivisorRecursivoUno(a, b);
    }

    //    MCD(X,0)=X          X<Y⇒MCD(X,Y)=MCD(Y,X)        X≥Y⇒MCD(X,Y)=MCD(Y,MOD(X,Y))
    private static int maximoComunDivisorRecursivoUno(int x, int y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        if (y == 0) {
            return x;
        }

        if (x < y) {
            return maximoComunDivisorRecursivoUno(y, x);
        } else {
            return maximoComunDivisorRecursivoUno(y, (x % y));
        }
    }


    public static int maximoComunDivisorDos(int a, int b) {
        return maximoComunDivisorRecursivoDos(a, b);
    }

    //    MCD(X,X)=X             X<Y⇒MCD(X,Y)=MCD(Y,X)        X>Y⇒MCD(X,Y)=MCD(X−Y,Y)
    private static int maximoComunDivisorRecursivoDos(int x, int y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        if (x == y) {
            return x;
        }

        if (x < y) {
            return maximoComunDivisorRecursivoDos(y, x);
        } else {
            return maximoComunDivisorRecursivoDos(x - y, y);
        }
    }
}
