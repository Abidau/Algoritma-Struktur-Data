package Week3.Code;

public class DataDosen {

    public void dataSemuaDosen(Dosen[] arrayOfDosen) {
        for (Dosen dosen : arrayOfDosen) {
            System.out.println("Kode: " + dosen.kode);
            System.out.println("Nama: " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia: " + dosen.usia);
            System.out.println("------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
        System.out.println("------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }
        System.out.println("Rata-rata Usia Dosen Pria: " + (countPria > 0 ? (double) totalUsiaPria / countPria : 0));
        System.out.println("Rata-rata Usia Dosen Wanita: " + (countWanita > 0 ? (double) totalUsiaWanita / countWanita : 0));
        System.out.println("------------------------");
    }

    public void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen dosenTertua = arrayOfDosen[0];
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode: " + dosenTertua.kode);
        System.out.println("Nama: " + dosenTertua.nama);
        System.out.println("Usia: " + dosenTertua.usia);
        System.out.println("------------------------");
    }

    public void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen dosenTermuda = arrayOfDosen[0];
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode: " + dosenTermuda.kode);
        System.out.println("Nama: " + dosenTermuda.nama);
        System.out.println("Usia: " + dosenTermuda.usia);
        System.out.println("------------------------");
    }
}


