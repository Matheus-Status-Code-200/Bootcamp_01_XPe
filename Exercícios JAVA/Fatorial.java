public class Fatorial {
    static double fatorial(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Para o caçculo do fatorial não é permitido números negativos.");
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }

    public static void main(String[] args) {
        double num = -5;
        System.out.println("Fatorial: " + fatorial(num));
    }
}
