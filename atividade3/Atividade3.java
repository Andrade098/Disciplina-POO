import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void atualizarQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;
    }

    @Override
    public String toString() {
        return nome + " - Quantidade: " + quantidade;
    }
}

class Estoque {
    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public void listarItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public void atualizarQuantidadeItem(Item item, int novaQuantidade) {
        item.atualizarQuantidade(novaQuantidade);
    }
}

public class Atividade3 {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Item");
            System.out.println("2. Remover Item");
            System.out.println("3. Listar Itens");
            System.out.println("4. Atualizar Quantidade");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha após a leitura do número

            switch (escolha) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarItem(new Item(nome, quantidade));
                    break;
                case 2:
                    // Implementar a remoção de um item
                    break;
                case 3:
                    estoque.listarItens();
                    break;
                case 4:
                    // Implementar a atualização da quantidade de um item
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
