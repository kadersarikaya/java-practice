package Arrays;
import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();

        // Dizi oluşturma
        double[] dizi = new double[n];

        // Dizi elemanlarını kullanıcıdan alma
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            dizi[i] = scanner.nextDouble();
        }

        // Harmonik ortalama hesaplama
        double harmonikOrtalama = hesaplaHarmonikOrtalama(dizi);

        // Sonucu ekrana yazdırma
        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }

    // Harmonik ortalama hesaplayan fonksiyon
    private static double hesaplaHarmonikOrtalama(double[] dizi) {
        double toplam = 0;

        // Harmonik seriyi hesaplama
        for (int i = 0; i < dizi.length; i++) {
            toplam += 1 / dizi[i];
        }

        // Harmonik ortalama hesaplama
        return dizi.length / toplam;
    }
}
