package Unidad2_Archivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializarObjeto {
    public static void main(String[] args) {
        Persona persona = null;

        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\archivo.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            persona = (Persona) in.readObject();
            System.out.println("Objeto deserializado: " + persona);
            System.out.println(persona.getNombre());
            System.out.println(persona);

        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("Objeto no encontrado: " + persona);
        } catch (ClassNotFoundException c) {
            System.out.println("Clase no encontrado");
            c.printStackTrace();
        }
    }
}

