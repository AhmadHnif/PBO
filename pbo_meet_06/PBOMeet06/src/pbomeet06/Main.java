package pbomeet06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Instansiasi objek class Login()
        Login user1 = new Login();
        Login user2 = new Login("", "");
        
        boolean status = true;
        while (status) {            
            // Menu
            cetakMenu();
            
            // Input pilih menu
            System.out.print("\nPilih menu : ");
            int menu = Integer.parseInt(br.readLine());
            
            // Proses + output
            switch (menu) {
                case 1:
                    // LOGIN
                    // Input username dan password
                    System.out.print("\nUsername : ");
                    String username = br.readLine();
                    System.out.print("Password : ");
                    String password = br.readLine();
                    
                    // Pengecekan
                    if (username.equals(user1.getUsername()) && password.equals(user1.getPassword())) {
                        System.out.println("\n> Anda berhasil login");
                    } else {
                        System.out.println("\n> Maaf, username dan password tidak cocok");
                    }
                    break;
                case 2:
                    // UBAH PASSWORD
                    // Input password lama dan password baru
                    System.out.print("\nPassword lama : ");
                    String old_password = br.readLine();
                    System.out.print("Password baru : ");
                    String new_password = br.readLine();
                    
                    // Cek: apakah password lama = yang ada di class Login
                    if (old_password.equals(user1.getPassword())) {
                        // set password dengan password baru
                        user1.setPassword(new_password);
                        System.out.println("\n> Password berhasil diubah");
                    } else {
                        System.out.println("\n> Maaf, password tidak cocok");
                    }
                    break;
                case 3:
                    // BUAT USER
                    break;
                case 4:
                    // LIHAT DATA USER
                    System.out.println("\nUser 1 [username] : " + user1.getUsername());
                    System.out.println("User 1 [password] : " + user1.getPassword());
                    
                    System.out.println("\nUser 2 [username] : " + user2.getUsername());
                    System.out.println("User 2 [password] : " + user2.getPassword());
                    
                    break;
                case 5:
                    status = false;
                    System.out.println("\n> Anda keluar sistem");
                    break;
            }
        }
        
    }
    
    private static void cetakMenu() {
        System.out.println("\n+-------------------------------------+");
        System.out.println("|           MENU LOGIN                |");
        System.out.println("+-------------------------------------+");
        System.out.println("| 1. Login                            |");
        System.out.println("| 2. Ubah password                    |");
        System.out.println("| 3. Buat user                        |");
        System.out.println("| 4. Lihat data user                  |");
        System.out.println("| 5. Keluar                           |");
        System.out.println("+-------------------------------------+");
    }
    
}
