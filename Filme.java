public class Filme {
    private String nome;
    private String diretor;
    private String descricao ;
    private String genero;
    private double duracao ;


    public Filme(String nome, String diretor, String descricao, String genero, double duracao) {
        this.nome=nome;
        this.diretor= diretor;
        this.descricao= descricao;
        this.genero= genero;
        this.duracao= duracao;


    }


    // Métodos getters e setters

    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome=nome;
    }


     public String getDiretor() {
        return diretor;

    }
    public void setDiretor(String diretor) {
        this.diretor=diretor;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
