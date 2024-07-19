import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //Introducir valores por consola
        Scanner consola = new Scanner(System.in);// in- input- entrada de datos
        System.out.println("Escribe tu nombre aqui");
        String nombre = consola.nextLine();
        System.out.println(nombre);


    }
}