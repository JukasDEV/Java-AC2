public abstract class Evento {
    String nome;
    String local;
    int capacidade;
    Ingresso ingresso;

    public Evento(String nome2, String local2, int capacidade2, Ingresso ingresso2) {
    }

    public abstract void gravar();

    public double calcularReceita() {
        return this.capacidade * this.ingresso.getValor();
    }
    
    // Evento (S)

    public boolean verificarCapacidade(int numPessoas) {
        if (numPessoas <= this.capacidade) {
            return true;
        }
        return false;
    }
}