import java.util.Scanner;

public class n20_condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y;
        System.out.println("Ingrese la coordenada x:");
        x = teclado.nextInt();
        System.out.println("Ingrese la coordenada y:");
        y = teclado.nextInt();
        if(x == 0 && y == 0){
            System.out.println("El punto está en el origen");
        }
        else if(x == 0){
            System.out.println("El punto está en el eje y");
        }
    }

}
