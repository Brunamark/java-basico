
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try{
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        contar(parametroUm,parametroDois);   
    }catch(java.util.InputMismatchException e){
        System.out.println("O parâmetro deve ser um número inteiro!");
    }catch(ParametrosInvalidosException exception){
        System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }
    
    
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
       int contagem =  parametroDois - parametroUm;
       if(contagem<0){
        throw new ParametrosInvalidosException();
       }
       else{
            for(int i=0; i<contagem; i++){
                System.out.println("Imprimindo o número "+(i+1)+".");
            }
       }
    }
}
