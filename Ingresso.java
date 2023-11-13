public class Ingresso {
    private Filme filme;
    private int quantidadeInteira;    
    private int quantidadeMeia;                                                                                                  
    private String horarioSessao;


    public Ingresso (Filme filme, int quantidadeInteira, int quantidadeMeia, String horarioSessao) {
        this.filme = filme;
        this.horarioSessao = horarioSessao;
        this.quantidadeInteira= quantidadeInteira;
        this.quantidadeMeia= quantidadeMeia;


    }

    // Getters e Setters

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getQuantidadeInteira() {
        return quantidadeInteira;
    }

    public void setQuantidadeInteira(int quantidadeInteira) {
        this.quantidadeMeia = quantidadeInteira;
    }

    public int getQuantidadeMeia() {
        return quantidadeMeia;
    }

    public void setQuantidadeMeia(int quantidadeMeia) {
        this.quantidadeMeia = quantidadeMeia;
    }

    public String getHorarioSessao() {
        return horarioSessao;
    }

    public void setHorarioSessao(String horarioSessao) {
        this.horarioSessao = horarioSessao;
    }
    
}
