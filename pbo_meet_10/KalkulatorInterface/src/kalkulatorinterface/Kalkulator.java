package kalkulatorinterface;

/*
* Implement dari interface Operasi
*/
public class Kalkulator implements Operasi {
    
    // Atribut
    private double bil1, bil2;
    
    public Kalkulator() {}
    
    public Kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    // Setter
    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }
    
    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }
    
    // Getter
    public double getBil1() {
        return bil1;
    }

    public double getBil2() {
        return bil2;
    }

    
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
    
}
