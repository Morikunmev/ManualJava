import java.util.Scanner;

public class n2_Secuencial_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado,perimetro;

        System.out.print("Ingrese el lado del cuadrado: ");
        lado = teclado.nextInt();
        perimetro = lado * 4;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        teclado.close();  // Cerrar el scanner para liberar recursos.
    }
}
