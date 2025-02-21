package Week2.Code;
public class MataKuliahMain {
    public static void main(String[] args) {
        
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "MK001";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 42;
        mk1.tampilInformasi();

        MataKuliah mk2 = new MataKuliah("MK002", "Struktur Data", 4, 56);
        mk2.tampilInformasi();

        mk2.ubahSKS(5);
        
        mk2.tambahJam(10);
        mk2.kurangiJam(5);
        mk2.kurangiJam(70); 
    }
}