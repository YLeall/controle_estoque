package produto;

import java.util.Scanner;

public class RoupaPMG implements Item{
    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
            int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

  
    public void venda(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do item vendido: ");
        String tamanhoItem = scanner.next();
        switch (tamanhoItem.toUpperCase()) {
            case "P":
                this.quantidadeP = this.quantidadeP - 1;
                break;
            case "M":
               this.quantidadeM = this.quantidadeM - 1;
                break;
            case "G":
                this.quantidadeG = this.quantidadeG - 1;
                break;
            default:
                System.out.println("Tamanho inválido!");
        }
    }

    public void reposicaoEstoque() {
        if (this.quantidadeP<this.estoqueMinimo) {
            this.quantidadeP = this.estoqueMaximo;
        }
        else if (this.quantidadeM<this.estoqueMinimo) {
            this.quantidadeM = this.estoqueMaximo;
        }
        else if (this.quantidadeG<this.estoqueMinimo) {
            this.quantidadeG = this.estoqueMaximo;
        }

    }


    public String getDescricao() {
        return this.descricao;
    }


    @Override
    public String toString() {
        return "RoupaPMG [descricao=" + descricao + ", quantidadeP=" + quantidadeP + ", quantidadeM=" + quantidadeM
                + ", quantidadeG=" + quantidadeG + ", estoqueMinimo=" + estoqueMinimo + ", estoqueMaximo="
                + estoqueMaximo;
    }
 

}