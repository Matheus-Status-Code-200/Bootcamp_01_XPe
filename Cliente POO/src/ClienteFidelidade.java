

public class ClienteFidelidade extends Cliente{

    private int pontos;
    public ClienteFidelidade(int id, String nome, double limite){
        super(id,nome, limite*2);
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String imprimirDados(boolean exibir_limite) {
        return super.imprimirDados(exibir_limite)+'\n'+
                "Total de Pontos: "+ this.getPontos()+'\n'+
                this.premioDirponivel();
    }

    private String premioDirponivel(){
        if(this.getPontos()>= 0 && this.getPontos()<1000)
            return "Você ainda não tem direito a prêmios.";
        else if (this.getPontos()>=1000 && this.getPontos()<=10000)
            return "Você tem direito a um desconto de 10% em sua próxima compra.";
        else
            return "Você tem direito a prêmios. Consulte o catãlogo";
    }
}
