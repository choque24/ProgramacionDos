package Unidad5_TiposDeListaYListaDeListas;

public class Empleado {
    private String apellido;
    private String nombre;
    private char categoria;
    private int sueldo;

    public Empleado(String apellido, String nombre, char categoria, int sueldo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.categoria = categoria;
        this.sueldo = sueldo;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
