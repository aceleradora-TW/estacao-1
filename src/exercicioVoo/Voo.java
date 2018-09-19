package exercicioVoo;

public class Voo {

    private String origem;
    private String destino;
    private String equipamento;
    private int duracao;

    public Voo(String origem, String destino, String equipamento, int duracao) {
        this.origem = origem;
        this.destino = destino;
        this.equipamento = equipamento;
        this.duracao = duracao;
    }

    public String getOrigem() {
        return this.origem;
    }

    public String getDestino() {
        return this.destino;
    }

    public String getEquipamento() {
        return this.equipamento;
    }

}
