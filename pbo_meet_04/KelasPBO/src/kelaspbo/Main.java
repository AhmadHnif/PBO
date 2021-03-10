package kelaspbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Instansiasi objek class Hewan
        Hewan kucing = new Hewan();
        Hewan hewan3 = new Hewan();
        
        // mengambil nilai dari atribut di class Hewan
        System.out.println("Nama hewan : " + kucing.getNama());
        System.out.println("Gerak : " + kucing.getGerak());
        System.out.println("Jumlah kaki : " + kucing.getJumlahKaki());
        
        //Memanggil method jenis di class Hewan
        kucing.jenis("Karnivora");
        
        System.out.print("\nNama hewan 3 : ");
        hewan3.setNama(br.readLine());
        System.out.print("Gerak hewan 3 : ");
        hewan3.setGerak(br.readLine());
        System.out.print("Jumlah kaki ada : ");
        hewan3.setJumlahKaki(Integer.parseInt(br.readLine()));
        System.out.print("Jenis hewan : ");
        String jenis = br.readLine();
        
        System.out.println("\nNama hewan : " + hewan3.getNama());
        System.out.println("Gerak : " + hewan3.getGerak());
        System.out.println("Jumlah kaki : " + hewan3.getJumlahKaki());
        hewan3.jenis(jenis);
    }
    
}
