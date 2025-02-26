package Week3.Code;
import java.util.Scanner;

public class MatakuliahDemoMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------------");
        
        Matakuliah[] arrayOfMatakuliah = new Matakuliah[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode    : ");
            String kode = sc.nextLine();
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("SKS     : ");
            int sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam : ");
            int jumlahJam = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------");

            arrayOfMatakuliah[i] = new Matakuliah(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo(); 
        }
        sc.close();
    }
}