import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        int n;
        int count=0;
        int par=0;
        int impar=0;
        int number;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite a quantiade N de numeros: ");
        n=scanner.nextInt();
        do{
            System.out.println("Digite os numeros: ");
            number = scanner.nextInt();
            count++;
            if(number%2==0)
               par++; 
            else
                impar++;
        }while(count<n);
       
        System.out.println("Os numeros pares sao: "+ par + "e impares sao: "+impar);
    }
}
