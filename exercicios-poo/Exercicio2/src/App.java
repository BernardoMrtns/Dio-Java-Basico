public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.ligar();
        carro.subirMarcha();
        
        for(int i=0; i <= 20; i++){
            carro.acelerar();
        }
        carro.subirMarcha();
        for(int i=0; i <= 20; i++){
            carro.acelerar();
        }

        carro.desligar();
    }
}
