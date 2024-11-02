import java.util.Scanner;

public class n18_condicional_compuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = scanner.nextInt();
        if(num1<10 && num2<10 && num3<10){
            if(num1>num2 && num1>num3){
                System.out.println("El número más grande es: " + num1);
            } else if(num2>num1 && num2>num3){
                System.out.println("El número más grande es: " + num2);
            } else {
                System.out.println("El número más grande es: " + num3);
            }
        }
    }
}
