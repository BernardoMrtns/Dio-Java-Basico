public class Usuario {
    public static void main(String[] args) {

        SmartTv SmartTv = new SmartTv();
    
        System.out.println("Tv ligada? " + SmartTv.ligada);
        System.out.println("Canal Atual: " + SmartTv.canal);
        System.out.println("Volume Atual: " + SmartTv.volume);   

        SmartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + SmartTv.ligada);
        SmartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + SmartTv.ligada);

        SmartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume da TV " + SmartTv.volume);
        SmartTv.diminuirVolime();
        System.out.println("Novo Status -> Volume da TV " + SmartTv.volume);

        SmartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal da TV " + SmartTv.canal);
        SmartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal da TV " + SmartTv.canal);

        SmartTv.mudarCanal(13);
        System.out.println("Novo Status -> Canal da TV " + SmartTv.canal);
    }
}
