
import java.util.Scanner;

public class n14_condicional_anidada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalPreguntas, totalCorrectas, porcentaje;
        System.out.println("Cantidad total de preguntas");
        totalPreguntas = teclado.nextInt();
        System.out.println("Cantidad de correctas");
        totalCorrectas = teclado.nextInt();
        porcentaje = (totalCorrectas * 100) / totalPreguntas;
        if(porcentaje>=90){
            System.out.println("Nivel maximo");
        }else {
            if(porcentaje>=80){
                System.out.println("Nivel medio");
            } else {
                System.out.println("Nivel bajo");
            }
        }
    }
}
