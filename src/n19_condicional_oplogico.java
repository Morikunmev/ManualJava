import java.util.Scanner;

public class n19_condicional_oplogico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3;

        System.out.print("Ingrese el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = teclado.nextInt();
        if(num1<10 || num2<10 || num3<10){
            System.out.println("Al menos uno de los números es menor a 10.");
        }
    }
}
