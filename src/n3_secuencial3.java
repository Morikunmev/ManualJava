import java.util.Scanner;

public class n3_secuencial3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3,num4,suma,producto;
        System.out.println("Ingrese el primer valor: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto valor: ");
        num4 = teclado.nextInt();
        suma = num1 + num2 + num3 + num4;
        producto = num1 * num2 * num3 * num4;
        System.out.println("La suma de los valores ingresados es: " + suma);
        System.out.println("El producto de los valores ingresados es: " + producto);
    }
}
