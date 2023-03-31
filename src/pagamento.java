public interface pagamento {
    double efetuarPagamento(double valor);
}

 class Pagamentoimp implements pagamento {
    public double efetuarPagamento(double valor) {
        double valorComDesconto = valor * 0.58;
        return valorComDesconto;
    }
}
