package bootcamp.java;

public class UsuarioTv {
    public static void main(String [] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);
        
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status > TVligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Ligada? " + smartTv.ligada);
        
    }

    
}
