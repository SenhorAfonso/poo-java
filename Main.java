// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("felipinho", 21, "2oasd-@asd", "09/21/1223");
        Professor professor = new Professor("Jaiminho", 37, "9dsa0@jdas", "02/04/1992");

        System.out.printf("O seu nome é %s e você tem %d anos. Seu RA é %s!\n", aluno.getNome(), aluno.getIdade(), aluno.getRA());
        System.out.printf("O nome do seu professor é %s, ele tem %d anos de idade e sua matrícula é %s", professor.getNome(), professor.getIdade(), professor.getMatricula());

    }
}