public class Filme {
    private String nome;
    private String diretor;
    private String descricao ;
    private String genero;
    private double duracao ;
    private boolean filme3D;


    public Filme(String nome, String diretor, String descricao, String genero, double duracao, boolean filme3D) {
        this.nome=nome;
        this.diretor= diretor;
        this.descricao= descricao;
        this.genero= genero;
        this.duracao= duracao;
        this.filme3D = filme3D;


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

    public boolean isfilme3D() {
        return filme3D;
    }

    public void setFilme3D () {
        this.filme3D = filme3D;
    }
}
