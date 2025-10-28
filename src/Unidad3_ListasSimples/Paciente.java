package Unidad3_ListasSimples;

import java.io.Serializable;

/*Se tiene una lista simple de PACIENTES de un consultorio local con los siguientes datos: número de  paciente, apellido y nombre, edad, domicilio(como un string), Obra Social(booleano que tiene un True si el paciente posee OS y False si no tiene).  La lista está ordenada por número de paciente.
 */
public class Paciente implements Serializable {
    private static final long serialVersionUID = 1L;
    private int numeroPaciente;
    private String nombre;
    private String apellido;
    private int edad;
    private String domicilio;
    private boolean obraSocial;

    public Paciente(int numeroPaciente, String nombre, String apellido, int edad, String domicilio, boolean obraSocial) {
        this.numeroPaciente = numeroPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.domicilio = domicilio;
        this.obraSocial = obraSocial;
    }

    /// Getters y Setters
    public int getNumeroPaciente() {
        return numeroPaciente;
    }
    public void setNumeroPaciente(int numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public boolean tieneObraSocial() {
        return obraSocial;
    }
    public void setObraSocial(boolean obraSocial) {
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente { " + "NumeroPaciente= " + numeroPaciente + ", Nombre= " + nombre
                + ", Apellido= " + apellido + ", Edad: " + edad + ", Domicilio= " + domicilio + ", ObraSocial= "
                + obraSocial;
    }
}
