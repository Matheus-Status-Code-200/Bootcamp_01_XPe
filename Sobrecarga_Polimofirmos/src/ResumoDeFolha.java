import java.util.ArrayList;

public class ResumoDeFolha {
    private double totalFolha;
    private double totalHoras;
    private double totalVendas;
    private ArrayList<Empregado> empregados = new ArrayList();

    public  void  addEmpregado(Horista empregado){
        this.empregados.add(empregado);
        this.totalFolha += empregado.calculaSalario();
        this.totalHoras += empregado.getQtHoras();
    }

    public void addEmpregado(Comissionado empregado){
        this.empregados.add(empregado);
        this.totalFolha += empregado.calculaSalario();
        this.totalVendas += empregado.getTotaldeVendas();
    }

    public String imprimirResumo(){
        String retorno = "";

        for(Empregado emp: empregados)
            retorno += emp.imprimirDados()+"\n";
        retorno += "**************RESUMO****************"+"\n\n"+
                    "TOTAL VENDAS: "+ this.getTotalVendas()+"\n"+
                    "TOTAL HORAS: "+this.getTotalHoras()+"\n"+
                    "TOTAL FOLHA: "+ this.getTotalFolha()+"\n";
        return retorno;
    }


    public double getTotalFolha() {
        return totalFolha;
    }
    public double getTotalHoras() {
        return totalHoras;
    }
    public double getTotalVendas() {
        return totalVendas;
    }
    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }


}
