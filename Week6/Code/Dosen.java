package Week6.Code;

class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    Dosen(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + ", Usia: " + usia);
    }
}