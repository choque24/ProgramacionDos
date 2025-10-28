package Unidad3_ListasSimples;
/// *Ejercicio 6:  Usar la  clase Lista de Pacientes en un programa
//     Crear un programa que cree una lista de pacientes vacía y luego permita mediante un menú ingresar paciente, dar de baja un paciente, modificar el domicilio de un paciente, retornar el paciente de mayor edad y mostrar la lista de pacientes.
//*/
/*

* Utilizando la clase Lista de Pacientes (Ejercicio 6 del práctico 3) implemente un programa de gestión de pacientes de un consultorio mediante un menú de operaciones y persistencia de datos de la siguiente manera:
Al comenzar la ejecución del programa se lean y carguen en la lista todos los pacientes de un archivo (si existe, de lo contrario crear el archivo vacío), luego entrar en un menú con todas las opciones que se mencionan a continuación y finalmente al salir del programa recorrer la lista y guardar todos los pacientes en el archivo para tenerlos disponibles en la próxima ejecución.

MENU: (Ejercicio 5 del práctico 3):
Ingresar  un paciente conservando el orden
Dado un  número de paciente, y un domicilio, modificar el mismo, si es que existe el paciente en la lista
Dado un número de paciente, borrarlo de la lista  si es que existe
Retornar el número de paciente de mayor edad
Mostrar la lista de pacientes
Mostrar la lista de pacientes en orden inverso (parte del ej. 4 del Práctico 4)
Salir del programa
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ConsultorioLocal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ListaPacientesOrdenada lista = new ListaPacientesOrdenada();

        String rutaArchivo = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\ListaPacientes.txt";

        boolean archivoExiste = Files.exists(Paths.get(rutaArchivo));

        if (archivoExiste) {
            //Si existe leo sus datos
            leerObjetosArchivo(lista, rutaArchivo);
        } else {
            //Si no existe lo creo vacio
            crearArchivo(rutaArchivo);
        }
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("Ingrese la operacion que desea realizar:" +
                    "\n1: Ingresar Paciente" +
                    "\n2: Eliminar Paciente" +
                    "\n3: Modificar Domicilio de Paciente" +
                    "\n4: Averiguar Paciente de mayor edad" +
                    "\n5: Mostrar la lista de Pacientes " +
                    "\n6: Salir");
            opcion = sc.nextInt();
            menu(lista, opcion);
        }
        guardarPacientes(lista, rutaArchivo);
    }

    public static void leerObjetosArchivo(ListaPacientesOrdenada lista, String rutaArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            while (true) {
                try {
                    Paciente paciente = (Paciente) ois.readObject();
                    lista.insertarPacienteOrdenado(paciente);
                    System.out.println("Paciente Ingresado con exito " + paciente);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error al leer el archivo");
            e.printStackTrace();
        } catch (Exception i) {
            System.out.println("Ocurrio un error inesperado");
            i.printStackTrace();
        }
    }

    public static void crearArchivo(String rutaArchivo) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(rutaArchivo))) {
            System.out.println("Archivo creado con la ruta " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir el archivo");
        }
    }

    public static void menu(ListaPacientesOrdenada lista, int opcion) {
        switch (opcion) {
            case 1:
                lista.insertarPacienteOrdenado(crearPaciente());
                System.out.println("Paciente agregado exitosamente");
                break;
            case 2:
                System.out.print("Ingrese el numero de paciente que quiere eliminar: ");
                lista.eliminarPacienteOrdenada(sc.nextInt());
                System.out.println("Paciente Eliminado exitosamente");
                break;
            case 3:
                System.out.print("Ingrese numero de paciente que quiere cambiar domicilio, luego el domicilio nuevo: ");
                lista.cambiarDomicilio(sc.nextInt(), sc.next());
                System.out.println("Opcion 3");
                break;
            case 4:
                System.out.println("El paciente de mayor edad es: " + lista.getPacienteMayor());
                break;
            case 5:
                lista.mostrarPacientes();
                break;
            case 6:
                System.out.println("Va a salir del programa");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static void guardarPacientes(ListaPacientesOrdenada lista, String rutaArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            NodoPaciente nodoPaciente = lista.getPrimero();
            while (nodoPaciente != null) {
                Paciente paciente = nodoPaciente.getPaciente();
                System.out.println(paciente);
                oos.writeObject(paciente);
                nodoPaciente = nodoPaciente.getSiguiente();
            }
            System.out.println("Pacientes guardados exitosamente");
        } catch (IOException i) {
            System.out.println("Error IO al guardar el archivo");
            i.printStackTrace();
        } catch (Exception i) {
            System.out.println("Error al guardar el archivo");
            i.printStackTrace();
        }
    }

    //Usar try catch vagoneta
    public static Paciente crearPaciente() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingrese el numero de paciente: ");
                int numeroPaciente = sc.nextInt();
                System.out.print("Ingrese el nombre: ");
                String nombre = sc.next();
                System.out.print("Ingrese el apellido: ");
                String apellido = sc.next();
                System.out.print("Ingrese la edad: ");
                int edad = sc.nextInt();
                System.out.print("Ingrese Domicilio del paciente: ");
                String domicilio = sc.next();
                sc.nextLine();
                System.out.print("Indique si el paciente posee Obra Social. (true, false)");
                boolean obraSocial = sc.nextBoolean();
                return new Paciente(numeroPaciente, nombre, apellido, edad, domicilio, obraSocial);
            } catch (Exception e) {
                System.out.println("Error al ingresar algun dato de paciente");
                sc.nextLine();
            }
        }
    }
}
