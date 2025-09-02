import java.io.Console;
import java.util.Scanner;

public class p023_ConvertirTemperatura {
    public static void main(String[] args) {
        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Convertir de grados celcius a farenheit y viceversa\n");
        System.out.println("[F]arenheit a Centigrados");
        System.out.println("[C]entigrados a Farenheit ");
        System.out.print("Elije una opcion ? ");
        op = obj.next().charAt(0);
        op = Character.toUpperCase(op);
        if (op == 'F') {
            System.out.println("\nConvertir de Farenheit a Centigrados\n");
            System.out.print("Dame los grados Farenheit ? ");
            temp = obj.nextFloat();
            res = (temp - 32) * 5 / 9;
            System.out.printf("%.2f Farenheit, equivale a %.2f Centigrados", temp, res);
        } else {
            System.out.println("\nConvertir de Centigrados a Farenheit\n");
            System.out.print("Dame los grados Centigrados ? ");
            temp = obj.nextFloat();
            res = (temp * 9 / 5) + 32;
            System.out.printf("%.2f Centigrados, equivale a %.2f Farenheit", temp, res);
            ;
        }
        System.out.println("\nGracias por utilizar este programa");
    }
}