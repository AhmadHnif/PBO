package pbomeet05;

public class Buku {
    private String kode_buku, judul, penulis, id_penerbit, id_kategori, tahun;
    private int harga, stok;

    public Buku() {
    }

    public Buku(String kode_buku, String judul, String penulis, String id_penerbit, String id_kategori, String tahun, int harga, int stok) {
        this.kode_buku = kode_buku;
        this.judul = judul;
        this.penulis = penulis;
        this.id_penerbit = id_penerbit;
        this.id_kategori = id_kategori;
        this.tahun = tahun;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(String kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getId_penerbit() {
        return id_penerbit;
    }

    public void setId_penerbit(String id_penerbit) {
        this.id_penerbit = id_penerbit;
    }

    public String getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(String id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
}
