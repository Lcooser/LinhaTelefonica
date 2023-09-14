package telefonia;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String endereco;
    private List<LinhaTelefonica> linhasTelefonicas;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.linhasTelefonicas = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void adicionarLinhaTelefonica(LinhaTelefonica linha) {
        linhasTelefonicas.add(linha);
        linha.setCliente(this);
    }

    public List<LinhaTelefonica> getLinhasTelefonicas() {
        return linhasTelefonicas;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", Endereço: " + endereco;
    }
}