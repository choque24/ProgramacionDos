package Unidad3_ListasSimples;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente5 = new Paciente(5, "Mauricio", "Choque", 5, "Colon", true);
        Paciente paciente3 = new Paciente(3, "Maria", "Chavez", 3, "America", true);
        Paciente paciente7 = new Paciente(7, "Juan", "Chavez", 7, "America", true);
        Paciente paciente2 = new Paciente(2, "Juan", "Chavez", 2, "America", true);
        ListaPacientesOrdenada lista = new ListaPacientesOrdenada();

        System.out.println("El nombre de mi paciente es: " + paciente5.getNombre());
        System.out.println(paciente5);
        System.out.println("El nombre de mi paciente es: " + paciente3.getNombre());
        System.out.println(paciente3);

        System.out.println(lista.getPacienteMayor());
        lista.insertarPacienteOrdenado(paciente3);
        lista.insertarPacienteOrdenado(paciente2);
        lista.insertarPacienteOrdenado(paciente5);
        lista.insertarPacienteOrdenado(paciente7);
        System.out.println("El paciente mas viejo es el paciente: " + lista.getPacienteMayor());
        lista.mostrarPacientes();

        System.out.println("Ingrese un numero de paciente para cambiar el nombre: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nuevo domicilio: ");
        String domicilio = sc.nextLine();
        lista.cambiarDomicilio(num, domicilio);
        System.out.println(paciente2);


        lista.eliminarPacienteOrdenada(8);
        lista.eliminarPacienteOrdenada(1);
        lista.eliminarPacienteOrdenada(7);
        lista.eliminarPacienteOrdenada(2);
        lista.eliminarPacienteOrdenada(3);
        lista.eliminarPacienteOrdenada(4);
        lista.eliminarPacienteOrdenada(5);
        lista.mostrarPacientes();
    }
}
