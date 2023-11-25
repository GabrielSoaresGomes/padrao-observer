import java.util.Observable;
import java.util.Observer;


public class Usuario implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void adicionarListaDesejos(Jogo jogo) {
        jogo.addObserver(this);
    }

    public void update(Observable jogo, Object arg1) {
        this.ultimaNotificacao = "O jogo " + jogo.toString() + " está em promoção!";
    }
}
