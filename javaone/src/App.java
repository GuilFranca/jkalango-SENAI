public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Genero g1 = new Genero("Aventura", "Jogo focado em exploração");
        Genero g2 = new Genero("Romance","Safadeza, nheco nheco , fuqui fuqui");
        Genero g3 = new Genero("Terror", "Medo, fantasma, safadeza");
        Genero g4 = new Genero("Corrida","Vrummm, vrummmm, iihihiiii, poooow");
        Genero g5 = new Genero("Shooter","piipipiiiipiipiip boom");
        Genero g6 = new Genero("Sci-fi", "Monstro, espaço , futuro");

        g1.MostrarGenero();
        g2.MostrarGenero();
        g3.MostrarGenero();
        g4.MostrarGenero();
        g5.MostrarGenero();
        g6.MostrarGenero();

    }
}
