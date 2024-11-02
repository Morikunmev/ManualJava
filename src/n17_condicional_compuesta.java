import java.util.Scanner;

public class n17_condicional_compuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2,num3;
        System.out.println("Ingrese el primer valor");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer valor");
        num3 = teclado.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número más grande es " + num1);
            if (num2 > num3) {
                System.out.println("El segundo número más grande es " + num2);
            } else {
                System.out.println("El segundo número más grande es " + num3);
            }
        }
    }
}
