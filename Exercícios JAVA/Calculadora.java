public class Calculadora {

        static double mult(double a, double b) {
            return a * b;
        }

        static double div(double a, double b) {
            return a / b;
        }

        public static void main(String[] args) {
            double a = 10, b = 5, c;
            b = div(b, a);
            c = mult(a, b);
            System.out.println("Valor de c: " + c);
        }

}
