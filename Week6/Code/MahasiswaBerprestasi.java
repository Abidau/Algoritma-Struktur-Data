package Week6.Code;

public class MahasiswaBerprestasi {
    Mahasiswa [] lisMhs = new Mahasiswa[5];
    int idx;

    void tambah (Mahasiswa m) {
        if (idx < lisMhs.length) {
            lisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilkan() {
        for (Mahasiswa m : lisMhs) {
            m.tampilkanInformasi();
            System.out.println("------------------------");
        }
    }



    void bubbleSort() {
        for (int i = 0; i < lisMhs.length - 1; i++) {
            for (int j = 1; j < lisMhs.length - i; j++) {
                if (lisMhs[j].ipk > lisMhs[j - 1].ipk) {
                    Mahasiswa tmp = lisMhs[j];
                    lisMhs[j] = lisMhs[j - 1];
                    lisMhs[j - 1] = tmp;
                }
            }
        }
    }

    void SelectionSort() {
        for (int i = 0; i < lisMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < lisMhs.length; j++) {
                if (lisMhs[j].ipk < lisMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = lisMhs[idxMin];
            lisMhs[idxMin] = lisMhs[i];
            lisMhs[i] = tmp;
        }
    }

    // void insertionSort() {
    //     for (int i = 1; i < lisMhs.length; i++) {
    //         Mahasiswa temp = lisMhs[i];
    //         int j = i;
    //         while (j > 0 && lisMhs[j-1].ipk > temp.ipk) {
    //             lisMhs[j] = lisMhs[j-1];
    //             j--;
    //         }
    //         lisMhs[j] = temp;
    //     }
    // }

    //Tugas 5.4.3 Pertanyaan No.1
    void insertionSort() {
        for (int i = 1; i < lisMhs.length; i++) {
            Mahasiswa temp = lisMhs[i];
            int j = i;
            while (j > 0 && lisMhs[j-1].ipk < temp.ipk) { // Perubahan di sini
                lisMhs[j] = lisMhs[j-1];
                j--;
            }
            lisMhs[j] = temp;
        }
    }
    
}
