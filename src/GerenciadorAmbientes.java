//deprecated
//reciclar descrição e arrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GerenciadorAmbientes {
    private List<Ambiente> ambientes;

    public GerenciadorAmbientes() {
        ambientes = new ArrayList<>();
        //parametros dos ambientes abaixo
        ambientes.add(new Ambiente(
                "Planalto Rochoso",
                "Um deserto frio e seco, com ventos cortantes.",
                Arrays.asList("Registro de áudio da nave", "n sei"),
                Arrays.asList("Tempestade de poeira azul", "Radiação solar intensa")
        ));

        ambientes.add(new Ambiente(
                "Selva Bioluminescente",
                "Vegetação densa com plantas tóxicas e alucinógenas.",
                Arrays.asList("Frutas bioluminescentes", "Registro de experimento"),
                Arrays.asList("Verme néon", "Esporos tóxicos")
        ));

        ambientes.add(new Ambiente(
                "Mar de Cristais",
                "Campos de minerais cortantes e espelhos d’água misteriosos.",
                Arrays.asList("Cristais raros", "Água cristalina"),
                Arrays.asList("Terremotos leves", "Cristais explosivos ao toque")
        ));

        ambientes.add(new Ambiente(
                "Abismo Sombrio",
                "Um vale profundo com cavernas que ecoam sons estranhos.",
                Arrays.asList("Minerais raros", "Cogumelos luminescentes"),
                Arrays.asList("Neblina densa", "Criaturas subterrâneas")
        ));

        ambientes.add(new Ambiente(
                "Ruínas Alienígenas",
                "Estruturas metálicas corroídas pelo tempo.",
                Arrays.asList("Artefatos antigos", "Componentes tecnológicos"),
                Arrays.asList("Chuva ácida", "Sentinelas perdidas")
        ));
    }

    public Ambiente getAmbiente(int index) {
        if (index >= 0 && index < ambientes.size()) {
            return ambientes.get(index);
        }
        return null;
    }

    public int getQuantidadeAmbientes() {
        return ambientes.size();
    }
}
