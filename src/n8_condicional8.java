import java.util.Scanner;

public class n8_condicional8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota1,nota2,nota3;
        int promedio;
        System.out.println("Ingrese la primera nota: ");
        nota1 = teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = teclado.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);
        if (promedio >= 7) {
            System.out.println("El alumno aprobó con el promedio: " + promedio);
        } else {
            System.out.println("El alumno reprobó con el promedio: " + promedio);
        }
    }
}
