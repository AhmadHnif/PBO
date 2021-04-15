package gameabstract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int hp = 100;
        
        while (hp >= 1) {
            // Object Musuh
            Zombie zombie = new Zombie();
            Singa singa = new Singa();
            int dmg = 0;
            
            int att = new Random().nextInt(2);
            if (att == 0) dmg = zombie.damage();
            else if (att == 1) dmg = singa.damage();
            
            int arahSerangan = new Random().nextInt(2);
            if (arahSerangan == 0) System.out.println("Serangan dari kiri!");
            else if (arahSerangan == 1) System.out.println("Serangan dari kanan!");
            
            System.out.print("\nMenghindar : ");
            int langkah = Integer.parseInt(br.readLine());
            
            /*
            * Arah serangan = langkah, maka terkena damage
            */
            if (langkah == arahSerangan) {
                hp -= dmg;
                System.err.println("HP -" + dmg);
            } else System.out.println("Berhasil menghindar");
            
            System.out.println("\nHP sisa : " + hp + "\n");
        }
    }
    
}
