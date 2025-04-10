package Week7.Code;

import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen(10);

        data.tambahDosen(new Dosen("Naufal", 40));
        data.tambahDosen(new Dosen("Fika", 39));
        data.tambahDosen(new Dosen("Fina", 25));
        data.tambahDosen(new Dosen("Fila", 15));
        data.tambahDosen(new Dosen("Fira", 5));

        System.out.println("=== DATA DOSEN ===");
        data.tampilkanSemuaDosen();

        System.out.println("\n=== PENCARIAN DATA DOSEN ===");
        System.out.print("Pilih jenis pencarian (nama/usia): ");
        String jenis = sc.nextLine().toLowerCase();

        if (jenis.equals("nama")) {
            System.out.print("Masukkan nama dosen yang ingin dicari: ");
            String nama = sc.nextLine();
            data.pencarianDataSequential(nama);
        } else if (jenis.equals("usia")) {
            System.out.print("Masukkan usia dosen yang ingin dicari: ");
            int usia = sc.nextInt();
            data.pencarianDataBinary(usia);
        } else {
            System.out.println("Jenis pencarian tidak valid.");
        }

        sc.close();
    }
}

