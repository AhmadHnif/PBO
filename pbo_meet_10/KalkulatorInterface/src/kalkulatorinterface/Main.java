package kalkulatorinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /*
        * Input bilangan 1 dan bilangan 2
        */
        System.out.print("Bilangan 1 : ");
        double bil1 = Double.parseDouble(br.readLine());
        System.out.print("Bilangan 2 : ");
        double bil2 = Double.parseDouble(br.readLine());
        
        /*
        * Object dari class Kalkulator
        */
        Kalkulator kal = new Kalkulator(bil1, bil2);
        
        /*
        * Output
        */
        kal.penjumlahan();
        kal.pengurangan();
        System.out.println("Perkalian = " + kal.perkalian());
        System.out.println("Pembagian = " + kal.pembagian());
        
        /*
        * Assign nilai baru ke bilangan 1 dan bilangan 2
        */
        System.out.print("\nBilangan 1 : ");
        double bil3 = Double.parseDouble(br.readLine());
        System.out.print("Bilangan 2 : ");
        double bil4 = Double.parseDouble(br.readLine());
        
        kal.setBil1(bil3);
        kal.setBil2(bil4);
        
        /*
        * Output
        */
        kal.penjumlahan();
        kal.pengurangan();
        System.out.println("Perkalian = " + kal.perkalian());
        System.out.println("Pembagian = " + kal.pembagian());
    }
    
}
