package fs.atividade;

public class Conta {
    private Pessoa cliente;
    private Double saldo;
    private Integer nrConta;

    public static Conta abrirConta(Pessoa cliente, Integer nrConta, Double saldo) {
        var conta = new Conta(cliente, nrConta, saldo);
        return conta;
    }
    
    protected Conta(Pessoa cliente, Integer nrConta, Double saldo) {
        this.cliente = cliente;
        this.nrConta = nrConta;
        this.saldo = saldo;
    }

    public String toString(){
        return cliente.toString()+"\nnrConta: "+this.getNrConta()+"\nSaldo: "+this.getSaldo();
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public Integer getNrConta() {
        return nrConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public void sacar(Double valor) {
        if (this.temSaldo(valor)) {
            this.saldo -= valor;
        } else {
            throw new RuntimeException("Saldo  insuficiente");
        }
    }

    protected boolean temSaldo(Double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            return true;
        }
    }

    public void deposita(Double valor) {
        this.saldo += valor;
    }

    public void transferir(Conta destino, Double valor) {
        if (this.saldo < valor) {
            throw new RuntimeException("Saldo  insuficiente");
        }
        else{
            this.saldo -= valor;
            destino.deposita(valor);
        }
    }

}
