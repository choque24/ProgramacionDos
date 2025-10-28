package CodigoEjemplo;

public class Producto {
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para mostrar información
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio);
    }
}