import java.util.Scanner;

import produto.Acessorio;
import produto.Item;
import produto.RoupaPMG;
import produto.RoupaTamanhoUnico;

public class Main {
    public static void main(String[] args) {
        
        int op=0;
        Scanner sc = new Scanner(System.in);
        Item[] vetorItems = new Item[5];

        RoupaTamanhoUnico camisa = new RoupaTamanhoUnico("Camisa", 100, 50, 150);

        RoupaPMG saia = new RoupaPMG("Saia", 100, 100, 100, 50, 300);

        Acessorio cinto = new Acessorio("Cinto", 100, 50, 150);

        Acessorio pulseira = new Acessorio("Pulseira", 100, 50, 150);

        RoupaPMG saidaPraia = new RoupaPMG("Saida de Praia", 100, 100, 100, 50, 300);

        vetorItems[0] = camisa;
        vetorItems[1] = saia;
        vetorItems[2] = cinto;
        vetorItems[3] = pulseira;
        vetorItems[4] = saidaPraia;


        do {
            
            for (int i = 0; i < vetorItems.length; i++) {
                System.out.println(i + " - " + vetorItems[i].getDescricao());
            }
            System.out.println("5 - Sair do sistema");

            op = sc.nextInt();

            switch (op) {
                case 0:
                    Item teste = vetorItems[0];
                    vetorItems[0].venda();
                    vetorItems[0].reposicaoEstoque();
                    System.out.println(teste);
                    break;
                case 1:
                    Item teste2 = vetorItems[1];
                    vetorItems[1].venda();
                    vetorItems[1].reposicaoEstoque();
                    System.out.println(teste2);
                    break;
                case 2:
                    Item teste3 = vetorItems[2];
                    vetorItems[2].venda();
                    vetorItems[2].reposicaoEstoque();
                    System.out.println(teste3);
                    break;
                case 3:
                    Item teste4 = vetorItems[3];
                    vetorItems[3].venda();
                    vetorItems[3].reposicaoEstoque();
                    System.out.println(teste4);
                    break;
                case 4:
                    Item teste5 = vetorItems[4];
                    vetorItems[4].venda();
                    vetorItems[4].reposicaoEstoque();
                    System.out.println(teste5);
                    break;
            
                default:
                    break;
            }

        } while (op != 5);

        for (Item item : vetorItems) {
            System.out.println(item.toString());
        }

    }
}
