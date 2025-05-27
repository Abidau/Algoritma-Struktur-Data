package Week12.Code;
import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah di index tertentu");
            System.out.println("8. Hapus setelah NIM tertentu");
            System.out.println("9. Hapus di index tertentu");
            System.out.println("10. Tampilkan data pertama");
            System.out.println("11. Tampilkan data terakhir");
            System.out.println("12. Tampilkan data pada index tertentu");
            System.out.println("13. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1: {
                    Mahasiswa01 mhs = inputMahasiswa(sc);
                    list.addFirst(mhs);
                    break;
                }
                case 2: {
                    Mahasiswa01 mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                    break;
                }
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6: {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node01 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Mahasiswa ditemukan");
                        found.data.tampil();
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                }
                case 7: {
                    Mahasiswa01 mhs = inputMahasiswa(sc);
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    list.add(mhs, index);
                    break;
                }
                case 8: {
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    list.removeAfter(nim);
                    break;
                }
                case 9: {
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    list.remove(index);
                    break;
                }
                case 10: {
                    Mahasiswa01 mhs = list.getFirst();
                    if (mhs != null) mhs.tampil();
                    else System.out.println("Data kosong.");
                    break;
                }
                case 11: {
                    Mahasiswa01 mhs = list.getLast();
                    if (mhs != null) mhs.tampil();
                    else System.out.println("Data kosong.");
                    break;
                }
                case 12: {
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa01 mhs = list.get(index);
                    if (mhs != null) mhs.tampil();
                    else System.out.println("Data tidak ditemukan.");
                    break;
                }
                case 13: {
                    System.out.println("Jumlah data dalam list: " + list.size());
                    break;
                }
                case 0:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }

    public static Mahasiswa01 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}
