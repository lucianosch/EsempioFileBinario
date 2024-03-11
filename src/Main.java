import java.io.*;
import java.awt.Dimension;

public class Main {
    public static void main(String[] args){
        Opera op1 = new Quadro("I girasoli", "Van Gogh", 1887, 50000000, "olio", new Dimension(50, 70));
        Opera op2 = new Scultura("Discobolo", "Mirone", 489, 2000000, "marmo", 132);
        Opera op3 = new Quadro("Guernica","Picasso",1936,20000000,"tempera", new Dimension(300,240));

        File f;
        try {
            f = new File("opere.bin");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(op1);
            oos.writeObject(op2);
            oos.writeObject(op3);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available()>0) {
                Opera opera = (Opera) ois.readObject();
                if (opera instanceof Quadro)
                    System.out.println(opera);
            }
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}