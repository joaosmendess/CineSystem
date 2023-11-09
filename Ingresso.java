public class Ingresso {
    private Filme filme;
    private String tipoIngresso;
    private String horarioSessao;


    public Ingresso (Filme filme, String tipoIngresso, String horarioSessao) {
        this.filme = filme;
        this.horarioSessao = horarioSessao;
        this.tipoIngresso= tipoIngresso;

    }

    // Getters e Setters

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public String getHorarioSessao() {
        return horarioSessao;
    }

    public void setHorarioSessao(String horarioSessao) {
        this.horarioSessao = horarioSessao;
    }
    
}
