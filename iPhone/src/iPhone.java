public class iPhone implements MusicPlayer, AparelhoTelefonico, NavegadorInternet {

    // Reprodutor Musical
    public void tocar() {
        System.out.println("Tocando Musica...");
    }

    public void pausar() {
        System.out.println("Musica pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    // Aparelho Telefônico
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Navegador Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("pagina atualizada.");
    }
}
