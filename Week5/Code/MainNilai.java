package Week5.Code;
import java.util.Scanner;

public class MainNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            sc.close();
            return;
        }

        String nama[] = new String[jumlah];
        String nim[] = new String[jumlah];
        int tahunMasuk[] = new int[jumlah];
        int nilaiUTS[] = new int[jumlah];
        int nilaiUAS[] = new int[jumlah];

        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan Nama Mahasiswa: ");
            nama[i] = sc.nextLine();

            System.out.print("Masukkan NIM Mahasiswa: ");
            nim[i] = sc.next();

            System.out.print("Masukkan Tahun Masuk Mahasiswa: ");
            tahunMasuk[i] = sc.nextInt();

            System.out.print("Masukkan nilai UTS mahasiswa: ");
            nilaiUTS[i] = sc.nextInt();

            System.out.print("Masukkan nilai UAS mahasiswa: ");
            nilaiUAS[i] = sc.nextInt();

            System.out.println();
            sc.nextLine();
        }

        int maksimum = NilaiUTSTertinggi.cariMaksimumDC(nilaiUTS, 0, jumlah - 1);
        int minimum = NilaiUTSTerendah.cariMinimumDC(nilaiUTS, 0, jumlah - 1);
        double rataRata = RataRataNilaiUAS.hitungRataRataBF(nilaiUTS);

        int indeksMaks = -1, indeksMin = -1;
        for (int i = 0; i < jumlah; i++) {
            if (nilaiUTS[i] == maksimum) {
                indeksMaks = i;
            }
            if (nilaiUTS[i] == minimum) {
                indeksMin = i;
            }
        }

        System.out.println();
        System.out.println("Mahasiswa dengan nilai UTS tertinggi");
        System.out.println("Nilai UTS tertinggi: " + maksimum);
        System.out.println("Nama: " + nama[indeksMaks]);
        System.out.println("NIM: " + nim[indeksMaks]);
        System.out.println("Tahun Masuk: " + tahunMasuk[indeksMaks]);

        System.out.println();
        System.out.println("Mahasiswa dengan nilai UTS terendah");
        System.out.println("Nilai UTS terendah: " + minimum);
        System.out.println("Nama: " + nama[indeksMin]);
        System.out.println("NIM: " + nim[indeksMin]);
        System.out.println("Tahun Masuk: " + tahunMasuk[indeksMin]);

        System.out.println();
        System.out.println("\nRata-rata nilai UAS: " + rataRata);

        sc.close();
    }
}

