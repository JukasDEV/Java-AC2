public class IngressoVIP extends Ingresso implements pagamento {
    double valorAdicional;

    public double getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double calcularValor() {
        return this.valor + this.valorAdicional;
    }

    @Override
    public double efetuarPagamento(double valor) {
        double valorComDesconto = calcularValor() * 0.58;
        return valorComDesconto;
    }

    @Override
    public String toString() {
        return "Valor do ingresso VIP: " + this.calcularValor();
    }
}
