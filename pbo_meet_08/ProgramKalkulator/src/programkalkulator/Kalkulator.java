package programkalkulator;

// Child dari class Kalkulasi

public class Kalkulator extends Kalkulasi {
    
    public void perkalian(int x, int y) {
        z = x * y;
        System.out.println("Hasil perkalian = " + z);
    }
    
    @Override
    public void penjumlahan(int x, int y) {
        z = x + y + 10;
        System.out.println("Hasil penjumlahan = " + z);
    }
}
