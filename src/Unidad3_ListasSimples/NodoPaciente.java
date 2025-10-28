package Unidad3_ListasSimples;

public class NodoPaciente {
    private Paciente paciente;
    private NodoPaciente siguiente;

    public NodoPaciente(Paciente paciente) {
        this.paciente = paciente;
        this.siguiente = null;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public NodoPaciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPaciente siguiente) {
        this.siguiente = siguiente;
    }
}
