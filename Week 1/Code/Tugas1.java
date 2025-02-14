import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};
        
        System.out.print("Masukkan kode plat nomor: ");
        char kode = input.next().charAt(0);
        input.close();
        
        int idx = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                idx = i;
                break;
            }
        }
        
        if (idx != -1) {
            System.out.println("Kota " + kode + " adalah " + KOTA[idx]);
        } else {
            System.out.println("Kode plat tidak ditemukan");
        }
    }
}

