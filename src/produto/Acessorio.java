package produto;

import java.util.Scanner;

public class Acessorio extends Peca implements Item{

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }
    
  
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade vendida do acessório: ");
        int quantidadeVendida = scanner.nextInt();
        setQuantidade(getQuantidade() - quantidadeVendida);
    }


    public String getDescricao() {
        return getDescricaoo();
    }


    @Override
    public String toString() {
        return getDescricaoo() + " " + getQuantidade();
    }

}



