import java.util.Scanner;

public class n15_condicional_compuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2,num3;
        System.out.println("Ingrese el primer valor:");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer valor:");
        num3 = teclado.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0) {
            System.out.println("Todos los valores son pares.");
        }

        if (num1 % 2 == 0 || num2 % 2 == 0 || num3 % 2 == 0) {
            System.out.println("Al menos un valor es par.");
        }
    }
}
