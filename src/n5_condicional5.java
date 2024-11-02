import java.util.Scanner;

public class n5_condicional5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sueldo;
        System.out.println("Ingrese el sueldo: ");
        sueldo = teclado.nextFloat();

        if (sueldo <= 1000) {
            System.out.println("El sueldo es menor o igual a 1000.");
        }

        if (sueldo > 1000 && sueldo <= 2000) {
            System.out.println("El sueldo se encuentra entre 1001 y 2000.");
        }
    }
}
