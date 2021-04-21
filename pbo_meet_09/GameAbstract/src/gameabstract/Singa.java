package gameabstract;

public class Singa extends Enemy {
    
    @Override
    public int damage() {
        return 15;
    }

    @Override
    String gerak() {
        return "Lari";
    }
    
}
