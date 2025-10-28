package Unidad6_Arboles;

import java.util.Scanner;

/*
 * 3)Se tiene  un árbol binario cuyos nodos contienen el Nro. Alumno y DNI de los alumnos de Intro II. El árbol está ordenado por DNI. Se pide: a) Hacer un procedimiento/función que dado un DNI retorne el Nro. de Alumno asociado b)Hacer un procedimiento/función que dado un  Nro. de Alumno retorne el DNI asociado
 */
public class ArbolAlumnos {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner sc = new Scanner(System.in);
        AlumnoIntroProg alumno = new AlumnoIntroProg("Mauricio", 46261703, 10);
        AlumnoIntroProg alumno2 = new AlumnoIntroProg("Juan", 36261701, 9);
        AlumnoIntroProg alumno3 = new AlumnoIntroProg("Martin", 50000000, 7);
        AlumnoIntroProg alumno4 = new AlumnoIntroProg("Eugenio", 21320602, 11);
        AlumnoIntroProg alumno5 = new AlumnoIntroProg("bebe", 52453234, 6);
        System.out.println("Arbol alumnos: ");
        arbol.inOrdenAscendenteAlumno();

        arbol.insertarAlumno(alumno);
        arbol.insertarAlumno(alumno2);
        arbol.insertarAlumno(alumno3);
        arbol.insertarAlumno(alumno4);
        arbol.insertarAlumno(alumno5);
        arbol.inOrdenAscendenteAlumno();

//        System.out.print("Ingrese un DNI para buscar el numero de alumno Asociado: ");
//        int dni = sc.nextInt();
//        int nroAlumnoAsociado = arbol.getNroAlumno(dni);
//
//        if(nroAlumnoAsociado > 0){
//            System.out.println("El numero de alumno asociado es: " + nroAlumnoAsociado);
//        } else {
//            System.out.println("El numero de alumno no esta asociado al Dni: " + dni);
//        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese un Nro del Alumno: ");
            int nroAlumno = sc.nextInt();
            int dniAsociado = arbol.getDni(nroAlumno);

            if (dniAsociado > 0) {
                System.out.println("El Nro del Alumno es: " + dniAsociado);
            } else {
                System.out.println("No hay dni Asociado");
            }
            sc.nextLine();
        }
    }
}
