import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuController menuController = new MenuController();

        // Criação de filmes

        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme("Matrix", "Lana Wachowski", "Um hacker descobre uma realidade alternativa", "Ficção Científica", 136));
        filmes.add(new Filme("Star Wars", "George Lucas", "Aventuras em uma galáxia muito distante", "Ficção Científica", 121));
        filmes.add(new Filme("O Senhor dos Anéis", "Peter Jackson", "Uma jornada épica em um mundo de fantasia", "Fantasia", 178));

     // Lógica do menu principal

     boolean rodando = true;
     
     while (rodando) {
        // Usando MenuController para mostrar as opções do menu
        int escolhaFilmeIndex = menuController.selecionarFilme(filmes);

        if (escolhaFilmeIndex != -1) {
            Filme filmeEscolhido = filmes.get(escolhaFilmeIndex);
            String sessao = menuController.selecionarSessao();
            if (sessao != null ) {
                Ingresso ingresso = menuController.comprarIngesso(filmeEscolhido, sessao);
                menuController.exibirResultadoFinal(ingresso);
                
            }else {
                System.out.println("Sessão inválida");
            }

            
        }
        else{
            rodando = false;
             System.out.println("Você saiu"); // O usúario escolheu sair 
        }
     }
     scanner.close();
      }
}




