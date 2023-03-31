public class Cinema extends Evento {
    public Cinema(String nome2, String local2, int capacidade2, Ingresso ingresso2) {
        super(nome2, local2, capacidade2, ingresso2);
        //TODO Auto-generated constructor stub
    }

    String cinema, sala, genero;

    @Override
    public void gravar() {
        System.out.println("Você não deveria gravar um filme...");
    }

    @Override
    public String toString() {
        String msg;
        msg = "Filme " + this.nome + "\n";
        msg += "Cinema " + this.cinema + ", sala " + this.sala + "\n";
        msg += "Gênero: " + this.genero + "\n";
        msg += "local: " + this.local + "\n";
        msg += "capacidade da sala: " + this.capacidade + " pessoas";

        return msg;
    }
}
