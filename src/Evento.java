public abstract class Evento {
    protected String nome;
    protected String descricao;

    public Evento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public abstract void executar();
}

class TempestadeDePoeira extends Evento {
    public TempestadeDePoeira() {
        super("Tempestade de Poeira Azul", "Uma tempestade de poeira azul reduz drasticamente sua visibilidade!");
    }

    @Override
    public void executar() {
        System.out.println("A tempestade chega rapidamente! Seu traje é pressionado pelos ventos intensos!");
    }
}
