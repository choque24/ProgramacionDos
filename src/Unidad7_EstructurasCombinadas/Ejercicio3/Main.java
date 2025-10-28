package Unidad7_EstructurasCombinadas.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        ArbolUsuario sistema = new ArbolUsuario();

        // Simular que el árbol ya está cargado
        sistema.cargarArbolInicial();

        System.out.println("=== SISTEMA DE USUARIOS ===");
        sistema.mostrarArbolPorNumero();

        for (int i = 0; i < 5; i++) {
            // Crear árbol por nombre con rango
            sistema.crearArbolPorNombre();
        }

        // Mostrar resultado
        sistema.mostrarArbolPorNombre();
    }
}
