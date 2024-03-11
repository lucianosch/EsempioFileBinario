public class Scultura extends Opera{
    private String materiale;
    private int peso;

    public Scultura(String titolo, String autore, int anno, double valore, String materiale, int peso) {
        super(titolo, autore, anno, valore);
        this.materiale = materiale;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s, peso: %d kg.", materiale, peso);
    }
}
