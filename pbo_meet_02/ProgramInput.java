
// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class ProgramInput {

    public static void main(String[] args) throws IOException {
        // Instansiasi class Scanner
        // Scanner sc = new Scanner(System.in);
        // Instansiasi class BufferedReader -> input betipe String (perlu parsing ke
        // tipe data sesuai variabel)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variabel
        String nama;
        int umur;
        double tinggiBadan;

        System.out.print("INput nama : ");
        // nama = sc.next();
        nama = br.readLine();

        System.out.print("Input umur : ");
        // umur = sc.nextInt();
        // umur = Integer.parseInt(br.readLine());
        umur = Integer.parseInt(JOptionPane.showInputDialog("Umur"));

        System.out.print("Input tinggi badan : ");
        // tinggiBadan = sc.nextDouble();
        tinggiBadan = Double.parseDouble(br.readLine());

        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi badan : " + tinggiBadan);
    }
}
