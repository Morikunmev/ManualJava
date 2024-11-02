import java.util.Scanner;

public class n13_condicional_anidada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un valor positivo: ");
        num = scanner.nextInt();
        if (num<10){
            System.out.println("Tiene 1 digito");
        }else {
            if(num<100){
                System.out.println("Tiene 2 digito");
            }else {
                if(num<1000){
                    System.out.println("ITiene 3 digito");
                }else {
                    System.out.println("Error en la entrada de datos");
                }
            }
        }
    }
}
