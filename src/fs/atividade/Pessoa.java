package fs.atividade;

public class Pessoa {
    private Integer id;
    private String nome;
    private String endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return "ID: "+this.getId()+"\nNome: "+this.getNome()+"\nEndereco: "+this.getEndereco();
    }

    public Pessoa(Integer id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
}
