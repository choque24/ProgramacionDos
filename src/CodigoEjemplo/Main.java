package CodigoEjemplo;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto pan = new Producto("Pan", 150.0);
        Producto leche = new Producto("Leche", 320.0);
        Producto queso = new Producto("Queso", 600.0);

        // Crear carrito con capacidad de 5 productos
        CarritoDeCompras carrito = new CarritoDeCompras(5);

        // Agregar productos
        carrito.agregarProducto(pan);
        carrito.agregarProducto(leche);
        carrito.agregarProducto(queso);

        // Mostrar contenido del carrito
        carrito.mostrarCarrito();

        // Mostrar total
        System.out.println("Total a pagar: $" + carrito.calcularTotal());
    }
}