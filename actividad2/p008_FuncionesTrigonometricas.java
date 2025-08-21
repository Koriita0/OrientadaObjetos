import java.util.Scanner;

public class p008_FuncionesTrigonometricas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush(); // Limpia la consola

        System.out.print("Dame un ángulo en grados: ");
        double anguloGrados = new Scanner(System.in).nextDouble();

        double anguloRadianes = Math.toRadians(anguloGrados);
        double valorSeno = Math.sin(anguloRadianes);
        double valorCoseno = Math.cos(anguloRadianes);
        double valorTangente = Math.tan(anguloRadianes);

        System.out.println(String.format(
            "Ángulo en radianes: %.2f\nSeno: %.2f\nCoseno: %.2f\nTangente: %.2f",
            anguloRadianes, valorSeno, valorCoseno, valorTangente
        ));
    }
}
