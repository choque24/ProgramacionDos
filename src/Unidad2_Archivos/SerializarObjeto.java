package Unidad2_Archivos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarObjeto {
    public static void main(String[] args) {
        Persona persona = new Persona("Dario", 19);
//        String path = "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\archivo3.txt";

        try{
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\archivo4.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(persona);
            System.out.println("Objeto serializado en el archivo: " + "C:\\Users\\mauri\\Downloads\\Mauri\\Prog2\\archivo4.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
