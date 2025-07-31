import br.com.jkalango.dto.Genero;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Genero> listaGenero = new ArrayList<>();
        
        // Adicionar
        Genero g1 = new Genero("RGP", "Lutinha, turno, persona, pokemanos");
        Genero g2 = new Genero("Terror", "Medo, uuuh");
        Genero g3 = new Genero("Visual Novel", "Romance, história");

        listaGenero.add(g1);
        listaGenero.add(g2);
        listaGenero.add(g3);

        System.out.println(listaGenero);

        // Pesquisar

        // Remover

        // Alterar

    }
}
