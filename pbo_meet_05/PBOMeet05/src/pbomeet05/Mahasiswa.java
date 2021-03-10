package pbomeet05;

public class Mahasiswa {
    // Atribut
    private String npm = "";
    private String nama = "";
    private int nilai = 75;
    
    // Setter
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public void setNama (String nama) {
        this.nama = nama;
    }
    
    public void setNilai (int nilai) {
        this.nilai = nilai;
    }
    
    // Getter
    public String getNpm () {
        return this.npm;
    }
    
    public String getNama () {
        return this.nama;
    }
    
    public int getNilai () {
        return this.nilai;
    }
    
    // Grade nilai
    public String gradeNilai () {
        int n = this.nilai;
        String grade = "Nilai tidak valid";
        
        if (n > 80 && n <= 100) grade = "A";
        else if (n > 60 && n <= 80) grade = "B";
        else if (n > 40 && n <= 60) grade = "C";
        else if (n > 20 && n <= 40) grade = "D";
        else if (n >= 0 && n <= 20) grade = "E";
        
        return grade;
    }
}
