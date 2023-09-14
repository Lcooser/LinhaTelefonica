package telefonia;
final class Movel extends LinhaTelefonica {
    private boolean planoDeDadosHabilitado;

    public Movel(String numero, boolean planoDeDadosHabilitado) {
        super(numero);
        this.planoDeDadosHabilitado = planoDeDadosHabilitado;
    }

    public float calcular() {
        float custoMinutos = getqtdMinutosGastos() * 0.20f;
        if (planoDeDadosHabilitado) {
            return custoMinutos + 40.00f;
        }
        return custoMinutos;
    }

    @Override
    public String toString() {
        return "Linha Móvel - " + super.toString()  + ", Minutos Gastos: " +  getqtdMinutosGastos() +", Plano de Dados: " + (planoDeDadosHabilitado ? "Habilitado" : "Desabilitado");
    }
}