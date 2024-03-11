import java.awt.Dimension;
public class Quadro extends Opera{
    private String tecnica;
    private Dimension dimension;
    Quadro(String titolo, String autore, int anno, double valore, String tecnica, Dimension dimension){
        super(titolo, autore, anno, valore);
        this.tecnica = tecnica;
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s, dimensione: %d x %d", tecnica, (int)dimension.getWidth(),(int)dimension.getHeight());
    }
}
