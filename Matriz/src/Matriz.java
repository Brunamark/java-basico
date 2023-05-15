import java.util.Random;


public class Matriz {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int [][] M = new int [4][4]; //matriz 4x4

        for(int i = 0; i< M.length; i++){//percorre a linha
            for(int j = 0; j< M[i].length; j++){ //percorre a coluna
                M[i][j] = random.nextInt(9);
            }

        } 
        System.out.println("Matriz: ");
        for (int[] linha : M){ //foreach
            for (int coluna : linha) {
               System.out.print(coluna + " ");  
            }
            System.out.println();
        }
    }
}
