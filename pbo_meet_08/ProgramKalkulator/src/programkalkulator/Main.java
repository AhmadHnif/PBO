package programkalkulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        // Start code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Bilangan a = ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Bilangan b = ");
        int b = Integer.parseInt(br.readLine());
        
        // Object
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.penjumlahan(a, b);
        kalkulator.pengurangan(b, a);
        kalkulator.perkalian(a, b);
        
        Kalkulasi kalkulasi = new Kalkulasi();
        kalkulasi.penjumlahan(a, a);
        kalkulasi.pengurangan(a, b);
        
    }
    
}
