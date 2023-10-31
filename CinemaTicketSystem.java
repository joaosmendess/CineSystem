import java.util.ArrayList;
import java.util.Scanner;

public class CinemaTicketSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> filmes = new ArrayList<>();

        // Adicionando lista de filmes
        filmes.add("Matrix");
        filmes.add("Star Wars ");
        filmes.add("O Senhor dos Anéis");

        while (true) {
            System.out.println("Selecione um filme");
            for (int i =0; i < filmes.size() ; i++) {
System.out.println((i +1) + "." + filmes.get(i));
            }
            
            System.out.println((filmes.size() + 1 ) + ".Sair");
            
            int escolhaFilme = scanner.nextInt();

            if (escolhaFilme==filmes.size() +1 ) {
                break;
            }

            System.out.println("Selecione a sessão: 1. 14:00  2. 17:00  3. 20:00");
            int sessao = scanner.nextInt();

            System.out.println("Quantos ingressos inteiros?");
            int ingressosInteiros = scanner.nextInt();

            System.out.println("Quantos ingressos meia?");
            int ingressosMeia = scanner.nextInt();

            double total = ingressosInteiros * 32 + ingressosMeia * 16;
            System.out.println("Total a pagar: R$ " + total);
        }
        scanner.close();
    }
}