

public class Venda {
    private int id_venda;
    private Cliente cliente;
    private double valor_venda;

    public Venda(Cliente cli){
        this.setCliente(cli);
    }

    public String imprimeRecibo() {
        return "Dados do comprador: "+"\n"+
                this.cliente.imprimirDados(true)+"\n"+"Id da Venda: "+
                this.getId_venda()+"\n"+
                "Valor da Venda: "+this.getValor_venda()+"\n";
    }

    public int getId_venda() {
        return id_venda;
    }
    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getValor_venda() {
        return valor_venda;
    }
    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }
}
