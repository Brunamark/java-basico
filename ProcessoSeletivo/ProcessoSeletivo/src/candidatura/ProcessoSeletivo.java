package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidato(2000,2200);
        selecaoCandidato();
    }
    static void analisarCandidato(double salarioBase,double salarioPretendido){
       
        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }
    static void selecaoCandidato(){
        // Array com a lista de candidatos
        try{
        double SalarioBase = 2000;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int selecionados = 5;
        int count = 0;
        String [] listaSelecionados = new String[selecionados];
        for(int i=0;i<10; i++){
            double valorPretendido = valorPretendido();
           System.out.println("O candidato "+candidatos[i]+" esta ofertando como salario R$ "+valorPretendido);
           if(valorPretendido<SalarioBase){
                System.out.println("LEGAL!! O candidato " + candidatos[i] + " foi selecionado ");
                listaSelecionados[count] = 	candidatos[i];	
                count++;
           }
           else
            System.out.println("QUE PENA!! O candidato " + candidatos[i] + " nao foi selecionado ");
           if(count==selecionados)
                break;
        }
        System.out.println("Total de selecionados: " + count);
        System.out.print("A lista dos selecionados foram: ");
        for(int i=0; i<selecionados; i++){
           // System.out.print(listaSelecionados[i]);
            
            if(listaSelecionados[i].equalsIgnoreCase(null)){

            }
            System.out.print(listaSelecionados[i]);
            if(i<(count-1))
            System.out.print(" , ");
        }
    }
      catch( java.lang.NullPointerException e){
        System.out.println("");
    }
    
    }
  
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }
}
