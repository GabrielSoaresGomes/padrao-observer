import java.util.Observable;

public class Jogo extends Observable {
    private String nome;
    private double preco;
    private boolean emPromocao;

    public Jogo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.emPromocao = false;
    }

    @Override
    public String toString() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public void setEmPromocao(boolean emPromocao) {
        this.emPromocao = emPromocao;
        setChanged();
        notifyObservers();
    }


}
