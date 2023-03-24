public class Filme extends Evento {
    String cinema, genero;
    int sala;

    @Override
    public void gravar(){
        System.out.println( "Gravando na sala " + this.sala);
    }

    @Override
    public String toString(){
        String eventoInfo = "Nome: " + this.nome + ", Local: " + this.local + ", Capacidade: " + this.capacidade + "\n";

        String cinemaInfo = "Cinema: " + this.cinema + "\nSala: " + this.sala + "\nGenero: " + this.genero;

        return eventoInfo + cinemaInfo;
    }
}
