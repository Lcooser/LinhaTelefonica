package telefonia;

class Fixa extends LinhaTelefonica {
    public static final int FRANQUIA = 30;
    private int minutosExcedentes;

    public Fixa(String numero, int minutosExcedentes) {
        super(numero);
        this.minutosExcedentes = minutosExcedentes;
    }

    public float calcular() {
        int minutosGastos = FRANQUIA + minutosExcedentes;
        if (minutosGastos > FRANQUIA) {
            return 45.00f + (minutosExcedentes * 0.05f);
        } else {
            return 45.00f;
        }
    }

    @Override
    public String toString() {
        return "Linha Fixa - " + super.toString() + ", Minutos Franquia: " + FRANQUIA + ", Minutos Excedentes: " + minutosExcedentes + ", Minutos Totais: " +  minutosExcedentes + FRANQUIA;
    }
}