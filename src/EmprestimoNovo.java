public class EmprestimoNovo {

    public static void pedirEmprestimo(int parcelas, double valorEmprestimo) {

        double juro;
        switch (parcelas) {
            case 1:
                juro = 0.1;
                calcularEmprestimo(juro, valorEmprestimo);
                break;
            case 2:
                juro = 0.2;
                calcularEmprestimo(juro, valorEmprestimo);
                break;
            case 3:
                juro = 0.3;
                calcularEmprestimo(juro, valorEmprestimo);
                break;
            case 4:
                juro = 0.4;
                calcularEmprestimo(juro, valorEmprestimo);
                break;
            case 5:
                juro = 0.5;
                calcularEmprestimo(juro, valorEmprestimo);
                break;
            default:
                MensagemTela.mensagemErro();
        }
    }

    public static void calcularEmprestimo(double juro, double valorEmprestimo) {
        double total = juro * valorEmprestimo;

        total = total + valorEmprestimo;
        System.out.println("Valor de juros " + juro);
        MensagemTela.parcelasEmprestimo(total);

    }
}
