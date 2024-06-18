import AparelhoTelefonico.AparelhoTelefonicoImpl;
import NavegadorInternet.NavegadorInternetImpl;
import ReprodutoMusical.ReprodutorMusicalImpl;

public class iphone {
    public static void main (String[] args) {

        ReprodutorMusicalImpl reprodutor = new ReprodutorMusicalImpl();
        reprodutor.selecionarMusica("Selecionando Musica: I Winner - Cantor Desconhecido.");
        reprodutor.tocar();
        reprodutor.pausar();

        AparelhoTelefonicoImpl telefone = new AparelhoTelefonicoImpl();
        telefone.ligar("1234-5678");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternetImpl navegador = new NavegadorInternetImpl();
        navegador.exibirPagina("https://www.examplo.com.br");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
