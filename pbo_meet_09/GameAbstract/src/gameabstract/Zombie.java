package gameabstract;

public class Zombie extends Enemy {

    @Override
    public int damage() {
        return 17;
    }

    @Override
    String gerak() {
        return "Jalan";
    }
    
}
