public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
        smartTv.volume("aumentar");
        System.out.println("Novo Status -> Volume Atual : "+smartTv.volume);
        smartTv.mudarCanal(49);
        System.out.println("Novo Status -> Canal Atual : " + smartTv.canal);
        
    }
}
