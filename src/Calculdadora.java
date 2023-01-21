public class Calculdadora {

    public static void soma(double valor1, double valor2) {

        double resultado = valor1 + valor2;

        System.out.print("Resultado: ");
        System.out.println(valor1 + " + " + valor2 + " = " + resultado);
    }

    public static void sobitracao(double valor1, double valor2) {

        double resultado = valor1 - valor2;

        System.out.print("Resultado: ");
        System.out.println(valor1 + " - " + valor2 + " = " + resultado);
    }

    public static void multiplicacao(double valor1, double valor2) {

        double resultado = valor1 * valor2;

        System.out.print("Resultado: ");
        System.out.println(valor1 + " * " + valor2 + " = " + resultado);
    }

    public static void divicao(double valor1, double valor2) {

        double resultado = valor1 / valor2;

        System.out.print("Resultado: ");
        System.out.println(valor1 + " / " + valor2 + " = " + resultado);
    }
}
