import java.io.*;
import java.util.ArrayList;

public class GestoreFile {

    private ArrayList<Auto> classificaFinale;

    public void salvaClassifica(ArrayList<Auto> classificaFinale) {
        try (FileWriter writer = new FileWriter("Classifica.txt")) {
            writer.write("Classifica auto\n");
            for(int num = 0; num < classificaFinale.size(); ++num) {
                writer.write((num+1) + " posto: " + (classificaFinale.get(num)).toString() +"\n");
            }
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file");
        }
    }

    public void leggiClassifica() {
        File file = new File("Classifica.txt");
        if (!file.exists()) {
            System.out.println("Nessuna classifica precedente trovata.");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader("Classifica.txt"))) {
            String i = br.readLine();
            while(i != null){
                System.out.println(i);
                i = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Errore nella scrittura del file");
        }
    }
}