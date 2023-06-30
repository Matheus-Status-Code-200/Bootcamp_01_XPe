// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ResumoDeFolha resumo = new ResumoDeFolha();
        Horista emp = new Horista("Joaquim Borges","001-002-003-15",0,40,220);
        emp.setValorBeneficio(800);
        emp.setValorPrevidencia(450);
        resumo.addEmpregado(emp);


        emp = new Horista("Ana Silva","785-002-003-15",1500,37,220);
        emp.setValorBeneficio(800);
        emp.setValorPrevidencia(450);
        resumo.addEmpregado(emp);

        Comissionado emp2 = new Comissionado("Alex CC.","154.875.994-25",0,85000,0.04);
        emp2.setValorBeneficio(800);
        emp2.setValorPrevidencia(500);
        resumo.addEmpregado(emp2);

        emp2 = new Comissionado("Paulo CC.","78.875.994-25",0,190000,0.037);
        emp2.setValorBeneficio(800);
        emp2.setValorPrevidencia(500);
        resumo.addEmpregado(emp2);

        System.out.println(resumo.imprimirResumo());
    }
}