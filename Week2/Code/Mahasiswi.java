package Week2.Code;
public class Mahasiswi {
   
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswi() {
        this.nim = "";
        this.nama = "";
        this.kelas = "";
        this.ipk = 0.0;
    }

    public Mahasiswi(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
        System.out.println("Kelas telah diubah menjadi: " + kelas);
    }

    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
        System.out.println("IPK telah diperbarui menjadi: " + ipk);
    }

    public String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.0) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
}