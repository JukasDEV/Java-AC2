public abstract class Evento {
    String nome, local;
    int capacidade;

    public abstract void gravar();

    public boolean verificarCapacidade(int numPessoas){
        if(this.capacidade < numPessoas){
            System.out.println("Passou o limite de capacidade!"); 
            return false;
        }
        System.out.println("Evento com capacidade OK!");
        return true;
        
    }
}
