import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double n1,resultado;
        Scanner teclado = new Scanner(System.in);

         System.out.print("Coloque o valor em metros: ");
         n1 = teclado.nextDouble();
         teclado.close();

         resultado = n1*100;

         System.out.printf("\nO resultado foi: %.0f centímetros",resultado);
    }
}
