package Week6.Code;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas Mahasiswa: ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK Mahasiswa: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa m = new Mahasiswa(nim, nama, kelas, ipk);
            list.tambah(m);
            
            // MahasiswaBerprestasi list = new MahasiswaBerprestasi();
    
            // Mahasiswa m1 = new Mahasiswa("A", "Budi", "TI", 3.5);
            // Mahasiswa m2 = new Mahasiswa("B", "Andi", "TI", 3.0);
            // Mahasiswa m3 = new Mahasiswa("C", "Cici", "TI", 2.5);
            // Mahasiswa m4 = new Mahasiswa("D", "Dedi", "TI", 4.0);
            // Mahasiswa m5 = new Mahasiswa("E", "Eka", "TI", 3.5);
    
            // list.tambah(m1);
            // list.tambah(m2);
            // list.tambah(m3);
            // list.tambah(m4);
            // list.tambah(m5);
    
    
            System.out.println("Data Mahasiswa Belum Sorting");
            list.tampilkan();
    
            System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC)");
            list.bubbleSort();
            list.tampilkan();
    
            System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
            list.SelectionSort();
            list.tampilkan();
    
            System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
            list.insertionSort();
            list.tampilkan();
    
            sc.close();
        }
    }
}
