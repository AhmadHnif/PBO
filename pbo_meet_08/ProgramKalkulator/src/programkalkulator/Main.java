package programkalkulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        // Start code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("a = ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b = ");
        int b = Integer.parseInt(br.readLine());
        
        // Object
        Kalkulasi kalkulasi = new Kalkulasi();
        kalkulasi.penjumlahan(a, b);
        kalkulasi.pengurangan(a, b);
        
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.pengurangan(b, a);
        kalkulator.perkalian(a, b);
        
    }
    
}
