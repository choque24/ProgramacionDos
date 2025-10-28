package Unidad3_ListasSimples;

/*ListadePacientes con los siguientes métodos:

//LISTO
Ingresar  un paciente conservando el orden


Dado un  número de paciente, y un domicilio, modificar el mismo, si es que existe el paciente en la lista

//LISTO
Dado un número de paciente, borrarlo de la lista  si es que existe

//LISTO
Retornar el número de paciente de mayor edad

//LISTO
Mostrar la lista de pacientes
*/
public class ListaPacientesOrdenada {
    private NodoPaciente primero;

    public ListaPacientesOrdenada() {
        this.primero = null;
    }

    public void mostrarPacientes() {
        NodoPaciente paciente = primero;

        if(paciente == null) {
            System.out.println("La lista esta vacia");
            return;
        }

        while (paciente != null) {
            System.out.println(paciente.getPaciente());
            paciente = paciente.getSiguiente();
        }
        System.out.println();
    }

    public void insertarPacienteOrdenado(Paciente paciente) {
        NodoPaciente nuevoPaciente = new NodoPaciente(paciente);
        NodoPaciente actual = primero;

        if (primero == null || primero.getPaciente().getNumeroPaciente() > nuevoPaciente.getPaciente().getNumeroPaciente()) {
            nuevoPaciente.setSiguiente(primero);
            primero = nuevoPaciente;
            return;
        }
        while (actual.getSiguiente() != null && actual.getSiguiente().getPaciente().getNumeroPaciente() < nuevoPaciente.getPaciente().getNumeroPaciente()) {
            actual = actual.getSiguiente();
        }

        nuevoPaciente.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevoPaciente);
    }

    //    Dado un número de paciente, borrarlo de la lista  si es que existe
    public void eliminarPacienteOrdenada(int numeroPaciente) {
        NodoPaciente paciente = primero;

        if (primero == null || paciente.getPaciente().getNumeroPaciente() > numeroPaciente) {
            return;
        }

        if (primero.getPaciente().getNumeroPaciente() == numeroPaciente) {
            primero = primero.getSiguiente();
            return;
        }

        while (paciente.getSiguiente() != null && paciente.getSiguiente().getPaciente().getNumeroPaciente() < numeroPaciente) {
            paciente = paciente.getSiguiente();
        }

        if (paciente.getSiguiente() != null && paciente.getSiguiente().getPaciente().getNumeroPaciente() == numeroPaciente) {
            paciente.setSiguiente(paciente.getSiguiente().getSiguiente());
        }
    }

    //    Retornar el número de paciente de mayor edad
    public String getPacienteMayor() {
        NodoPaciente paciente = primero;

        if (paciente == null) {
            return null;
        }

        int edadMasAlta = paciente.getPaciente().getEdad();
        String pacienteMayor = paciente.getPaciente().getNombre();

        while (paciente != null) {
            if (paciente.getPaciente().getEdad() > edadMasAlta) {
                edadMasAlta = paciente.getPaciente().getEdad();
                pacienteMayor = paciente.getPaciente().getNombre();
            }
            paciente = paciente.getSiguiente();
        }

        return pacienteMayor;
    }

//    Dado un  número de paciente, y un domicilio, modificar el mismo, si es que existe el paciente en la lista
    public void cambiarDomicilio(int numeroPaciente, String nuevoDomicilio) {
        NodoPaciente paciente = primero;

        while(paciente != null && paciente.getPaciente().getNumeroPaciente() < numeroPaciente) {
            paciente = paciente.getSiguiente();
        }

        if(paciente != null && paciente.getPaciente().getNumeroPaciente() == numeroPaciente) {
            paciente.getPaciente().setDomicilio(nuevoDomicilio);
        }
    }

    public NodoPaciente getPrimero(){
        return primero;
    }
}
