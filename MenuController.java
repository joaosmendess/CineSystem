import java.util.Scanner;
import java.util.ArrayList;
public class MenuController {
  private Scanner scanner;
    

    public MenuController() {
        this.scanner = new Scanner( System.in) ;
    }

    public int selecionarFilme(ArrayList<Filme> filmes) {
        System.out.println("Selecionar um filme:");
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println((i+1) + "." +filmes.get(i).getNome());
            
        }
        System.out.println((filmes.size() + 1) + ". Sair");
        System.out.print("Escolha: ");
        int escolha = scanner.nextInt();
        if (escolha <= filmes.size() && escolha > 0) {
            return escolha - 1; // Retorna o índice do filme selecionado
        } else {
            return -1; // Se escolher sair, retorna -1
        }
    }

     public void comprarIngesso() {
        System.out.println("Compra de ingresso:");
    }
 public void exibirResultadoFinal() {
        System.out.println("Resultado da compra:");
    }

}
