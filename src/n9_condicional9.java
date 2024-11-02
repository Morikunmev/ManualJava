import java.util.Scanner;

public class n9_condicional9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.print("Ingrese un valor comprendido entre 1 y 99: ");
        valor = teclado.nextInt();

        if (valor >= 1 && valor <= 9) {
            System.out.println("El valor ingresado es un número del 1 al 9.");
        }else {
            System.out.println("El valor ingresado no es un número del 1 al 9.");
        }
    }
}
