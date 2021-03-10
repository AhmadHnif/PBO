import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerulanganWhileDo {
    public static void main(String[] args) throws IOException {
        // Instansiasi class BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lanjut = "y";
        
        while (lanjut.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama : ");
            String nama = br.readLine();
            System.out.println("Nama yang Anda masukkan : " + nama);

            // System.out.print("\nUlangi? ");
            // lanjut = br.readLine();
        }

        System.out.println("\nIni diluar Perulangan");
    }
}
