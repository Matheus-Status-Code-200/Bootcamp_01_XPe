public class Comissionado extends  Empregado{

    public double getTotaldeVendas() {
        return totaldeVendas;
    }

    public void setTotaldeVendas(double totaldeVendas) {
        this.totaldeVendas = totaldeVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    private  double totaldeVendas;
    private double percentualComissao;

    public  Comissionado(String nome, String CPF, double salarioFixo, double totaldeVendas, double percentualComissao){
        super(nome, CPF, salarioFixo);
        this.setTotaldeVendas(totaldeVendas);
        this.setPercentualComissao(percentualComissao);

    }
    protected double calculaSalario() {
        return (this.getSalarioFixo() + this.getValorBeneficio() +
                ((this.getTotaldeVendas() * this.getPercentualComissao()) - this.getValorPrevidencia()));
    }
    public  String imprimirDados(){
        return super.imprimirDados()+"\n"+
                "Total de Vendas: "+this.getTotaldeVendas()+"\n"+
                "Percentual de Comissão: "+ this.getPercentualComissao()+"\n"+
                "Valor a Receber: "+this.calculaSalario()+"\n";
    }
}
