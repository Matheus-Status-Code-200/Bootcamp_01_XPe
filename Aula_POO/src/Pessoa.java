public class Pessoa {
    public int identificador;
    public  String CPF;
    public String nome;
    public  double altura;
    public double peso;
    public int ano_nascimeno;
    public Pessoa(){
        this.CPF = CPF;
        this.nome = nome;

    }
    public Pessoa(int id){
        identificador = id;
    }

    public Pessoa(int id, String CPF, String nome){
        identificador = id;
        this.CPF = CPF;
        this.nome = nome;
    }

    public Pessoa(int id, String CPF, String nome, double altura, double peso, int ano_nascimeno){
        this.identificador = id;
        this.CPF = CPF;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.ano_nascimeno = ano_nascimeno;

    }

    public String retornaPessoa(){

        if (identificador==0){
            return "\n"+
                    "Nome: "+ this.nome +"\n"+
                    "CPF: "+ this.CPF+"\n"+
                    "Altura: "+ this.altura+"\n"+
                    "Aniversário: "+ this.ano_nascimeno+"\n"+
                    "Peso: "+ this.peso+"\n";
        }return "\n"+"Identificador: "+ this.identificador+"\n"+
                "Nome: "+ this.nome +"\n"+
                "CPF: "+ this.CPF+"\n"+
                "Altura: "+ this.altura+"\n"+
                "Aniversário: "+ this.ano_nascimeno+"\n"+
                "Peso: "+ this.peso+"\n";
    }
}
