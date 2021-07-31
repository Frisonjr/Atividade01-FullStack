package fs.atividade;

public class ContaPoupanca extends Conta {
    private Double txCorrecao;

    public Double getTxCorrecao() {
        return txCorrecao;
    }

    public void setTxCorrecao(Double txCorrecao) {
        this.txCorrecao = txCorrecao;
    }

    public void atualizaSaldoRendimento() {
        this.deposita(this.getSaldo() * this.getTxCorrecao());
    }
    @Override
    public String toString(){
        return super.toString()+"\ntxCorrecao: "+this.getTxCorrecao();
    }
    public static ContaPoupanca abrirConta(Pessoa cliente, Integer nrConta, Double saldo, Double txCorrecao) {
        ContaPoupanca conta = new ContaPoupanca(cliente, nrConta, saldo, txCorrecao);
        return conta;
    }

    public ContaPoupanca(Pessoa cliente, Integer nrConta, Double saldo, Double txCorrecao) {
        super(cliente, nrConta, saldo);
        this.txCorrecao = txCorrecao;
    }
}
