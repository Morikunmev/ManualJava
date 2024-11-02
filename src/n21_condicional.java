import java.util.Scanner;

public class n21_condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float sueldo;
        int antiguedad;
        System.out.println("Ingrese el sueldo: ");
        sueldo = teclado.nextFloat();
        System.out.println("Ingrese la antiguedad en años: ");
        antiguedad = teclado.nextInt();

        // Condicional IF-ELSE
        if (sueldo >= 1500 && antiguedad >= 5) {
            System.out.println("El empleado puede aplicar para el seguro de desempleo.");
        } else {
            System.out.println("El empleado no puede aplicar para el seguro de desempleo.");
        }
    }
}
