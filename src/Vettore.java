public class Vettore<T> {
    private T[] oggetti;
    private int count;
    public Vettore(int dimensioneMassima) {
        oggetti = (T[]) new Object[dimensioneMassima];
        count = 0;
    }
    public void aggiungi(T oggetto) {
        if (count < oggetti.length) {
            oggetti[count] = oggetto;
            count++;
        } else {
            System.out.println("Vettore pieno!");
        }
    }
    public void visualizza() {
        if (count == 0) {
            System.out.println("Il vettore è vuoto.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(oggetti[i]);
        }
    }
}