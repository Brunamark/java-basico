import java.util.Scanner;

public class MaiorNumeroEMedia {
    public static void main(String[] args) throws Exception {
        int nota;
        int count=0;
        float media=0;
        int[] intArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Digite 5 numeros:");
         nota = scanner.nextInt();
         intArray[count] = nota;
         media+=nota;
         count++;
        }
        while(count<5);
        int maior =0;
        for(int i= 0; i<5; i++){
           if(i==0)
                maior = intArray[i];
            if(intArray[i]>maior)
                maior = intArray[i];
        }
        System.out.println("O maior numero eh: " + maior);
        System.out.println("A media eh: "+ media/count);
        
    }
}
