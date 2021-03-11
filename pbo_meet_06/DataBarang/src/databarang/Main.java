package databarang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Barang> listBarang = new ArrayList();
        
        boolean status = true;
        while (status) {            
            System.out.println("1. Tambah barang");
            System.out.println("2. Lihat data barang");
            System.out.println("3. Keluar");
            
            System.out.print("\n>Pilih menu : ");
            int menu = Integer.parseInt(br.readLine());
            
            switch (menu) {
                case 1:
                    System.out.print("\nID : ");
                    String id = br.readLine();
                    System.out.print("Nama : ");
                    String nama = br.readLine();
                    System.out.print("Harga : ");
                    int harga = Integer.parseInt(br.readLine());
                    
                    // Barang barang = new Barang(id, nama, harga);
                    Barang barang = new Barang();
                    barang.setId(id);
                    barang.setNama(nama);
                    barang.setHarga(harga);
                    
                    listBarang.add(barang);
                    break;
                case 2:
                    // Cek apakah Array kosong?
                    if (listBarang.size() == 0) {
                        System.out.println("\nMaaf, daftar barang masih kosong");
                    } else {
                        System.out.println("\nData barang ");
                        
                        //Cetak data barang
                        for (int i=0; i < listBarang.size(); i++) {
                            System.out.println("\nId : "+ listBarang.get(i).getId());
                            System.out.println("Nama : "+ listBarang.get(i).getNama());
                            System.out.println("Harga : "+ listBarang.get(i).getHarga());
                        }
                    }
                    break;
                case 3:
                    status = false;
                    break;
            }
            
            System.out.println();
        }
        
        
        
    }
    
}
