public class Professor extends Pessoa {

    private String matricula;

    public Professor(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String newMatricula) {
        this.matricula = newMatricula;
    }

}
