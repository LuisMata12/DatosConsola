import java.util.Random;
import java.util.Scanner;

public class GeneradorDeID {
    public static void main(String[] args) {
//      Crea un algoritmo que tome las primeras letras del nombre las primeras letras de apellido
//      los ultimos dijitos de la fecha de mecimiento y un numero aleatorio de 4 digitos en caso
//      de que el numero a leatorio te de solo 3 rellenar con 0
        Scanner consola = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingresa tu nombre");
        String nombre = consola.nextLine();
        String nombreId = nombre.substring(0,2).toLowerCase();

        System.out.println("ingresa tu apellido");
        String apellido = consola.nextLine();
        String apellido2 = apellido.substring(0,2).toLowerCase();

        System.out.println("Ingresa tu año de nacimiento");
        String fechaDeNacimiento = consola.nextLine();
        String fechaDeNacimiento2= fechaDeNacimiento.substring(fechaDeNacimiento.length()-2);


        int aleatorio = random.nextInt(0,999);
        StringBuilder aleatorioMayorA4 = new StringBuilder();
        aleatorioMayorA4.append(aleatorio);
        if (aleatorioMayorA4.length()<4){
            for (int j = 0; j < (4-aleatorioMayorA4.length());j++){
                aleatorioMayorA4.append('0');
            }
        }

        String ID = nombreId+apellido2+fechaDeNacimiento2+aleatorioMayorA4;

        System.out.println(ID);
    }
}
