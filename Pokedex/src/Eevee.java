public class Eevee {
    // Atributos
    private String tipo;
    private int altura;
    private int HP;
    private double peso;

    // Construtor
    public Eevee() {
        this.tipo = "Normal";
        this.altura = 3; // Exemplo em dm
        this.HP = 55;    // Valor inicial
        this.peso = 6.5; // Em kg
    }

    // Métodos
    public String ataque() {
        return "Ataque rápido";
    }

    public String defesa() {
        return "Desvio";
    }

    public String especial() {
        return "Tri-ataque";
    }

    // Métodos Getters
    public String getTipo() {
        return tipo;
    }

    public int getAltura() {
        return altura;
    }

    public int getHP() {
        return HP;
    }

    public double getPeso() {
        return peso;
    }

    // Método para imprimir detalhes
    public void imprimir() {
        System.out.println("Eu sou: Eevee");
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura + " dm");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("HP: " + HP);
    }
}
