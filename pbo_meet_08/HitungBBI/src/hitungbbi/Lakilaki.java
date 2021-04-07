package hitungbbi;

public class Lakilaki extends Manusia {

    public Lakilaki(double tinggiBadan) {
        super(tinggiBadan);
    }
    
    @Override
    public double hitungBBI() {
        return (super.getTinggiBadan() - 100) * 0.9;
    }
    
}
