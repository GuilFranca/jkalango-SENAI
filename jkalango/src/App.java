import br.com.jkalango.dto.Criador;
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
        listaGenero.add(new Genero("Shooter", "Teste Teste"));
        System.out.println(listaGenero);

        // Iterar = Looping = Repetição
        // Iteração e exibição os elementos da lista - looping

        for (Genero genero: listaGenero) {
            System.out.println("Nome: " + genero.getNome() + "\n" + "Descrição: " + genero.getDescricao() + "\n");
        }

        // Pesquisar

        // Remover

        // Alterar

        System.out.println("\nCriadores\n");

        List<Criador> listaCriador = new ArrayList<>();

        Criador c1 = new Criador("Geraldo", "geraldao@gmail.com", "3036-2003", "jogador profissional desde que nasci!");
        Criador c2 = new Criador("Marquin", "Marquin@gmail.com", "3035-2001", "jogador profissional desde que nasci!");

        listaCriador.add(c1);
        listaCriador.add(c2);

        System.out.println(listaCriador);

        for (Criador criador: listaCriador) {
            System.out.println("Nome: " + criador.getNome() + "\n" + "email: " + criador.getEmail() + "telefone: " + criador.getTelefone() + "perfil: " + criador.getPerfil() + "\n");
        }

    }
}
