package kelaspbo;

public class Hewan {
    private String nama;
    private String gerak;
    private int jumlahKaki;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGerak() {
        return gerak;
    }

    public void setGerak(String gerak) {
        this.gerak = gerak;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
        
    public void jenis (String jns) {
        System.out.println("Jenis : " + jns);
    }
}
