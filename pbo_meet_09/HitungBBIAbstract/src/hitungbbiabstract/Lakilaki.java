package hitungbbiabstract;

public class Lakilaki extends Manusia {

    public Lakilaki(double tinggiBadan) {
        super(tinggiBadan);
    }

    @Override
    double hitungBBI() {
        return (super.getTinggiBadan() - 100) * 0.9; // (tinggi badan - 100) * 90%
    }

}
