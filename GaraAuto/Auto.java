public class Auto implements Runnable{
    int numero;
    int metripercorsi;

    public Auto(int numero) {
        this.numero = numero;
        metripercorsi = 0;
    }

    public Auto(Auto a){
        this.numero = a.numero;
        this.metripercorsi = a.metripercorsi;
    }

    @Override
    public void run(){

    }
    public String getMetri(){
        return numero + ": " + metripercorsi + "m";
    }

    public void addMetripercorsi(){
        int numero = (int)(Math.random() * 100);
        metripercorsi += numero;
    }

    public String toString(){
        return "auto " + numero;
    }
}
