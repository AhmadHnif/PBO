import java.util.ArrayList;
import java.util.Scanner;

public class PerulanganFor {
    public static void main(String[] args) {
        // Instansiasi class Scanner
        Scanner sc = new Scanner(System.in);
        
        // int[] arrData = {12, 21, 7, 6};
        ArrayList<Integer> listdata = new ArrayList<>();

        String lanjut = "y";
        
        while (lanjut.equalsIgnoreCase("y")) {
            System.out.print("Masukkan data : ");
            listdata.add(sc.nextInt());

            System.out.print("\nLagi? ");
            lanjut = sc.next();
        }

        // For biasa
        for (int i=0; i < listdata.size(); i++) {
            System.out.println("listData[" + i + "] : " + listdata.get(i));
        }

        // For-Each
        for (int data: listdata) {
            System.out.println(data);
        }
        
    }
}
