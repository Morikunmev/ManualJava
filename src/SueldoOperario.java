import java.util.Scanner;

public class SueldoOperario {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int horasTrabajadas;
        float costoHora;
        float sueldo;

        System.out.println("Ingrese las horas trabajadas 2: ");
        horasTrabajadas = teclado.nextInt();
        System.out.println("Ingrese el costo de la hora");
        costoHora = teclado.nextFloat();
        sueldo = horasTrabajadas * costoHora;
        System.out.println("Sueldo del operatio: ");
        System.out.printf("$%.2f%n", sueldo);
    }
}
