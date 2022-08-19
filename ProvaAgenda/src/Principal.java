import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        // -------Criando Vetor------
        // Contato[] Vetor = new Contato[5];
        int contador = 0;
        // ------Criando Lista em java-----
        List<Contato> Lista;
        Lista = new ArrayList<>();

        do {
            opcao = Principal.menu(entrada);
            int numero = 0;
            String nome = " ";
            String email = " ";
            String telefone = " ";

            switch (opcao) {
                case 0:
                    System.out.println("Adeus!!");
                    break;
                case 1:
                    Principal.AdicionarContato(numero, nome, telefone, email, entrada, Lista);
                    break;
                case 2:
                    Principal.buscarContatoPorNome(contador, nome, entrada, Lista);

                    break;
                case 3:
                    Principal.RemoverContatoPorNome(contador, nome, Lista, entrada);

                    break;
                case 4:
                    Principal.EditarContato(contador, numero, email, telefone, nome, entrada, Lista);
                    break;
                case 5:
                    Principal.ListarAgenda(Lista);
                    break;
                case 6:
                    System.out.println("O número total de contatos são " + Contato.numeroDeContas);
                    break;
                default:
                    System.out.println("Opção invalida, tente outra vez");
                    break;
            }

        } while (opcao != 0);

        entrada.close();

    }

    // ---Criando metodo estatico---
    public static int menu(Scanner entrada) {
        // contador = 0;
        System.out.println("---Menu---");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Buscar contato");
        System.out.println("3 - Remover contato por numero");
        System.out.println("4 - Editar contato");
        System.out.println("5 - Listar agenda");
        System.out.println("6 - Quantidade de cotatos da Agenda");
        System.out.println("0 = Sair");
        System.out.println("Escolha uma opçao");
        int opcao = entrada.nextInt();
        entrada.nextLine();
        return opcao;
    }

    // ----Metodos static---
    public static void AdicionarContato(int numero, String nome, String telefone, String email, Scanner entrada,
            List<Contato> Lista) {
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite um E-mail: ");
        email = entrada.nextLine();
        System.out.println("Digite um telefone: ");
        telefone = entrada.nextLine();
        Contato c = new Contato(numero, nome, email, telefone);
        // -----Adicinando elemento na lista
        Lista.add(c);
        Contato.numeroDeContas++;
        // ---Vetor----
        /*
         * Vetor[contador] = c;
         * contador++;
         */

    }

    public static void buscarContatoPorNome(int contador, String nome, Scanner entrada, List<Contato> Lista) {
        System.out.println("Digite o nome do contato: ");
        nome = entrada.nextLine();

        for (Contato contato : Lista) {
            if (nome.equals(contato.getNome())) {
                System.out.println(contato);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Contato inexistente!");
        }

    }

    public static void RemoverContatoPorNome(int contador, String nome, List<Contato> Lista, Scanner entrada) {
        System.out.println("Digite o nome do contato: ");
        nome = entrada.nextLine();

        for (Contato contato : Lista) {
            if (nome.equals(contato.getNome())) {
                int posicaoLista = Lista.indexOf(contato);
                Lista.remove(posicaoLista);
                contador++;
                System.out.println("Contato removido com sucesso!");
                Contato.numeroDeContas--;
            }

            if (Lista.size() == 0) {
                break;

            }
        }
        

        if (contador == 0) {
            System.out.println("Contato inexistente!");
        }
    }

    public static void EditarContato(int contador, int numero, String email, String telefone, String nome,
            Scanner entrada, List<Contato> Lista) {
        System.out.println("Digite o nome do contato: ");
        nome = entrada.nextLine();

        for (Contato contato : Lista) {
            if (nome.equals(contato.getNome())) {
                int posicaoLista = Lista.indexOf(contato);
                System.out.println("Digite um número: ");
                numero = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Digite seu nome: ");
                nome = entrada.nextLine();
                System.out.println("Digite um E-mail: ");
                email = entrada.nextLine();
                System.out.println("Digite um telefone: ");
                telefone = entrada.nextLine();
                contato = new Contato(numero, nome, email, telefone);
                Lista.set(posicaoLista, contato);
                contador++;
                System.out.println("Contato atualizado com sucesso!");
            }
        }

        if (contador == 0) {
            System.out.println("Contato inexistente!");
        }

    }

    public static void ListarAgenda(List<Contato> Lista) {
        for (Contato contato : Lista) {
            System.out.println(contato);
        }
    }
}