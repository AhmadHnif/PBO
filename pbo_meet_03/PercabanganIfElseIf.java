import java.util.Scanner;

public class PercabanganIfElseIf {
    public static void main(String[] args) {
        // Instansiasi class Scanner
        Scanner sc = new Scanner(System.in);

        double nilai;
        String grade = "Nilai tidak dalam jangkauan";

        System.out.print("Input nilai : ");
        nilai = sc.nextDouble();

        if (nilai > 80 && nilai <= 100) grade = "A";
        else if (nilai > 60 && nilai <= 80) grade = "B";
        else if (nilai > 40 && nilai <= 60) grade = "C";
        else if (nilai > 20 && nilai <= 40) grade = "D";
        else if (nilai >= 0 && nilai <= 20) grade = "E";

        System.out.println("Nilai = " + nilai);
        System.out.println("Grade nilai : " + grade);

        sc.close();
    }
}
