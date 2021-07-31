import java.util.Calendar.Builder;
import java.util.GregorianCalendar;

import fs.atividade.ContaPoupanca;
import fs.atividade.ContaEspecial;
import fs.atividade.PessoaFisica;
import fs.atividade.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        Builder builder = new GregorianCalendar.Builder();
        PessoaJuridica pessoa1 = new PessoaJuridica(1,"Jair", "Independencia", 0123456777, "TI");
        PessoaFisica pessoa2 = new PessoaFisica(2,"Junior", "Av Goiás", 1234567890, builder.setDate(1990, 01, 01).build(), "M");

        ContaEspecial conta1 = ContaEspecial.abrirConta(pessoa1, 01, 850.00, 1000.00);
        ContaPoupanca conta2 = ContaPoupanca.abrirConta(pessoa1, 01, 1250.50, 0.07);
        ContaPoupanca conta3 = ContaPoupanca.abrirConta(pessoa2, 02, 1954.99, 0.09);

        System.out.println("\n"+conta1.toString());
        System.out.println("\n"+conta2.toString());
        System.out.println("\n"+conta3.toString());
    }
}