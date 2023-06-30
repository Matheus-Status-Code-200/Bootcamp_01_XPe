public abstract class Empregado {
    private String nome;
    private String CPF;
    private double salarioFixo;
    private  double valorPrevidencia;
    private double valorBeneficio;

    protected abstract double calculaSalario();

    public Empregado(String nome, String CPF, double salarioFixo){
        this.setNome(nome);
        this.setCPF(CPF);
        this.setSalarioFixo(salarioFixo);
    }
    protected  String imprimirDados(){
        return  "Nome: "+this.getNome()+"\n"+
                "CPF: "+ this.getCPF()+"\n"+
                "Salario Fixo: "+this.getSalarioFixo()+"\n"+
                "Valor previdencia: "+this.getValorBeneficio()+"\n"+
                "Valor Beneficio: "+this.getValorPrevidencia();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getValorPrevidencia() {
        return valorPrevidencia;
    }

    public void setValorPrevidencia(double valorPrevidencia) {
        this.valorPrevidencia = valorPrevidencia;
    }

    public double getValorBeneficio() {
        return valorBeneficio;
    }

    public void setValorBeneficio(double valorBeneficio) {
        this.valorBeneficio = valorBeneficio;
    }
}
