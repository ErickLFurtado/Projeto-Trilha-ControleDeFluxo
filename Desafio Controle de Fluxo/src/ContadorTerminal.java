import java.util.Scanner;

public class ContadorTerminal {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
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
    }

    static void contar(int parametroUm,int parametroDois) throws parametrosInvalidosException {
        if (parametroUm > parametroDois){

        }
        int contagem = parametroUm - parametroDois;
    }
}