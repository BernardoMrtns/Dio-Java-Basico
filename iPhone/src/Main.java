public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        // Teste reprodutor musical
        meuiPhone.selecionarMusica("Imagine - John Lennon");
        meuiPhone.tocar();
        meuiPhone.pausar();

        // Teste telefone
        meuiPhone.ligar("123456789");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        // Teste navegador
        meuiPhone.exibirPagina("www.exemplo.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
