package Week5.Code;

public class NilaiUTSTertinggi {
    public static int cariMaksimumDC(int data[], int kiri, int kanan) {
        if (kiri == kanan) { 
            return data[kiri];
        }
    
        int tengah = (kiri + kanan) / 2;
        int maksimumKiri = cariMaksimumDC(data, kiri, tengah);
        int maksimumKanan = cariMaksimumDC(data, tengah + 1, kanan);
    
        return Math.max(maksimumKiri, maksimumKanan);   
    }
}
