import java.io.BufferedReader;
import java.util.Scanner;

public class ProgramSederhana {

    // Variabel class
    int a;
    static boolean lulus = true;

    // Variabel instance
    BufferedReader br;

    public static void main(String[] args) {

        // Variabel instance
        Scanner sc = new Scanner(System.in);
        HelloWorld hello = new HelloWorld();

        hello.cetakHello();

        // Variabel lokal
        char jenisKelamin = 'L';

        System.out.println(jenisKelamin);
        System.out.println(lulus);
        kelasDua();
    }

    static void kelasDua() {
        System.out.println(lulus);
    }
}
