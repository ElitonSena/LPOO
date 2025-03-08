import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> itens;
    private double capacidadeMaxima;
    private double pesoAtual;

    public Inventario(double capacidadeMaxima) {
        this.itens = new ArrayList<>();
        this.capacidadeMaxima = capacidadeMaxima;
        this.pesoAtual = 0;
    }

    public boolean adicionarItem(Item item) {
        if (pesoAtual + item.getPeso() <= capacidadeMaxima) {
            itens.add(item);
            pesoAtual += item.getPeso();
            System.out.println(item.getNome() + " foi adicionado ao inventário.");
            return true;
        } else {
            System.out.println("Inventário cheio! Não é possível carregar mais itens.");
            return false;
        }
    }

    public void removerItem(String nomeItem) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nomeItem)) {
                itens.remove(item);
                pesoAtual -= item.getPeso();
                System.out.println(nomeItem + " foi removido do inventário.");
                return;
            }
        }
        System.out.println("Item não encontrado no inventário.");
    }

    public void usarItem(String nomeItem) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nomeItem)) {
                item.usar();
                removerItem(nomeItem);
                return;
            }
        }
        System.out.println("Item não encontrado para uso.");
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Seu inventário está vazio.");
        } else {
            System.out.println("Itens no inventário:");
            for (Item item : itens) {
                System.out.println("- " + item.getNome());
            }
        }
    }
}
