import java.util.Scanner;

public class ContadorTerminal {
    public static void main(String[] args) {
        
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parametro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parametro: ");
            int parametroDois = terminal.nextInt();
            try {
                contar(parametroUm, parametroDois);
            }
            catch (parametroInvalidoException Exception){
                System.out.println("O segundo parametro deve ser maior que o primeiro");
            }
        }    }
    static void contar(int parametroUm,int parametroDois) throws parametroInvalidoException {
        if (parametroUm > parametroDois){
            throw new parametroInvalidoException();
        }
        else{ 
            imprimir(parametroUm, parametroDois);
        }
        
    }
    static void imprimir(int parametroUm, int parametroDois){
        System.out.println("imprimindo...");
        int contagem = parametroDois - parametroUm;
        for(int x = 1; x <= contagem; x++){
            System.out.println("imprindo o número: " + x);
        }
    }
    

    
}