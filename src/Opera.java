import java.io.Serializable;

public class Opera implements Serializable {
    protected String titolo;
    protected String autore;
    protected int anno;
    protected double valore;
    Opera(String titolo, String autore, int anno, double valore){
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.valore = valore;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %.2f; ", titolo, autore, anno, valore);
    }
}
