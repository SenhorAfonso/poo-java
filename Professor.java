public class Professor extends Pessoa {

    private String matricula;

    public Professor(String nome, int idade, String matricula, String data_nasc) {
        super(nome, idade, data_nasc);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String newMatricula) {
        this.matricula = newMatricula;
    }

}
