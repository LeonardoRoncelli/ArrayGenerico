public class Infisso {
    private String materiale;
    private double altezza;
    private double larghezza;
    public Infisso(String materiale,double altezza,double larghezza){
        this.materiale=materiale;
        this.altezza=altezza;
        this.larghezza=larghezza;
    }
    public void setMateriale(String materiale){
        this.materiale=materiale;
    }
    public String getMateriale(){
        return materiale;
    }
    public void setAltezza(double altezza){
        this.altezza=altezza;
    }
    public double getAltezza(){
        return altezza;
    }
    public void setLarghezza(double larghezza){
        this.larghezza=larghezza;
    }
    public double getLarghezza(){
        return larghezza;
    }
}