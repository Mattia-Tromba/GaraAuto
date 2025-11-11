import java.util.Scanner;

public class GaraAuto{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Giudice giudice = new Giudice();
        Auto a = new Auto(1);
        new Thread(giudice);
        boolean stop=false;
        int scelta = 3;
        while (scelta != 2) {
            System.out.println("1: inserisci un'auto 2: fai partire la gara 0: quit");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("inserisci il numero dell'auto: \n");
                    Auto nuova = new Auto(scanner.nextInt());
                    giudice.addAuto(nuova);
                    break;
                case 2:
                    System.out.println("inizio gara \n");
                    break;
                default:
                    System.out.println("inserisci 1 o 2\n");
            }
        }
        giudice.start();
    }
}