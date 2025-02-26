package Week3.Code;
import java.util.Scanner;
public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matakuliah[] arrayOfMatakuliah = new Matakuliah[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode    : ");
            kode = sc.nextLine();
            System.out.print("Nama    : ");
            nama = sc.nextLine();
            System.out.print("SKS     : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------");

            // Pertanyaan No.2
            arrayOfMatakuliah[i] = new Matakuliah("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);

            // arrayOfMatakuliah[i] = new Matakuliah(kode, nama, sks, jumlahJam);
        }

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Data Mata Kuliah ke-" + (i + 1));
        //     System.out.println("Kode    : " + arrayOfMatakuliah[i].Kode);
        //     System.out.println("Nama    : " + arrayOfMatakuliah[i].Nama);
        //     System.out.println("SKS     : " + arrayOfMatakuliah[i].SKS);
        //     System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].JumlahJam);
        //     System.out.println("------------------------");
        // }

        // Pertanyaan No.3
        for (int i = 0; i < 3; i++) {
            arrayOfMatakuliah[i].cetakInfo();
        }
        sc.close();
    }
}
