package gamesederhana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mHp = 1000;
        
        while (mHp >=1) {
            
            // Object
            Zombie zombie = new Zombie();
            Serigala serigala = new Serigala();
            int dmg;
            
            /*
             * Damage dari musuh
            */
            int enm = new Random().nextInt(2);
            if (enm == 0) dmg = zombie.damage();
            else dmg = serigala.damage();
            
            /**
             * Arah serangan
             */
            int att = new Random().nextInt(2);
            if (att == 0) System.out.println("\nSerangan dari kiri!");
            else if (att == 1) System.out.println("Serangan dari kanan!");
            
            System.out.print("\nLangkah : ");
            int langkah = Integer.parseInt(br.readLine());

            /**
             * Jika langkah = att, maka terkena damage
             */
            if (langkah == att) {
                mHp -= dmg;
                System.err.println("HP -" + dmg);
            }
            else System.out.println("Berhasil menghindar\n");
            
            System.out.println("HP : " + mHp);
        }
    }

}
