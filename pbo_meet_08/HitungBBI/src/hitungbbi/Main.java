package hitungbbi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan tinggi badan = ");
        double tb = Double.parseDouble(br.readLine());
        
        // Object
        Lakilaki lakilaki = new Lakilaki(tb);
        System.out.println("BBI Laki-laki = " + lakilaki.hitungBBI());
        
        Perempuan perempuan = new Perempuan(tb);
        System.out.println("BBI Perempuan = " + perempuan.hitungBBI());
    }
    
}
