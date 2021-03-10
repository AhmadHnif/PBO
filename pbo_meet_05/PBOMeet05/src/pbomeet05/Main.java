package pbomeet05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // BufferedReader untuk input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Objek class PersegiPanjang
        // PersegiPanjang persegiPanjang = new PersegiPanjang();
        
        // Input Panjang & Lebar
        // System.out.print("Panjang : ");
        // persegiPanjang.setPanjang(Integer.parseInt(br.readLine()));
        // System.out.print("Lebar : ");
        // persegiPanjang.setLebar(Integer.parseInt(br.readLine()));
        
        // System.out.println("\nP = " + persegiPanjang.getPanjang());
        // System.out.println("L = " + persegiPanjang.getLebar());
        // persegiPanjang.getKeliling();
        // System.out.println("Luas Persegi Panjang = " + persegiPanjang.luas());
        // persegiPanjang.luas();
        
        // Objek class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        
        // Input
        System.out.print("NPM   : ");
        mhs.setNpm(br.readLine());
        System.out.print("Nama  : ");
        mhs.setNama(br.readLine());
        System.out.print("Nilai : ");
        mhs.setNilai(Integer.parseInt(br.readLine()));
        
        // Tampilkan
        System.out.println("\nNPM Mahasiswa   : " + mhs.getNpm());
        System.out.println("Nama Mahasiswa  : " + mhs.getNama());
        System.out.println("Nilai Mahasiswa : " + mhs.getNilai());
        
        System.out.println("\nGrade nilai : " + mhs.gradeNilai());
    }
    
}
