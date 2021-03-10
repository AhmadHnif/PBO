package pbomeet05;

public class PersegiPanjang {
    private int panjang;
    private int lebar;
    
    // Setter
    public void setPanjang (int panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar (int lebar) {
        this.lebar = lebar;
    }
    
    // Getter
    public int getPanjang() {
        return this.panjang;
    }
    
    public int getLebar() {
        return this.lebar;
    }
    
    // Hitung keliling persegi panjang
    private int keliling() {
//        int k = 2 * (this.panjang + this.lebar);
        return 2 * (this.panjang + this.lebar);
    }
    
    public void getKeliling() {
        System.out.println("Keliling Persegi Panjang = " + this.keliling());
    }
    
    // Hitung luas persegi panjang
//    public int luas() {
//        int l = this.panjang * this.lebar;
//        return l;
//    }
    
    public void luas() {
        int l = this.panjang * this.lebar;
        System.out.println("Luas Persegi Panjang = " + l);
    }
}
