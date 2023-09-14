package telefonia;
abstract class LinhaTelefonica implements Consumo {
    private int qtdMinutosGastos;
    private String numero;
    private Cliente cliente;

    public LinhaTelefonica(String numero) {
        this.numero = numero;
        this.qtdMinutosGastos = 0;
    }

    public void setqtdMinutosGastos(int qtdMinutosGastos) {
        if (qtdMinutosGastos >= 0) {
            this.qtdMinutosGastos = qtdMinutosGastos;
        } else {
            System.out.println("Quantidade de minutos inválida.");
        }
    }

    public int getqtdMinutosGastos() {
        return qtdMinutosGastos;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Número: " + numero ;
    }
}