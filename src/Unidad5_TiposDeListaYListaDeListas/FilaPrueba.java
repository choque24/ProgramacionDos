package Unidad5_TiposDeListaYListaDeListas;

public class FilaPrueba {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.escribirFila();
        fila.extraer();

        System.out.println("La fila esta vacia? : " + fila.estaVacia());

        System.out.println("El primero elemento de la fila y el primero en salir es: " + fila.getPrimero());
        System.out.println("El ultimo elemento de la fila y el ultimo en salir es: " + fila.getUltimo());


        fila.insertarElementoAlFinal(2);
        fila.insertarElementoAlFinal(3);
        fila.insertarElementoAlFinal(1);
        fila.insertarElementoAlFinal(4);
        fila.insertarElementoAlFinal(0);


        fila.extraer();

        fila.escribirFila();

        System.out.println("La fila esta vacia? : " + fila.estaVacia());

        System.out.println("El primero elemento de la fila y el primero en salir es: " + fila.getPrimero().getDato());
        System.out.println("El ultimo elemento de la fila y el ultimo en salir es: " + fila.getUltimo().getDato());
        fila.extraer();
        fila.escribirFila();

    }

}
