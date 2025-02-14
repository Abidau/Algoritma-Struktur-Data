import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] sks = {2,2,3,2,2,2,3,2};
        int[] angkaMk = new int[namaMk.length];
        String[] hurufMk = new String[namaMk.length];
        double[] bobotMk = new double[namaMk.length];

        double totalBobotSKS = 0;
        int totalSKS = 0; 

        for (int i = 0; i < namaMk.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMk[i] + " : ");
            angkaMk[i] = sc.nextInt();

            if (angkaMk[i] > 80 && angkaMk[i] <= 100) {
                hurufMk[i] = "A";
                bobotMk[i] = 4.00;
            } else if (angkaMk[i] > 73 && angkaMk[i] <= 80) {
                hurufMk[i] = "B+";
                bobotMk[i] = 3.50;
            } else if (angkaMk[i] > 65 && angkaMk[i] <= 73) {
                hurufMk[i] = "B";
                bobotMk[i] = 3.00;
            } else if (angkaMk[i] > 60 && angkaMk[i] <= 65) {
                hurufMk[i] = "C+";
                bobotMk[i] = 2.50;
            } else if (angkaMk[i] > 50 && angkaMk[i] <= 60) {
                hurufMk[i] = "C";
                bobotMk[i] = 2.00;
            } else if (angkaMk[i] > 39 && angkaMk[i] <= 50) {
                hurufMk[i] = "D";
                bobotMk[i] = 1.00;
            } else {
                hurufMk[i] = "E";
                bobotMk[i] = 0;
            }
            totalBobotSKS += bobotMk[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");

        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < namaMk.length; i++) {
            System.out.printf("%-40s%-20d%-20s%-20.2f\n", namaMk[i], angkaMk[i], hurufMk[i], bobotMk[i]);
        }

        System.out.println("=================================");
        double ipSemester = totalBobotSKS / totalSKS;
        System.out.println("IP Semester : " + ipSemester);
        System.out.println("=================================");

        sc.close();
    }
}

