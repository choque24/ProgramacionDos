package Unidad7_EstructurasCombinadas.Ejercicio3;

public class NodoUsuario {
    private Usuario usuario;

    private NodoUsuario ant_nro;
    private NodoUsuario sig_nro;

    private NodoUsuario ant_nombre;
    private NodoUsuario sig_nombre;

    public NodoUsuario(Usuario usuario) {
        this.usuario = usuario;
        ant_nro = null;
        sig_nro = null;
        ant_nombre = null;
        sig_nombre = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getNroUsuario() {
        return usuario.getNro_usuario();
    }

    public String getNombre() {
        return usuario.getNombre();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoUsuario getAntNro() {
        return ant_nro;
    }

    public void setAntNro(NodoUsuario ant_nro) {
        this.ant_nro = ant_nro;
    }

    public NodoUsuario getSigNro() {
        return sig_nro;
    }

    public void setSigNro(NodoUsuario sig_nro) {
        this.sig_nro = sig_nro;
    }

    public NodoUsuario getAntNombre() {
        return ant_nombre;
    }

    public void setAntNombre(NodoUsuario ant_nombre) {
        this.ant_nombre = ant_nombre;
    }

    public NodoUsuario getSigNombre() {
        return sig_nombre;
    }

    public void setSigNombre(NodoUsuario sig_nombre) {
        this.sig_nombre = sig_nombre;
    }
}
