import java.util.Scanner;

public class PercabanganSwitch {
    public static void main(String[] args) {
        // Instansiasi class Scanner
        Scanner sc = new Scanner(System.in);
        
        int nomorHari;
        System.out.print("Input nomor hari : ");
        nomorHari = sc.nextInt();

        switch (nomorHari) {
            case 1:
                System.out.println("Hari ke-" + nomorHari + " adalah Senin");
                break;
            case 2:
                System.out.println("Hari ke-" + nomorHari + " adalah Selasa");
                break;
            default:
                System.out.println("Hari tidak ada");
                break;
        }

        System.out.println("Ini diluar Switch");

        sc.close();
    }
}
