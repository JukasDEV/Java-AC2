public class Ingresso implements pagamento {
    double valor;

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double efetuarPagamento(double valor) {
        double valorComDesconto = valor * 0.42;
        return valorComDesconto;
    }

    @Override
    public String toString() {
        return "Valor do ingresso: " + this.getValor();
    }
}
