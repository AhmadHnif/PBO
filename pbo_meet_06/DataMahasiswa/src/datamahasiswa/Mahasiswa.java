
package datamahasiswa;

public class Mahasiswa {
    // Atribut
    private String npm;
    private String nama;
    private String kota;

    // Constractor
    public Mahasiswa() {
    }

    public Mahasiswa(String npm, String nama, String kota) {
        this.npm = npm;
        this.nama = nama;
        this.kota = kota;
    }
    
    // Setter
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public void setNama (String nama) {
        this.nama = nama;
    }
    
    public void setKota(String kota) {
        this.kota = kota;
    }
    
    // Getter
    public String getNpm () {
        return this.npm;
    }
    
    public String getNama () {
        return this.nama;
    }
    
    public String getKota () {
        return this.kota;
    }
    
}

