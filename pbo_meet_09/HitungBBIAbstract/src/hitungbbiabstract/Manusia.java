package hitungbbiabstract;

abstract class Manusia {
    
    private double tinggiBadan;
    
    public Manusia (double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }
    
    // Getter
    public double getTinggiBadan() {
        return this.tinggiBadan;
    }
    
    abstract double hitungBBI();

}
