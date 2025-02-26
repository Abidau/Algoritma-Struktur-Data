package Week3.Code;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];
        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "244107020212";
        arrayOfMahasiswa[0].nama = "Naufal Abid Aurizky";
        arrayOfMahasiswa[0].kelas = "TI-1H";
        arrayOfMahasiswa[0].ipk = (float) 3.56;

        arrayOfMahasiswa[1] = new Mahasiswa();
        arrayOfMahasiswa[1].nim = "244107020221";
        arrayOfMahasiswa[1].nama = "Shafiqa Nabila Maharani K";
        arrayOfMahasiswa[1].kelas = "TI-1B";
        arrayOfMahasiswa[1].ipk = (float) 3.99;

        arrayOfMahasiswa[2] = new Mahasiswa();    
        arrayOfMahasiswa[2].nim = "244107020222";
        arrayOfMahasiswa[2].nama = "finatika";
        arrayOfMahasiswa[2].kelas = "TI-1I";
        arrayOfMahasiswa[2].ipk = (float) 4.00;
    
        System.out.println("===============================");
        System.out.println("NIM            : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama           : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas          : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK            : " + arrayOfMahasiswa[0].ipk);
        System.out.println("===============================");
        System.out.println("NIM            : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama           : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas          : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK            : " + arrayOfMahasiswa[1].ipk);
        System.out.println("===============================");
        System.out.println("NIM            : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama           : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas          : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK            : " + arrayOfMahasiswa[2].ipk);
        System.out.println("===============================");
    }
}

