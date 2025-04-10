package Week7.Code;
import java.util.Arrays;
import java.util.ArrayList;

public class DataDosen {
    Dosen[] daftarDosen;
    int index;

    public DataDosen(int kapasitas) {
        daftarDosen = new Dosen[kapasitas];
        index = 0;
    }

    public void tambahDosen(Dosen d) {
        if (index < daftarDosen.length) {
            daftarDosen[index++] = d;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void tampilkanSemuaDosen() {
        for (int i = 0; i < index; i++) {
            System.out.println(daftarDosen[i]);
        }
    }

    public void pencarianDataSequential(String nama) {
        ArrayList<Dosen> hasil = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            if (daftarDosen[i].Nama().equalsIgnoreCase(nama)) {
                hasil.add(daftarDosen[i]);
            }
        }

        if (hasil.isEmpty()) {
            System.out.println("Dosen dengan nama \"" + nama + "\" tidak ditemukan.");
        } else {
            for (Dosen d : hasil) {
                System.out.println("Dosen ditemukan: " + d);
            }
            if (hasil.size() > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
            }
        }
    }

    public void pencarianDataBinary(int usia) {
        Arrays.sort(daftarDosen, 0, index, (a, b) -> Integer.compare(a.Usia(), b.Usia()));
        ArrayList<Dosen> hasil = new ArrayList<>();
        int low = 0;
        int high = index - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midUsia = daftarDosen[mid].Usia();

            if (midUsia == usia) {
                hasil.add(daftarDosen[mid]);

                int kiri = mid - 1;
                while (kiri >= 0 && daftarDosen[kiri].Usia() == usia) {
                    hasil.add(daftarDosen[kiri--]);
                }

                int kanan = mid + 1;
                while (kanan < index && daftarDosen[kanan].Usia() == usia) {
                    hasil.add(daftarDosen[kanan++]);
                }

                break;
            } else if (midUsia < usia) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (hasil.isEmpty()) {
            System.out.println("Tidak ditemukan dosen dengan usia " + usia);
        } else {
            for (Dosen d : hasil) {
                System.out.println("Dosen ditemukan: " + d);
            }
            if (hasil.size() > 1) {
                System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
            }
        }
    }
}
