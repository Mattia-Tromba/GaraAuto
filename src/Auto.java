public class Auto{
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

    public int getMetripercorsi(){
        return metripercorsi;
    }

    public void addMetripercorsi(){
        int numero = (int)(Math.random() * 100);
        metripercorsi += numero;
    }

    public String toString(){
        return "auto " + numero;
    }
}
