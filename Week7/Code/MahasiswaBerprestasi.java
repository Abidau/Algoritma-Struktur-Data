package Week7.Code;

public class MahasiswaBerprestasi {
    Mahasiswa[] listMhs = new Mahasiswa[5]; 
    int idx = 0;

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" + x + " ada di posisi ke-" + pos);
        } else {
            System.out.println("data mahasiswa dengan IPK :" + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
        } else {
            System.out.println("data mahasiswa dengan IPK :" + x + " tidak ditemukan");
        }
    }

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh.");
        }
    }
    
    void tampil() {
        for (Mahasiswa m : listMhs) {
            if (m != null) {
                m.tampilkanInformasi();
                System.out.println("--------------------");
            }
        }
    }
}


    