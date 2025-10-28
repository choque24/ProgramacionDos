package Unidad5_TiposDeListaYListaDeListas;

import java.util.Scanner;

/*4.  Se tiene los datos de un empleado: Apellido y nombre(string), Categoría(char),Sueldo
Realice un programa que lea por teclado los datos de varios empleados  para generar una lista ordenada de categorías, donde, para cada categoría, existe otra lista con los apellidos y nombres y sueldos de los empleados de la misma categoría  ordenada por apellido y nombre. Cuando el usuario no quiere entrar más empleados, entra una XX como Apellido.
Codifique un procedimiento que, dada la lista anterior, pida un número de categoría e imprima todos los empleados que la poseen.
*/
public class EmpleadoMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEmpleados listaCategorias = new ListaEmpleados();

        while (true) {
            System.out.print("Ingrese apellido del empleado (XX para terminar): ");
            String apellido = sc.nextLine();
            if (apellido.equalsIgnoreCase("XX")) break;

            System.out.print("Ingrese nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese categoría (una letra): ");
            char categoria = sc.nextLine().toUpperCase().charAt(0);

            System.out.print("Ingrese sueldo: ");
            int sueldo = Integer.parseInt(sc.nextLine());

            Empleado nuevo = new Empleado(apellido, nombre, categoria, sueldo);
            listaCategorias.insertarEmpleado(nuevo);
        }

        // Acá después podrías agregar un menú para mostrar empleados por categoría, etc.
        System.out.println("Carga finalizada.");

        System.out.println("\n--- Consulta de empleados por categoría ---");
        System.out.print("Ingrese una categoría para mostrar (una letra): ");
        char catConsulta = sc.nextLine().toUpperCase().charAt(0);

        listaCategorias.mostrarEmpleadosDeCategoria(catConsulta);

    }
}
