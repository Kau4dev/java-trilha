public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + ".");
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // Teste das funcionalidades do Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Teste das funcionalidades do Aparelho Telefônico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Teste das funcionalidades do Navegador na Internet
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
