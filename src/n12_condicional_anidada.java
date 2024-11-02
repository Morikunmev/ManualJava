import java.util.Scanner;

public class n12_condicional_anidada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un valor entero: ");
        num = scanner.nextInt();
        if(num==0) {
            System.out.println("El número es cero");
        }else {
            if(num>0){
                System.out.println("El número es positivo");
            }else {
                System.out.println("Negativo");
            }
        }
    }
}
