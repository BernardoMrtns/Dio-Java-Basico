public class App {
    public static void main(String[] args) {
        MaquinaDeBanho maquina = new MaquinaDeBanho();

        // Abastecer até o necessário
        for (int i = 0; i < 15; i++) {
            maquina.abastecerAgua();
            maquina.abastecerShampoo();
        }

        maquina.colocarPet();
        maquina.darBanho();
        maquina.retirarPet();

        // Tentar colocar novo pet sem limpar
        maquina.colocarPet();
        maquina.limparMaquina();
        maquina.colocarPet();
    }
}
