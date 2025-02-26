package Week3.Code;
import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen[] arrayOfDosen = new Dosen[3];
        DataDosen dataDosen = new DataDosen();

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

        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}

