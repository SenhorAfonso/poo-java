public class Aluno extends Pessoa{

    private String RA;

    public Aluno(String nome, int idade, String RA, String data_nasc) {
        super(nome, idade, data_nasc);
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

}
