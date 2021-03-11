package pbokelasii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Login user1 = new Login();
        Login user2 = new Login("", "");
        
        boolean status = true;
        while (status) {            
            // Menu
            cetakMenu();
            
            System.out.print("\n> Pilih Menu : ");
            int menu = Integer.parseInt(br.readLine());
            
            switch (menu) {
                case 1:
                    // Login
                    System.out.print("\nUsername : ");
                    String username = br.readLine();
                    System.out.print("Password : ");
                    String password = br.readLine();
                    
                    // Cek data user
                    if (username.equals(user1.getUsername()) && password.equals(user1.getPassword())) {
                        System.out.println("\n> Login berhasil");
                    } else {
                        System.out.println("\n> Maaf, login gagal");
                    }
                    break;
                case 2:
                    // Ubah password
                    System.out.print("\nPassword lama : ");
                    String old_password = br.readLine();
                    System.out.print("Password baru : ");
                    String new_password = br.readLine();
                    
                    if (old_password.equals(user1.getPassword())) {
                        user1.setPassword(new_password);
                        System.out.println("\n> Password berhasil diubah");
                    } else {
                        System.out.println("\n> Maaf, password lama tidak cocok");
                    }
                    break;
                case 3:
                    // Buat user
                    break;
                case 4:
                    // Lihat data user
                    System.out.println("\n> Data user");
                    System.out.println("User 1 [username] : " + user1.getUsername());
                    System.out.println("User 1 [password] : " + user1.getPassword());
                    System.out.println("\nUser 2 [username] : " + user2.getUsername());
                    System.out.println("User 2 [password] : " + user2.getPassword());
                    break;
                case 5:
                    // Keluar
                    // System.exit(0);
                    status = false;
                    break;
            }
        }
        
    }
    
    private static void cetakMenu() {
        System.out.println("\n+-----------------------------------+");
        System.out.println("|           MENU LOGIN              |");
        System.out.println("+-----------------------------------+");
        System.out.println("|1. Login user                      |");
        System.out.println("|2. Ubah password user              |");
        System.out.println("|3. Buat user                       |");
        System.out.println("|4. Lihat data user                 |");
        System.out.println("|5. Keluar                          |");
        System.out.println("+-----------------------------------+");
    }
    
}
