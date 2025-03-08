public abstract class Item {
    protected String nome;
    protected double peso;

    public Item(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public abstract void usar();
}

//adicionar itens
class AguaPotavel extends Item {
    public AguaPotavel() {
        super("Água Potável", 0.5);
    }

    @Override
    public void usar() {
        System.out.println("Você bebe a água potável e se sente hidratado.");
    }
}
