import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Jogo {

    public static void limparConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void loading(){
        System.out.print(".");
        delay(1);
        System.out.print(".");
        delay(1);
        System.out.print(".");
        delay(1);
    }

    public static void main(String[] args) {
        limparConsole();
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario(10.0);

        Ambiente[] ambientes = {
                new PlanaltoRochoso(),
                new SelvaBioluminescente(),
                new MarDeCristais(),
                new AbismoSombrio(),
                new RuinasAlienigenas()
        };

        int localAtual = 0;

        while (true) {
            Ambiente ambienteAtual = ambientes[localAtual];
            System.out.println("\nVocê está em: " + ambienteAtual.getNome());
            System.out.println(ambienteAtual.getDescricao());

            System.out.println("\nEscolha uma ação:");
            System.out.println("1 > Ir para o próximo ambiente");
            System.out.println("2 > Voltar para o ambiente anterior");
            System.out.println("3 > Explorar o ambiente");
            System.out.println("4 > Ver inventário");
            System.out.println("5 > Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    if (localAtual < ambientes.length - 1) {
                        localAtual++;
                        limparConsole();
                    } else {
                        limparConsole();
                        System.out.println("Você já está no último ambiente!");
                        delay(3);
                        limparConsole();
                    }
                    break;
                case 2:
                    if (localAtual > 0) {
                        localAtual--;
                        limparConsole();
                    } else {
                        limparConsole();
                        System.out.println("Você já está no primeiro ambiente!");
                        delay(3);
                        limparConsole();
                    }
                    break;
                case 3:
                    limparConsole();
                    System.out.print("Explorando");
                    loading();
                    limparConsole();
                    ambienteAtual.explorar();
                    inventario.adicionarItem(new AguaPotavel());
                    break;
                case 4:
                    limparConsole();
                    inventario.listarItens();
                    break;
                case 5:
                    limparConsole();
                    System.out.print("Saindo do jogo");
                    loading();
                    scanner.close();
                    limparConsole();
                    return;
                default:
                    limparConsole();
                    System.out.println("Escolha inválida!");
                    delay(3);
                    limparConsole();
            }
        }
    }
}
