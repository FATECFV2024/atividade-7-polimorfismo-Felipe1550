public class Pokedex {
    public static void main(String[] args) {
        Eevee[] evolucoes = {
            new Eevee(),
            new Jolteon(),
            new Flareon(),
            new Vaporeon(),
            new Espeon(),
            new Umbreon(),
            new Leafeon(),
            new Glaceon(),
            new Sylveon()
        };

        for (Eevee e : evolucoes) {
            System.out.println("Eu sou: " + e.getClass().getSimpleName());
            System.out.println("Ataque: " + e.ataque());
            System.out.println("Defesa: " + e.defesa());
            System.out.println("Especial: " + e.especial());
            System.out.println("---------------");
        }
    }
}
