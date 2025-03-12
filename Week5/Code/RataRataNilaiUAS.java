package Week5.Code;

public class RataRataNilaiUAS {
    public static double hitungRataRataBF(int data[]) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return (double) total / data.length;
    }
}
