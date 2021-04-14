package programkalkulator;

/**
 * Superclass
 * @author Wahid
 */

public class Kalkulasi {
    int z;
    
    public void penjumlahan(int x, int y) {
        z = x + y;
        System.out.println("Hasil penjumlahan = " + z);
    }
    
    public void pengurangan(int x, int y) {
        z = x - y;
        System.out.println("Hasil pengurangan = " + z);
    }
}
