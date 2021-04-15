package hitungbbiabstract;

public abstract class Manusia {
    
    // Atribut/variabel class
    private double tinggiBadan;
    
    // Constructor
    public Manusia (double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }
    
    // Getter
    public double getTinggiBadan() {
        return this.tinggiBadan;
    }
    
    /**
     * Abstract method untuk hitung BBI
     * Hanya deklarasi tipe dan nama method
     */
    abstract double hitungBBI();
}
