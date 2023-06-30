public class Horista extends Empregado{


    private double qtHoras;
    private double valorHora;

    public Horista (String nome, String CPF, double salarioFixo, double qtHoras, double valorHora){
       super(nome, CPF, salarioFixo);
        this.setQtHoras(qtHoras);
        this.setValorHora(valorHora);
    }

    protected double calculaSalario() {
        return (this.getSalarioFixo() + this.getValorBeneficio() +
                (this.getQtHoras() * this.getValorHora())) - this.getValorPrevidencia();
    }

    public  String imprimirDados(){
        return super.imprimirDados()+"\n"+
                "Qunatidade de Horas: "+this.getQtHoras()+"\n"+
                "Valor Hora: "+this.getValorHora()+"\n"+
                "Valor a Receber: "+this.calculaSalario()+"\n";
    }
    public double getQtHoras() {
        return qtHoras;
    }

    public void setQtHoras(double qtHoras) {
        this.qtHoras = qtHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHhora) {
        this.valorHora = valorHhora;
    }
}
