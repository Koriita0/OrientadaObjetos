import java.util.Scanner;

public class p007_OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush(); // Borrar pantalla de la consola

        System.out.print("Dame un número: ");
        float numeroUsuario = new Scanner(System.in).nextInt();

        System.out.printf("Número original: %.2f \n", numeroUsuario);
        System.out.printf("Incrementar en 1: %.2f \n", ++numeroUsuario);
        System.out.printf("Sumar 80: %.2f \n", numeroUsuario += 80);
        System.out.printf("Restar 35: %.2f \n", numeroUsuario -= 35);
        System.out.printf("Multiplicar por 15: %.2f \n", numeroUsuario *= 15);
        System.out.printf("Dividir entre 4: %.2f \n", numeroUsuario /= 4);
        System.out.printf("Decrementar en 1: %.2f \n", --numeroUsuario);
    }
}
