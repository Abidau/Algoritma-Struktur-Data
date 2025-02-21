package Week2.Code;
public class DosenMain {
    public static void main(String[] args) {
       
        Dosen dosen1 = new Dosen();
        dosen1.idDosen = "N29L";
        dosen1.nama = "Dr. Naufal Abid";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Ilmu Komputer";
        dosen1.tampilInformasi();

        Dosen dosen2 = new Dosen("F16A", "Dr. Shafiqa Nabila M", false, 2012, "Matematika");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(true);
        
        int masaKerja = dosen2.hitungMasaKerja(2023);
        System.out.println("Masa kerja Dosen 2: " + masaKerja + " tahun");

        dosen2.ubahKeahlian("Statistika");
    }
}