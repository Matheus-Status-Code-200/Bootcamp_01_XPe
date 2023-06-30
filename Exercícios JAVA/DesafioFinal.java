public class DesafioFinal {
    public static void main(String[] args){
        int linhas = 5, colunas=5;
        int numeros[][]= new int [linhas] [colunas];

        for (int i=0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                if(i==0){
                    numeros[i][j]= j+1;
                }else {
                    numeros[i][j]= numeros[i-1][j]+1;
                }
            }
        }
        for (int i=0;i<colunas;i++){
            System.out.printf("%d",numeros[2][i]);
        }
    }
}
