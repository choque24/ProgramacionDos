package Unidad6_Arboles;

public class NodoAlumno {
    private AlumnoIntroProg alumno;
    private NodoAlumno menores;
    private NodoAlumno mayores;

    public NodoAlumno(AlumnoIntroProg alumno) {
        this.alumno = alumno;
        this.menores = null;
        this.mayores = null;
    }

    public AlumnoIntroProg getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoIntroProg alumno) {
        this.alumno = alumno;
    }

    public NodoAlumno getMayores() {
        return mayores;
    }

    public void setMayores(NodoAlumno mayores) {
        this.mayores = mayores;
    }

    public NodoAlumno getMenores() {
        return menores;
    }

    public void setMenores(NodoAlumno menores) {
        this.menores = menores;
    }
}
