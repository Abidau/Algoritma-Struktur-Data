package Week3.Code;

public class Matakuliah {
    public String Kode;
    public String Nama;
    public int SKS;
    public int JumlahJam;

    public Matakuliah(String Kode, String Nama, int SKS, int JumlahJam) {
        this.Kode = Kode;
        this.Nama = Nama;
        this.SKS = SKS;
        this.JumlahJam = JumlahJam;
    }

    // Pertanyaan No.2
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.Kode = kode;
        this.Nama = nama;
        this.SKS = sks;
        this.JumlahJam = jumlahJam;
    }

    // Pertanyaan No.3
    public void cetakInfo() {
        System.out.println("Kode       : " + Kode);
        System.out.println("Nama       : " + Nama);
        System.out.println("SKS        : " + SKS);
        System.out.println("Jumlah Jam : " + JumlahJam);
        System.out.println("------------------------");
    }
}
