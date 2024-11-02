import java.util.Scanner;

public class n6_condicional6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor número es: " + num1);
        }

        if (num2 > num1) {
            System.out.println("El mayor número es: " + num2);
        }
    }
}
