public class Recursividade {
    static double exemplo(int pos){
    if(pos==1){
        return 0;
    }else if(pos==2){
        return 1;
    }else{
        return(exemplo(pos-1)+exemplo(pos-2));
    }
}
    public static void main(String[] args) {
        int pos = 5;
        double resultado = exemplo(pos);
        System.out.println("Resultado para pos = " + pos + ": " + resultado);
    }
}
