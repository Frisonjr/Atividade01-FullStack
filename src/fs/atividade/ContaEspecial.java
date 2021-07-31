package fs.atividade;

public class ContaEspecial extends Conta {
    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    protected boolean temSaldo(Double valor) {
        if (this.limite < valor) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString(){
        return super.toString()+"\nLimite: "+this.getLimite();
    }

    public static ContaEspecial abrirConta(Pessoa cliente, Integer nrConta, Double saldo, Double limite) {
        ContaEspecial conta = new ContaEspecial(cliente, nrConta, saldo, limite);
        return conta;
    }

    public ContaEspecial(Pessoa cliente, Integer nrConta, Double saldo, Double limite) {
        super(cliente, nrConta, saldo);
        this.limite = limite;
    }
}
