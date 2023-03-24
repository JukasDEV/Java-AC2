public class Teatro extends Evento {
    @Override
    public void gravar(){
        System.out.println("Gravando em " + this.local);
    }


    @Override
    public String toString(){
        String eventoInfo = "Nome: " + this.nome + ", Local: " + this.local + ", Capacidade: " + this.capacidade + "\n";

        String teatroInfo = "Local: " + this.local;

        return eventoInfo + teatroInfo;
    }

}
