package Animais;


public class Cachorro{
    //atributos
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;
   //construtor
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura; 
        this.peso =  peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros++;
        
    }
    //getters
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }
    public String getNome(){
        return  this.nome;
    }
    public String getCor(){
        return  this.cor;
    }
    public int getAltura(){
        return  this.altura;
    }
    public double getPeso(){
        return  this.peso;
    }
    public int getTamanhoDoRabo(){
        return  this.tamanhoDoRabo;
    }
    public String getEstadoDeEspirito(){
        return  this.estadoDeEspirito;
    }
    //setters
    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    }
    public void setEstadoDeEspirito(String estadoDeEspirito){
        this.estadoDeEspirito = estadoDeEspirito;
    }


    public void comer(){}

    public void latir(){
         System.out.println("AU AU");
    }
    public String pegar(){
        return "Bolinha";
    }
    /* 
    public String interagir(String acao){
        if(acao.equals("carinho")){
            this.estadoDeEspirito = "feliz"; // o this eh este atributo estado de espirito
        }else if(acao.equals("dormir"))
            this.estadoDoEspirito = "chateado";
        else{
            this.estadoDeEspirito = "neutro";
        }

        return estadoDeEspirito;
    }*/
    @Override
    public String toString(){
        return "Cachorro{" +
                "nome'" + nome +'\'' +
                '}';
    }

    

   
}