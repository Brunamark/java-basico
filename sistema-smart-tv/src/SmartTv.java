public class SmartTv {
    boolean ligada = false;
    int canal =1 ;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void volume(String condicao){
        if (condicao == "aumentar") volume++ ; 
        else if(condicao == "diminuir") volume--;
    }
    public void mudarCanal(int canalEscolhido){
        canal = canalEscolhido;
    }
}
