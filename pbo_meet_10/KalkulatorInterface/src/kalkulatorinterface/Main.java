package kalkulatorinterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Bilangan pertama : ");
        double bil1 = Double.parseDouble(br.readLine());
        System.out.print("Bilangan kedua : ");
        double bil2 = Double.parseDouble(br.readLine());
        
        // Object
        Kalkulator kal = new Kalkulator(bil1, bil2);
        
        // Output
        kal.penjumlahan();
        kal.pengurangan();
        System.out.println("Perkalian = " + kal.perkalian());
        System.out.println("Pembagian = " + kal.pembagian());
        
        System.out.print("\nBilangan pertama : ");
        bil1 = Double.parseDouble(br.readLine());
        System.out.print("Bilangan kedua : ");
        bil2 = Double.parseDouble(br.readLine());
        
        // Assignment nilai baru
        kal.setBil1(bil1);
        kal.setBil2(bil2);
        
        // Output
        kal.penjumlahan();
        kal.pengurangan();
        System.out.println("Perkalian = " + kal.perkalian());
        System.out.println("Pembagian = " + kal.pembagian());
    }
    
}
