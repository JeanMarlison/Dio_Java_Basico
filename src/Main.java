import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int opcao = 1;
        while (opcao != 0) {
            Scanner scan = new Scanner(System.in);
            MensagemTela.menuIniciar();
            opcao = scan.nextInt();

            if (opcao == 1) {

                int operacao;
                do {
                    MensagemTela.mensagemCalculadora();
                    int valor01 = scan.nextInt();
                    System.out.println("Digite outro valor");
                    int valor02 = scan.nextInt();

                    MensagemTela.operacoes();
                    operacao = scan.nextInt();
                    if (operacao == 1) {
                        Calculdadora.soma(valor01, valor02);
                    } else if (operacao == 2) {
                        Calculdadora.sobitracao(valor01, valor02);
                    } else if (operacao == 3) {
                        Calculdadora.divicao(valor01, valor02);
                    } else if (operacao == 4) {
                        Calculdadora.multiplicacao(valor01, valor02);
                    } else {
                        MensagemTela.mensagemErro();
                    }
                } while (operacao != 0);

            } else if (opcao == 2) {
                MensagemTela.horaDia();
                int harario = scan.nextInt();
                Mensagem.mensagemHora(harario);

            } else if (opcao == 3) {
                MensagemTela.mensagemEmptrestimo();

                MensagemTela.continuarEmprestimo();

                int parcelas = scan.nextInt();

                MensagemTela.valorEmprestimo();

                double valorEmpretado = scan.nextInt();

                EmprestimoNovo.pedirEmprestimo(parcelas, valorEmpretado);

            } else if (opcao == 0) {
                System.out.println("O progorma está sendo encerrado!!!");
            } else {
                MensagemTela.mensagemErro();
            }
        }

    }
}
