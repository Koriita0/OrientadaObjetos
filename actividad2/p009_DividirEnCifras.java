import java.util.Scanner;

public class p009_DividirEnCifras {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush(); // Limpia la consola

        int numeroIngresado, cifraUnidades, cifraDecenas, cifraCentenas;

        System.out.println("Dame un número entero de 3 cifras: ");
        numeroIngresado = new Scanner(System.in).nextInt();

        cifraCentenas = numeroIngresado / 100;
        cifraDecenas = (numeroIngresado - cifraCentenas * 100) / 10;
        cifraUnidades = numeroIngresado - (cifraCentenas * 100 + cifraDecenas * 10);

        System.out.println("El número introducido fue: " + numeroIngresado);
        System.out.println("Centenas: " + cifraCentenas);
        System.out.println("Decenas: " + cifraDecenas);
        System.out.println("Unidades: " + cifraUnidades);
    }
}
