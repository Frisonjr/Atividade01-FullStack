package fs.atividade;

import java.util.Calendar;

public class PessoaFisica extends Pessoa {
    private Integer cpf;
    private Calendar dtNascimento;
    private String genero;

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getCpf() {
        return cpf;
    }

    public Calendar getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Calendar dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getIdade() {
        Long idade = System.currentTimeMillis() - this.dtNascimento.getTimeInMillis();
        return idade/31556952000l;
    }

    public String toString() {
        return super.toString() + "\nCPF: " + this.getCpf() + "\nIdade: " + this.getIdade() + "\nGenero: "
                + this.getGenero();
    }

    public PessoaFisica(Integer id, String nome, String endereco, Integer cpf, Calendar dtNascimento, String genero) {
        super(id, nome, endereco);
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.genero = genero;
    }
}
