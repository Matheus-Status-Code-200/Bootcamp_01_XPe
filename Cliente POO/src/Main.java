

public class Main {

    public static void main(String[] args) {
        Aluno al1 = new Aluno(1, "Joaquim Silva",29);
        Aluno al2 = new Aluno(2, "Ana Cristina", 17);

        System.out.println("aluno2: "+al2.getNome()+"- Matricula: "+al2.getMatricula()+"  - Idade: "+al2.getIdade());
        System.out.println("aluno1: "+al1.getNome()+"- Matricula: "+al1.getMatricula()+"  - Idade: "+al1.getIdade());
        System.out.println("Média das idades dos aluno: "+((al2.getIdade()+al1.getIdade())/2));
    }
}