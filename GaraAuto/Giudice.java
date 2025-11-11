import java.util.ArrayList;

public class Giudice extends Thread{
    private ArrayList<Auto> automobili;
    private ArrayList<Auto> classificaFinale;
    public Giudice() {
        automobili = new ArrayList<>();
        classificaFinale = new ArrayList<>();
    }

    public void addAuto(Auto auto){
        automobili.add(auto);
    }

    @Override
    public void run(){
        System.out.println("5");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("4");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("3");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("via");

        int chihaconcluso = 0;
        while(chihaconcluso != automobili.size()){
            
        }
    }

    public void classifica(Auto a){
        classificaFinale.add(a);
    }

    public void stampaClassifica(){
        for (int num=1; num<classificaFinale.size() +1; num++) {
            System.out.println(num + " classificato: " + classificaFinale.get(num).toString());
        }
    }
}
