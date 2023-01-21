public class MensagemTela {

    public static void menuIniciar() {
        System.out.println("Olá, Seja ao sistema empressarial de serviços");
        System.out.println("Você consegue fazer seguintes operações no sistema: ");
        System.out.println("*******************************");
        System.out.println("| [1] Calcular Valores        |");
        System.out.println("| [2] Mensagem baseada na hora|");
        System.out.println("| [3] Fazer Emprestimo        |");
        System.out.println("| [0] Finalizar Serviço       |");
        System.out.println("*******************************");
        System.out.println("Escolha uma Opção");

    }

    public static void operacoes() {

        System.out.println("Esscolha uma Operação a abaixo: ");
        System.out.println("*******************************");
        System.out.println("| [1] Soma                    |");
        System.out.println("| [2] Subitração              |");
        System.out.println("| [3] Divição                 |");
        System.out.println("| [4] Multiplicação           |");
        System.out.println("| [0 Sair]                    |");
        System.out.println("*******************************");
    }

    public static void invalida() {
        mensagemErro();
        espacoLinha();
        System.out.println("*********** OPÇÕES ************");
        System.out.println("| [1] Calcular Valores        |");
        System.out.println("| [2] Mensagem baseada na hora|");
        System.out.println("| [3] Fazer Emprestimo        |");
        System.out.println("| [0] Finalizar Serviço       |");
        System.out.println("*******************************");

        System.out.println("Escolha uma Opção");
    }

    public static void mensagemEmptrestimo() {

        System.out.print("Você está no modo de EMPRTESTIMO\n");
        System.out.println("Você pode, parcelar de \nAté 5 vezes");
        System.out.println("De quantas vezes?");
    }

    public static void continuarEmprestimo() {
        espacoLinha();
        System.out.println("*********** OPÇÕES ************");
        System.out.println("| [1] Para de 1 Vez 10%       |");
        System.out.println("| [2] Para de 2 Vez 20%       |");
        System.out.println("| [3] Para de 3 Vez 30%       |");
        System.out.println("| [4] Para de 4 Vez 40%       |");
        System.out.println("| [5] Para de 5 Vez 50%       |");
        System.out.println("| [0] Sair                    |");
        System.out.println("*******************************");
    }

    public static void mensagemCalculadora() {
        espacoLinha();
        System.out.println("Você, está no modo de CAUCULADORA");
        System.out.println("Digite um valor");
    }

    public static void horaDia() {
        espacoLinha();
        System.out.println("Modo Mensagem do Dia !!!");
        System.out.println("Informe uma hora com o valor de 0 à 24");
    }

    public static void parcelasEmprestimo(double porcentagem) {
        System.out.println("O valor do seu emprerstimo é: " + porcentagem);
    }

    public static void valorEmprestimo() {
        System.out.println("Qaunto você deseja emprestar?");
    }

    public static void mensagemErro() {
        espacoLinha();
        System.out.println("Opção Invalida");
        espacoLinha();
    }

    public static void espacoLinha() {
        System.out.println("    \n");
        System.out.println("    \n");
    }

}
