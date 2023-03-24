public class Show extends Evento {
    String artista;

    @Override
    public void gravar(){
        System.out.println("Gravando com " + this.artista);

    }

    @Override
    public String toString(){
        String eventoInfo = "Nome: " + this.nome + ", Local: " + this.local + ", Capacidade: " + this.capacidade + "\n";

        String showInfo = "Artista: " + this.artista;

        return eventoInfo + showInfo;
    }
}