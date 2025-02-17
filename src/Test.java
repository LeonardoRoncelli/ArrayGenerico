public class Test {
    public static void main(String[] args) {
        Vettore<Mobile> mobili = new Vettore<>(3);
        mobili.aggiungi(new Mobile(40, 200));
        mobili.aggiungi(new Mobile(20.5, 150.0));
        mobili.aggiungi(new Mobile(10.5, 50.0));
        mobili.aggiungi(new Mobile(25.0, 130.0));
        System.out.println("Vettore di Mobili:");
        mobili.visualizza();
        Vettore<Infisso> infissi = new Vettore<>(2);
        infissi.aggiungi(new Infisso("Legno", 2.3, 1.3));
        infissi.aggiungi(new Infisso("PVC", 2.4, 1.7));
        infissi.aggiungi(new Infisso("Alluminio", 2.5, 1.0));
        System.out.println("\nVettore di Infissi:");
        infissi.visualizza();
    }
}
