import java.util.Scanner;

public class SistemaDeEmpleados {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el nombre del empleado");
        String nombreDelEmpleado = consola.nextLine();

        System.out.println("Edad del empleado");
        int edadDelEmpleado = Integer.parseInt(consola.nextLine());

        System.out.println("Salario del empleado");
        double salarioDelEmpleado = Double.parseDouble(consola.nextLine());

        System.out.println("Es jefe de departamento");
        boolean jefeDeDepartameto = Boolean.parseBoolean(consola.nextLine());

        System.out.println("Nombre: "+nombreDelEmpleado+ "\n"+
                            "Edad: "+edadDelEmpleado+"\n"+
                            "Salario: "+salarioDelEmpleado+"\n"+
                            "Jefe: "+jefeDeDepartameto);
    }
}
