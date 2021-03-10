public class PercabanganIfElse {
    public static void main(String[] args) {
        int nilai = 0;
        System.out.println("Nilai = " + nilai);

        // Cek: apakah termasuk bilangan positif
        if (nilai % 2 == 0) {
            System.out.println(nilai + " % 2 = " + (nilai % 2));
            System.out.println("Bilangan ini adalah bilangan Genap");
        } else {
            System.out.println(nilai + " % 2 = " + (nilai % 2));
            System.out.println("Ini adalah bilangan Ganjil");
        }

        System.out.println("\nIni kode diluar IF");
    }
}
