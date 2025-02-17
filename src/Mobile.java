public class Mobile {
    private double peso;
    private double prezzo;
    public Mobile(double peso,double prezzo){
        this.peso=peso;
        this.prezzo=prezzo;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public double getPeso(){
        return peso;
    }
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }
    public double getPrezzo(){
        return prezzo;
    }
}
