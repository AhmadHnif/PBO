package programkalkulator;

/**
 * Subclass
 * @author Wahid
 */
public class Kalkulator extends Kalkulasi {
    
    public void perkalian(int x, int y) {
        z = x * y;
        System.out.println("Hasil perkalian = " + z);
    }
    
    /**
     * Polymorphism
     * Deklarasi ualng dengan perlakuan berbeda
     * @param x
     * @param y 
     */
    @Override
    public void pengurangan(int x, int y) {
        z = y - x;
        System.out.println("Pengurangan = " + z);
    }
}
