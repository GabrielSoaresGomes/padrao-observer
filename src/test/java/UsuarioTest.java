import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UsuarioTest {
    @Test
    public void testarNotificacao() {
        Jogo jogo = new Jogo("Jogo 1", 100);
        Usuario usuario = new Usuario("Usuario 1");
        usuario.adicionarListaDesejos(jogo);
        jogo.setEmPromocao(true);
        assertEquals("O jogo Jogo 1 está em promoção!", usuario.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarVariosUsuarios() {
        Jogo jogo = new Jogo("Jogo 1", 100);
        Usuario usuario1 = new Usuario("Usuario 1");
        Usuario usuario2 = new Usuario("Usuario 2");
        Usuario usuario3 = new Usuario("Usuario 3");
        usuario1.adicionarListaDesejos(jogo);
        usuario2.adicionarListaDesejos(jogo);
        usuario3.adicionarListaDesejos(jogo);
        jogo.setEmPromocao(true);
        assertEquals("O jogo Jogo 1 está em promoção!", usuario1.getUltimaNotificacao());
        assertEquals("O jogo Jogo 1 está em promoção!", usuario2.getUltimaNotificacao());
        assertEquals("O jogo Jogo 1 está em promoção!", usuario3.getUltimaNotificacao());
    }

    @Test
    public void naoDeveNotificarUsuarios() {
        Jogo jogo = new Jogo("Jogo 1", 100);
        Usuario usuario3 = new Usuario("Usuario 3");
        jogo.setEmPromocao(true);
        assertNull(usuario3.getUltimaNotificacao());
    }
}
