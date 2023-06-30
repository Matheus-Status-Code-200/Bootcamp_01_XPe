

import java.util.Scanner;
public class EstruturasdeDecisao {
    public static void main(String[] args) {
        int num1, num2;
        double div = 0;
        boolean ok = false;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro maior que 100 (ex: 150).");
        num1 = Entrada.nextInt();
        System.out.println("Digite um número inteiro menor que 10 (ex:6)");
        num2 = Entrada.nextInt();
        if ((num1 > 100) || (num2 < 10)) {
            System.out.println("Muito bem, valores válidos.");
            ok = true;
            div = num1 / num2;
        } else if (((num1 < 100) && (num2 < 10)) || ((num1 > 100) && (num2 > 10))) {
            System.out.println("Algum dos números está fora do limite");
        } else {
            System.out.println("Você não respeita as regras");
        }
        if (ok = true) {
            System.out.println("o valor da divisão é: " + div);
        }
    }
}