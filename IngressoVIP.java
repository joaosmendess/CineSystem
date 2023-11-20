public class IngressoVIP extends Ingresso {

    public IngressoVIP(Filme filme, int quantidadeInteira, int quantidadeMeia, String horarioSessao) {
        super(filme, quantidadeInteira, quantidadeMeia, horarioSessao);
    }

    @Override
    public void acessoLanchonete() {
        System.out.println("Lanchonete do cinema liberada");
    }

    @Override
    public void setFilme(Filme filme) {
        if (filme.isfilme3D()) {
            super.setFilme(filme);
        } else {
            System.out.println("Apenas filmes 3D são permitidos para Ingresso VIP.");
        }
    }

} // Verifique se esta chave está fechando a classe corretamente
