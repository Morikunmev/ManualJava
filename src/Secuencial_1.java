import java.util.Scanner;

public class Secuencial_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2,suma,producto;

        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        producto = num1 * num2;

        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);

    }
}
