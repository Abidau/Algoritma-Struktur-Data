package Week2.Code;
public class MahasiswiMain {
    public static void main(String[] args) {
        
        Mahasiswi mhs1 = new Mahasiswi();
        
        mhs1.nim = "244107020212";
        mhs1.nama = "Naufal Abid Aurizky";
        mhs1.kelas = "TI-1H";
        mhs1.ipk = 3.56;

        mhs1.tampilkanInformasi();
        
        mhs1.ubahKelas("TI-1B");
        
        mhs1.updateIpk(3.70);
        
        String kinerja = mhs1.nilaiKinerja(mhs1.ipk);
        System.out.println("Nilai Kinerja: " + kinerja);

        Mahasiswi mhs2 = new Mahasiswi("244107020221", "Shafiqa Nabila Maharani K", "TI-1B", 3.99);
        
        mhs2.tampilkanInformasi();
        
        String kinerjaMhs2 = mhs2.nilaiKinerja(mhs2.ipk);
        System.out.println("Nilai Kinerja Mhs2: " + kinerjaMhs2);
    }
}