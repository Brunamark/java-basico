import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Seja Bem Vindo!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String name = scanner.next();

        System.out.println("Por favor, digite seu sobrenome:");
        String surname = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int account = scanner.nextInt();

        System.out.println("Digite a agência:");
        String agency = scanner.next();

        System.out.println("Digite o seu saldo:");
        float balance = scanner.nextFloat();
        
        System.out.println("Olá "+name+ " "+surname+", obrigado por criar uma conta em nosso banco! Sua agência é "+agency+", conta "+account+" e seu saldo de R$ "+balance+" já está disponível para ser usado.");


    }
}
