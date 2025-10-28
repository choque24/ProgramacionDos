package Unidad5_TiposDeListaYListaDeListas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaDobleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDobleVinculadaOrdenadaEnteros lista = new ListaDobleVinculadaOrdenadaEnteros();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== MENÚ LISTA DOBLE ORDENADA =====");
            System.out.println("1. Crear lista vacía");
            System.out.println("2. Insertar elemento");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Mostrar lista desde el inicio");
            System.out.println("5. Mostrar lista desde el final");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("❌ Entrada inválida. Por favor, ingrese un número del 1 al 6.");
                scanner.nextLine(); // limpiar el buffer
                continue;
            }

            switch (opcion) {
                case 1:
                    lista = new ListaDobleVinculadaOrdenadaEnteros();
                    System.out.println("✅ Lista vacía creada correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese un número entero para insertar: ");
                    try {
                        int datoInsertar = scanner.nextInt();
                        lista.insertarElementoOrdenado(datoInsertar);
                        System.out.println("✅ Elemento insertado correctamente.");
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Entrada inválida. Debe ser un número entero.");
                        scanner.nextLine(); // limpiar el buffer
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el número entero a eliminar: ");
                    try {
                        int datoEliminar = scanner.nextInt();
                        lista.eliminarElementoOrdenado(datoEliminar);
                        System.out.println("✅ Elemento eliminado (si existía).");
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Entrada inválida. Debe ser un número entero.");
                        scanner.nextLine(); // limpiar el buffer
                    }
                    break;
                case 4:
                    System.out.println("🔽 Lista desde el inicio:");
                    lista.mostrarListaDoble();
                    break;
                case 5:
                    System.out.println("🔼 Lista desde el final:");
                    lista.mostrarListaDobleInversa();
                    break;
                case 6:
                    salir = true;
                    System.out.println("👋 Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
