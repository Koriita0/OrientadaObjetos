public class p005_OperacionesMatematicas {
    public static void main(String[] args) {
        double numeroA, numeroB, resultadoSuma, resultadoResta, resultadoMultiplicacion;
        double resultadoDivision, resultadoResiduo, resultadoPotencia;

        numeroA = 10.5;
        numeroB = 2.5;

        resultadoSuma = numeroA + numeroB;
        resultadoResta = numeroA - numeroB;
        resultadoMultiplicacion = numeroA * numeroB;
        resultadoDivision = numeroA / numeroB;
        resultadoResiduo = numeroA % numeroB;
        resultadoPotencia = Math.pow(numeroA, numeroB);

        System.out.println(String.format("Los números son: %.2f, %.2f", numeroA, numeroB));
        System.out.println("\nEl resultado de las operaciones es el siguiente:\n");
        System.out.println(String.format("Suma: %.2f\nResta: %.2f", resultadoSuma, resultadoResta));
        System.out.println(String.format("Multiplicación: %.2f\nDivisión: %.2f", resultadoMultiplicacion, resultadoDivision));
        System.out.println(String.format("Residuo: %.2f\nPotencia: %.2f", resultadoResiduo, resultadoPotencia));
    }
}
