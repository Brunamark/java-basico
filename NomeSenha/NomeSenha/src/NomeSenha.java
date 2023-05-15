public class NomeSenha {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out("Digite seu nome:");
        String nome = scanner.next();
       do
        System.out("Digite sua senha: ");
        String senha = scanner.next();
        while(nome==senha);
        //System.out.println("Hello, World!");
    }
}
