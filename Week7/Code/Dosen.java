package Week7.Code;

public class Dosen {
    String nama;
    int usia;

    public Dosen(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String Nama() {
        return nama;
    }

    public int Usia() {
        return usia;
    }

    public String toString() {
        return "Nama: " + nama + ", Usia: " + usia;
    }
}
