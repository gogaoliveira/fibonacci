package sequência.fibonacci;


public class SequênciaFibonacci {


    public static void main(String[] args) {
        //A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, 
        //a seguir, cada termo subsequente é obtido pela soma dos dois termos predecessores:
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
        
        int a = 0;
        int b = 1;
        int tamanho = 13;
        System.out.println(a);
        for (int i = 0; i < tamanho; i++) {
            int c = a+b;
            a=b;
            b=c;
            System.out.println(a);
        }
    }
    
}
