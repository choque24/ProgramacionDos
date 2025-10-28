package Unidad6_Arboles;

public class AlumnoIntroProg {
    private String nombre;
    private int dni;
    private int nroAlumno;

    public AlumnoIntroProg(String nombre, int dni, int nroAlumno) {
        this.nombre = nombre;
        this.dni = dni;
        this.nroAlumno = nroAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNroAlumno() {
        return nroAlumno;
    }

    public void setNroAlumno(int nroAlumno) {
        this.nroAlumno = nroAlumno;
    }
}
