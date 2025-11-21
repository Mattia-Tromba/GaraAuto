import java.io.*;
import java.util.ArrayList;

public class Giudice{
    private ArrayList<Auto> automobili;
    private ArrayList<Auto> classificaFinale;

    public Giudice(){
        this.automobili = new ArrayList<>();
        this.classificaFinale = new ArrayList<>();
    }

    public void addAuto(Auto auto) {
        automobili.add(auto);
    }

    public synchronized void autoArrivata(Auto auto) {
        classificaFinale.add(auto);
        System.out.println("Il giudice registra l’arrivo di " + auto.toString() + "\n");
    }

    public void inizioGara() throws InterruptedException {
        System.out.println("Inizio gara");

        for (int i = 5; i > 0; i--) {
            try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
            System.out.println(i);
        }
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        System.out.println("VIA");

        for (Auto auto : automobili) {
            auto.start();
        }
        for (Auto auto : automobili) {
            auto.join();
        }
        Thread.sleep(3000);
        stampaClassifica();
    }

    public void stampaClassifica() {
        for (int i=0; i<15; i++) {
            System.out.println("\n");
        }
        System.out.println("Classifica:\n");
        for(int num = 0; num < classificaFinale.size(); ++num) {
            System.out.println((num+1) + " posto: " + (classificaFinale.get(num)).toString());
        }

    }

    public void salvaClassifica() {
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