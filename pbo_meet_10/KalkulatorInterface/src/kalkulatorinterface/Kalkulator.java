package kalkulatorinterface;

public class Kalkulator implements Operasi{
    
    private double bil1, bil2;
    
    /*
     * Constructor
     */
    public Kalkulator() {}
    
    public Kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    /*
     * Setter
     */
    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }

    /*
     * Getter
     */
    public double getBil1() {
        return bil1;
    }

    public double getBil2() {
        return bil2;
    }

    /*
     * Override method yang ada di interface Operasi
     */
    @Override
    public void penjumlahan() {
        System.out.println("Hasil penjumlahan = " + (this.bil1 + this.bil2));
    }

    @Override
    public void pengurangan() {
        System.out.println("Hasil pengurangan = " + (this.bil1 - this.bil2));
    }

    @Override
    public double perkalian() {
        return this.bil1 * this.bil2;
    }

    @Override
    public double pembagian() {
        return this.bil1 / this.bil2;
    }
    
    public double jumlah() {
        return this.bil1 + this.bil2;
    }
}
