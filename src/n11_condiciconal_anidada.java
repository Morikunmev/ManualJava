import java.util.Scanner;

public class n11_condiciconal_anidada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese el primero valor: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        num3 = teclado.nextInt();
        if (num1>num2){
            if (num1>num3){
                System.out.println("El número mayor es: " + num1);
            } else {
                System.out.println("El número mayor es: " + num3);
            }
        }else {
            if (num2>num3){
                System.out.println("El número mayor es: " + num2);
            } else {
                System.out.println("El número mayor es: " + num3);
            }
        }
    }
}
