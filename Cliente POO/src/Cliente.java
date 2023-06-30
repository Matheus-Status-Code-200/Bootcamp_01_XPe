

public class Cliente {

    private  int id_cliente;
    private String nome;
    private  double limite_compras;

    public Cliente(int id, String nome, double limite){
        this.id_cliente = id;
        this.nome = nome;
        this.limite_compras = limite;
    }

    public String imprimirDados(boolean exibir_limite){
        String montaLimite = "";
        if(exibir_limite)
            montaLimite = "Limite de comras: "+ this.getLimite_compras();
        return "Identificador: "+ this.getId_cliente()+"\n"+
                "Nome: "+ this.getNome()+'\n'+
                montaLimite;
    }

    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getLimite_compras() {
        return limite_compras;
    }
}
