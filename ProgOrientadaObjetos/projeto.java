
import Animais.Cachorro;

public class projeto{
    /**
     * @param args
     */
    public static void main(String[] args) {
     
       
      
        
    //  Classe  | nome da refrencia da memeroia (cachorro1)
        Cachorro cachorro1 = new Cachorro("Puppy","Marrom", 25, 5.5, 5, "feliz");
        System.out.println(cachorro1.getNumeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Ted","Marrom", 25, 5.5, 5, "feliz");
        System.out.println(cachorro1.getNumeroDeCachorros());
        System.out.println(cachorro2.getNumeroDeCachorros());

        System.out.println(cachorro1.toString());//classe@memoria do objeto
        System.out.println(cachorro2.toString());

        System.out.println("---------------");
        System.out.println(cachorro1.toString());//classe@memoria do objeto
        System.out.println(cachorro2.toString());

       
        System.out.println("O cachorro pegou uma "+cachorro1.pegar());
        System.out.println("O cachorro esta " + cachorro1.getEstadoDeEspirito());
    }
}