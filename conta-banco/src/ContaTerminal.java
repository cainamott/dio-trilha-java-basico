import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    //to do: conhecer e importar a classe scanner
    
    Scanner input = new Scanner(System.in);

    System.out.println("Insira seu nome: ");
    String nome = input.nextLine();

    System.out.println("Insira o número da agência: ");
    String numAgencia = input.nextLine();

    System.out.println("Insira o número da conta: ");
    int numConta = input.nextInt();

    System.out.println("Olá "+ nome + ", obrigado por criar uma conta conosco! O número de sua agência é: "+ numAgencia+ " e o número de sua conta é: "+ numConta+". Tenha um ótimo dia!");

    }
}
