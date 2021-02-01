public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(){
        numeratore=0;
        denominatore=0;
    }
    // costruttore master con parametri formali
    public Frazione(int numeratore, int denominatore){
        this.numeratore=numeratore;
        this.denominatore=denominatore;
    }

    public void setNumeratore(int numeratore){
        this.numeratore=numeratore;
    }
    public void setDenominatore(int denominatore){
        this.denominatore=denominatore;
    }
    // 
    public Frazione add(Frazione f2){
        Frazione nuovaFrazione=new Frazione();
        nuovaFrazione.setNumeratore(denominatore*f2.numeratore + f2.denominatore*numeratore);
        nuovaFrazione.setDenominatore(denominatore * f2.denominatore);
        return nuovaFrazione;
    }

    public String toString(){
        return numeratore+"/"+denominatore;
    }
}
