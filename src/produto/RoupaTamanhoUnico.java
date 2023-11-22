package produto;

public class RoupaTamanhoUnico extends Peca implements Item{

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    public void venda() {
        setQuantidade(getQuantidade() - 1);
    }

    public String getDescricao() {
        return getDescricaoo();
    }

    @Override
    public String toString() {
        return getDescricaoo() + " - " + getQuantidade();
    }

}
