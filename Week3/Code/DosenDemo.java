package Week3.Code;
import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen[] arrayOfDosen = new Dosen[3];

        for (int i = 0; i < 3; i++) {
            arrayOfDosen[i] = new Dosen();

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama                : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            String jenisKelamin = sc.nextLine();
            arrayOfDosen[i].jenisKelamin = jenisKelamin.equals("L");
            System.out.print("Usia                : ");
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("------------------------");
        }
        sc.close();
    }
}
