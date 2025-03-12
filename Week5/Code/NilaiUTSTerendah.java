package Week5.Code;

public class NilaiUTSTerendah {
    public static int cariMinimumDC(int data[], int kiri, int kanan) {
        if (kiri == kanan) { 
            return data[kiri];
        }

        int tengah = (kiri + kanan) / 2;
        int minimumKiri = cariMinimumDC(data, kiri, tengah);
        int minimumKanan = cariMinimumDC(data, tengah + 1, kanan);

        return Math.min(minimumKiri, minimumKanan);
    }
}
