

public class Aluno {
    private int matricula;
    private String nome;
    private int idade;

    public  Aluno(int m, String n, int i){
        this.matricula = m;
        this.nome = n;
        this.idade = i;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    //O setIdade foi deixado de fora propositadamente pelo teste aplicado.
}
