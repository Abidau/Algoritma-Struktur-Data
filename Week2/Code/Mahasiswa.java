package Week2.Code;
public class Mahasiswa {
   
    String nim;
    String nama;
    String kelas;
    double ipk;

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

    // Tugas No.4
    // public void updateIpk(double ipkBaru) {
    //     if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
    //         this.ipk = ipkBaru;
    //         System.out.println("IPK telah diperbarui menjadi: " + ipk);
    //     } else {
    //         System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    //     }
    // }

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