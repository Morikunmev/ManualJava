import java.util.Scanner;

public class n7_condicional7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        int suma, diferencia;
        int producto, division;

        System.out.print("Ingrese el primer valor: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num2 = teclado.nextInt();
        if(num1>num2){
            suma = num1 + num2;
            diferencia = num1 - num2;
            System.out.println("La suma es: " + suma);
            System.out.println("La diferencia es: " + diferencia);
        }else {
            producto = num1 * num2;
            division = num1 / num2;
            System.out.println("El producto es: " + producto);
            System.out.println("La division es: " + division);
        }
    }
}
