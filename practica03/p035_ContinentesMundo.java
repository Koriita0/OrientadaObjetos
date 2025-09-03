package practica03;

import java.util.Scanner;
public class p035_ContinentesMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 6: ");
        int numero = sc.nextInt();
        String continente;
        switch (numero) {
            case 1:
                continente = "Asia";
                break;
            case 2:
                continente = "África";
                break;
            case 3:
                continente = "América del Norte";
                break;
            case 4:
                continente = "América del Sur";
                break;
            case 5:
                continente = "Antártida";
                break;
            case 6:
                continente = "Europa";
                break;
            default:
                continente = "Error: número fuera de rango.";
        }
        System.out.println(continente);
        sc.close();
    }
}