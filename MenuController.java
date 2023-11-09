import java.util.Scanner;

public class MenuController {
  private Scanner scanner;
    

    public MenuController() {
        this.scanner = new Scanner( System.in) ;
    }

    public void selecionarFilme() {
        System.out.println("Selecionar um filme:");
    }

     public void comprarIngesso() {
        System.out.println("Compra de ingresso:");
    }
 public void exibirResultadoFinal() {
        System.out.println("Resultado da compra:");
    }

}
