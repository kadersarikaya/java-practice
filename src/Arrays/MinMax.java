package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizi oluşturma
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        // Kullanıcıdan sayı girişi alma
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        // Girilen sayıdan küçük en yakın sayıyı bulma
        int enYakinKucuk = bulEnYakinKucuk(dizi, girilenSayi);

        // Girilen sayıdan büyük en yakın sayıyı bulma
        int enYakinBuyuk = bulEnYakinBuyuk(dizi, girilenSayi);

        // Sonuçları ekrana yazdırma
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
    }

    // Girilen sayıdan küçük en yakın sayıyı bulan fonksiyon
    private static int bulEnYakinKucuk(int[] dizi, int sayi) {
        int enYakinKucuk = Integer.MIN_VALUE;

        for (int eleman : dizi) {
            if (eleman < sayi && eleman > enYakinKucuk) {
                enYakinKucuk = eleman;
            }
        }

        return enYakinKucuk;
    }

    // Girilen sayıdan büyük en yakın sayıyı bulan fonksiyon
    private static int bulEnYakinBuyuk(int[] dizi, int sayi) {
        int enYakinBuyuk = Integer.MAX_VALUE;

        for (int eleman : dizi) {
            if (eleman > sayi && eleman < enYakinBuyuk) {
                enYakinBuyuk = eleman;
            }
        }

        return enYakinBuyuk;
    }
}
