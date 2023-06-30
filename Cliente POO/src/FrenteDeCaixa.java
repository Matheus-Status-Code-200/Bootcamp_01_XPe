

public class FrenteDeCaixa {

    public static void main(String[] args){

        Cliente cli01 = new Cliente(1000, "Carlos Carvalho", 7000);
        Venda venda = new Venda(cli01);
        venda.setId_venda(1);
        venda.setValor_venda(3000);
        System.out.println(venda.imprimeRecibo());

        ClienteFidelidade clifi01 = new ClienteFidelidade(777, "Carla Teixeira", 17000);
        Venda venda2 = new Venda(clifi01);
        venda2.setId_venda(2);
        venda2.setValor_venda(3000);
        clifi01.setPontos(50000);
        System.out.println(venda2.imprimeRecibo());
    }
}
