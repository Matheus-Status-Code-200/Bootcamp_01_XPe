import java.util.Arrays;
public class ArrySort {
        public static void main(String[] args) {
            int[] Numeros = {2, 4, 3, 6, 1, 7};

            System.out.println("Array antes da ordenação: " + Arrays.toString(Numeros));

            Arrays.sort(Numeros);

            System.out.println("Array após a ordenação: " + Arrays.toString(Numeros));
        }


}
