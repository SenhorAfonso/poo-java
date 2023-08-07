import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String data_nasc;

    public Pessoa(String nome, int idade, String data_nasc) {
        this.nome = nome;
        this.idade = idade;
        this.data_nasc = data_nasc;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

    public String getDataNasc() {
        return this.data_nasc;
    }

    public void setDataNasc(String newDataNasc) {
        this.data_nasc = newDataNasc;
    }

}
