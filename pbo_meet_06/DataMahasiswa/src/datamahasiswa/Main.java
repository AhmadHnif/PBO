package datamahasiswa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Array untuk menyimpan daftar mahasiswa
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList();
        
        boolean lanjut = true;
        while (lanjut) {            
            System.out.println("\n1. Lihat daftar");
            System.out.println("2. Tambah");
            System.out.println("3. Keluar");
            
            System.out.print("\nPilih menu : ");
            int menu = Integer.parseInt(br.readLine());
            
            switch (menu) {
                case 1:
                    // LIhat daftar mahasiswa
                    System.out.println("\n> Daftar mahasiswa");
//                    
                    
                    if (listMahasiswa.isEmpty()) {
                        System.out.println("Data masih kosong");
                    } else {
                        // Dengan for-each
//                        for(Mahasiswa mhs: listMahasiswa) {
//                            System.out.println("NPM : " + mhs.getNpm());
//                            System.out.println("Nama : " + mhs.getNama());
//                            System.out.println("Kota : " + mhs.getKota());
//                            System.out.println();
//                        }
                        for (int i = 0; i < listMahasiswa.size(); i++) {
                            System.out.println("NPM : " + listMahasiswa.get(i).getNpm());
                            System.out.println("Nama : " + listMahasiswa.get(i).getNama());
                            System.out.println("Kota : " + listMahasiswa.get(i).getKota());
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    // Tambah Mahasiswa
                    Mahasiswa mahasiswa = new Mahasiswa();
                    System.out.println("\n> Data baru");
                    
                    System.out.print("\nNPM : ");
                    mahasiswa.setNpm(br.readLine());
                    System.out.print("Nama : ");
                    mahasiswa.setNama(br.readLine());
                    System.out.print("Kota : ");
                    mahasiswa.setKota(br.readLine());
                    
                    listMahasiswa.add(mahasiswa);
                    break;
                case 3:
                    lanjut = false;
                    System.out.println("\n>Anda keluar sistem");
                    break;
            }
        }
    }
    
}
