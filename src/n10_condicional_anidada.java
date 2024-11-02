import java.util.Scanner;

public class n10_condicional_anidada
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int nota1, nota2, nota3;
        System.out.println("Ingrese la priemra nota:");
        nota1 = teclado.nextInt();
        System.out.println("Ingrese la segunda nota:");
        nota2 = teclado.nextInt();
        System.out.println("Ingrese la tercera nota:");
        nota3 = teclado.nextInt();
        int prom = (nota1 + nota2 + nota3);
        if (prom>=7){
            System.out.println("El promedio es: " + prom);
            if (nota1>=7 && nota2>=7 && nota3>=7){
                System.out.println("El alumno aprobó en todas las materias.");
            }
            else{
                System.out.println("El alumno reprobó en alguna materia.");
            }
        }




    }



}
