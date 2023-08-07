public class Aluno extends Pessoa{

    private String RA;

    public Aluno(String nome, int idade, String RA) {
        super(nome, idade);
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

}
