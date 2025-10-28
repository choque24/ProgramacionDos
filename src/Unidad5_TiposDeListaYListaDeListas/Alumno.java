package Unidad5_TiposDeListaYListaDeListas;
/*Apellido y Nombre
Curso (1ro, 2do, 3ro, 4to , 5to ó 6to)
DNI
Domicilio
Teléfono
*/
public class Alumno {
    private String nombre;
    private String apellido;
    private int curso;
    private int dni;
    private String domicilio;
    private int telefono;

    public Alumno(String nombre, String apellido, int curso, int dni, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
