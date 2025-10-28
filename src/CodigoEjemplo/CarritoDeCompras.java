package CodigoEjemplo;

public class CarritoDeCompras {
    private Producto[] productos;
    private int cantidad;

    // Constructor
    public CarritoDeCompras(int capacidad) {
        productos = new Producto[capacidad];
        cantidad = 0;
    }

    // Agregar un producto
    public void agregarProducto(Producto p) {
        if (cantidad < productos.length) {
            productos[cantidad] = p;
            cantidad++;
        } else {
            System.out.println("Carrito lleno. No se puede agregar más productos.");
        }
    }

    // Mostrar todos los productos
    public void mostrarCarrito() {
        System.out.println("Productos en el carrito:");
        for (int i = 0; i < cantidad; i++) {
            productos[i].mostrarProducto();
        }
    }

    // Calcular el total
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
}
