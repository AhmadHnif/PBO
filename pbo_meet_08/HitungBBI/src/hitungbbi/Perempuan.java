package hitungbbi;

public class Perempuan extends Manusia {

    public Perempuan(double tinggiBadan) {
        super(tinggiBadan);
    }
    
    @Override
    public double hitungBBI() {
        return (super.getTinggiBadan() - 100) * 0.8;
    }
}
