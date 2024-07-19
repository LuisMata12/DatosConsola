import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer in tipo int
        Scanner consola =new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = consola.nextInt();
        System.out.println("edad: "+edad);

        //Leer un tipo Double
        Scanner consolaD =new Scanner(System.in);
        System.out.println("Introduce tu estatura");
        double estatura = consolaD.nextDouble();
        System.out.println("estatura: "+estatura);
    }
}
