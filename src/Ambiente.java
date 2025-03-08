import java.util.Arrays;
import java.util.List;

public abstract class Ambiente {
    protected String nome;
    protected String descricao;
    protected List<String> recursos;
    protected List<String> eventos;

    public Ambiente(String nome, String descricao, List<String> recursos, List<String> eventos) {
        this.nome = nome;
        this.descricao = descricao;
        this.recursos = recursos;
        this.eventos = eventos;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getRecursos() {
        return recursos;
    }

    public List<String> getEventos() {
        return eventos;
    }

    public abstract void explorar();
}

class PlanaltoRochoso extends Ambiente {
    public PlanaltoRochoso() {
        super("Planalto Rochoso",
                "Um deserto frio e seco, com ventos cortantes.",
                List.of("Registro de áudio da nave", "Cristais energéticos"),
                List.of("Tempestade de poeira azul", "Radiação solar intensa"));
    }

    @Override
    public void explorar() {
        System.out.println("O vento forte balança seu traje enquanto você examina o terreno rochoso...");
    }
}

class SelvaBioluminescente extends Ambiente {
    public SelvaBioluminescente() {
        super("Selva Bioluminescente",
                "Vegetação densa com plantas tóxicas e alucinógenas.",
                List.of("Frutas bioluminescentes", "Registro de experimento"),
                List.of("Verme néon", "Esporos tóxicos"));
    }

    @Override
    public void explorar() {
        System.out.println("A vegetação bla bla bla...");
    }
}

class MarDeCristais extends Ambiente {
    public MarDeCristais() {
        super("Mar De Cristais",
                "Campos de minerais cortantes e espelhos d’água misteriosos.",
                List.of("Cristais raros", "Água cristalina"),
                List.of("Terremotos leves", "Cristais explosivos ao toque"));
    }
    @Override
    public void explorar() {
        System.out.println("Os cristais bla bla bla...");
    }
}

class AbismoSombrio extends Ambiente {
    public AbismoSombrio() {
        super("Abismo Sombrio",
                "Um vale profundo com cavernas que ecoam sons estranhos.",
                List.of("Minerais raros", "Cogumelos luminescentes"),
                List.of("Neblina densa", "Criaturas subterrâneas"));
    }
    @Override
    public void explorar() {
        System.out.println("A Neblina bla bla bla...");
    }
}

class RuinasAlienigenas extends Ambiente {
    public RuinasAlienigenas() {
        super("Ruínas Alienígenas",
                "Estruturas metálicas corroídas pelo tempo.",
                List.of("Artefatos antigos", "Componentes tecnológicos"),
                List.of("Chuva ácida", "Sentinelas perdidas"));
    }
    @Override
    public void explorar() {
        System.out.println("A Neblina bla bla bla...");
    }
}