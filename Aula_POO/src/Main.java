
public class Main {
    public static void main(String[] args) {

        Pessoa vera = new Pessoa();
        vera.nome = "vera";
        vera.CPF = "545-484-484-25";
        System.out.println(vera.retornaPessoa());

        Pessoa Toto = new Pessoa(2023);
        System.out.println(Toto.retornaPessoa());

        Pessoa kih = new Pessoa(2002, "42-458-879-05", "kiara");
        System.out.println(kih.retornaPessoa());

        Pessoa tety = new Pessoa(1985,"001-007-008-20","tety",1.87,86,1985);
        System.out.println(tety.retornaPessoa());

        CasePessoa tety2 = new CasePessoa(0,"001-007-008-20","tety2",1.87,86,1985);
        System.out.println(tety2.retornaPessoaCase());

        CasePessoa vera2 = new CasePessoa();
        vera2.nome = "vera";
        vera2.CPF = "545-484-484-25";
        System.out.println(vera2.retornaPessoaCase());

    }
}