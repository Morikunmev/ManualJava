import java.util.Scanner;

public class n22_condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2,num3;
        System.out.println("Ingrese el primer valor: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        num3 = teclado.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println(num1);
        }else {
            if(num2<num1 && num2<num3){
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }
        }

    }
}
