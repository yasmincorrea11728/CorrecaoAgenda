 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {        
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        //Contato[] Vetor = new Contato[10];
        int contador = 0;
        List<Contato> lista = new ArrayList<>();
    do{
        contador = 0;
        System.out.println("---Menu Inicial---");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Buscar contato");
        System.out.println("3 - Remover contato");
        System.out.println("4 - Editar contato");
        System.out.println("5- Listar Agenda");
        System.out.println("0 = Sair");
        System.out.println("Escolha uma opçao");
        opcao = entrada.nextInt();
        entrada.nextLine();
        int numero = 0;
        String nome = " ";
        String email = " ";
        String telefone = " ";

        switch (opcao) {
            case 0:
                System.out.println("Adeus!!!");              
                break;       
            case 1:
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Digite um nome: ");
            nome = entrada.nextLine();
            System.out.println("Digite um E-mail: ");
            email = entrada.nextLine();
            System.out.println("Digite um telefone: ");
            telefone = entrada.nextLine();
            Contato c = new Contato(numero, nome, email, telefone);
            System.out.println("Contato adicionado com sucesso!!!");
           
           lista.add(c);
            /*Vetor[contador] = c;
            contador++;*/

                break;
            case 2:
            System.out.println("Digite o nome do contato: ");
            nome = entrada.nextLine();
            for (Contato contato: lista) {
                if(nome.equals(contato.getNome())){
                    System.out.println(contato);
                    contador++;
                }

            }

            if(contador == 0){
                System.out.println("Contato inexistente");
            }
            
                break;
            case 3:
            System.out.println("Digite o nome do contato: ");
            nome = entrada.nextLine();
            for (Contato contato: lista) {
                if(nome.equals(contato.getNome())){
                 int posicaoLista = lista.indexOf(contato);
                 lista.remove(posicaoLista);
                    contador++;
                    System.out.println("Contato removido com sucesso!!!");
                }

                if(lista.size() == 0){
                    break;
                }
            }

            if(contador == 0){
                System.out.println("Contato inexistente");
            }
            
                break;
            case 4:
            System.out.println("Digite o nome do contato: ");
            nome = entrada.nextLine();
            for (Contato contato: lista) {
                if(nome.equals(contato.getNome())){
                    int posicaoLista = lista.indexOf(contato);
                    System.out.println("Digite um número: ");
                     numero = entrada.nextInt();
                     entrada.nextLine();
                     System.out.println("Digite um nome: ");
                     nome = entrada.nextLine();
                     System.out.println("Digite um E-mail: ");
                     email = entrada.nextLine();
                     System.out.println("Digite um telefone: ");
                     telefone = entrada.nextLine();
                     contato = new Contato(numero, nome, email, telefone);
                     lista.set(posicaoLista, contato);
                    contador++;
                    System.out.println("Contato atualizado com sucesso!!!!");
                }
            }

            if(contador == 0){
                System.out.println("Contato inexistente");
            }

                break;

                case 5:
                for (Contato contato : lista) {
                    System.out.println(contato);    
                }
                break;

            default:
                System.out.println("Opção invalida, tente outra vez");
                break;
        }


    }while(opcao !=0);

    entrada.close();

   }
   
}