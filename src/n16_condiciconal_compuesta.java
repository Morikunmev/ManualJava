import java.util.Scanner;

public class n16_condiciconal_compuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año;
        System.out.println("Ingrese dia: ");
        dia = teclado.nextInt();
        System.out.println("Ingrese mes: ");
        mes = teclado.nextInt();
        System.out.println("Ingrese año: ");
        año = teclado.nextInt();
        if(dia == 25 && mes ==12){
            System.out.println("La fecha correspondiente navidad");
        }


    }
}
