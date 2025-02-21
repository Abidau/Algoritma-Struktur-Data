package Week2.Code;
public class MahasiswaMain {
    public static void main(String[] args) {
      
        Mahasiswa mhs1 = new Mahasiswa();
        
        mhs1.nim = "244107020212";
        mhs1.nama = "Naufal Abid Aurizky";
        mhs1.kelas = "TI-1H";
        mhs1.ipk = 3.56;

        mhs1.tampilkanInformasi();
        
        mhs1.ubahKelas("TI-1B");
        
        mhs1.updateIpk(3.70);
        
        String kinerja = mhs1.nilaiKinerja(mhs1.ipk);
        System.out.println("Nilai Kinerja: " + kinerja);
    }
}