package hitungbbiabstract;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Tinggi badan : ");
        double tb = Double.parseDouble(br.readLine());
        
        // Object
        Lakilaki lk = new Lakilaki(tb);
        Perempuan pr = new Perempuan(tb);
        
        // Output
        System.out.println("\nBBI Laki-laki = " + lk.hitungBBI());
        System.out.println("BBI Perempuan = " + pr.hitungBBI());
    }
    
}
