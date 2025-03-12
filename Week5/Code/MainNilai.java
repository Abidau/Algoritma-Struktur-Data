package Week5.Code;
import java.util.Scanner;

public class MainNilai {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = masukan.nextInt();
        int nilaiUTS[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai UTS mahasiswa ke-" + (i + 1) + ": ");
            nilaiUTS[i] = masukan.nextInt();
        }

        int maksimum = NilaiUTSTertinggi.cariMaksimumDC(nilaiUTS, 0, jumlah - 1);
        int minimum = NilaiUTSTerendah.cariMinimumDC(nilaiUTS, 0, jumlah - 1);
        double rataRata = RataRataNilaiUAS.hitungRataRataBF(nilaiUTS);

        System.out.println("Nilai UTS tertinggi: " + maksimum);
        System.out.println("Nilai UTS terendah: " + minimum);
        System.out.println("Rata-rata nilai UAS: " + rataRata);

        masukan.close();
    }
}
