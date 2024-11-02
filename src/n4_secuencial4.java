import java.util.Scanner;

public class n4_secuencial4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precio, importe;
        int cantidad;
        System.out.println("Ingrese el precio: ");
        precio = teclado.nextFloat();
        System.out.println("Ingrese la cantidad: ");
        cantidad = teclado.nextInt();
        importe = precio * cantidad;
        System.out.println("El importe total es: " + importe);

    }
}
