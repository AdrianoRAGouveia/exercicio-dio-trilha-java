package ReprodutoMusical;

public class ReprodutorMusicalImpl {
    
    public void tocar() {
        System.out.println("Reproduzindo musica: I Winner - Cantor Desconhecido.");
    }
    
    public void pausar() {
        System.out.println("Pausando música");
    }
    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}
