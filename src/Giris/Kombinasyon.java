package Giris;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n'i giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r'i giriniz: ");
        int r = scanner.nextInt();

        if (n < r) {
            System.out.println("Hatalı giriş! n, r'den küçük olmalıdır.");
        } else {
            int sonuc = kombinasyon(n, r);
            System.out.println("C(" + n + ", " + r + ") = " + sonuc);
        }

        scanner.close();
    }
    static int faktoriyel(int sayi) {
        int result = 1;

        for(int i=1; i<=sayi; i++) {
            result*=i;
        }
        return result;
    }
    static int kombinasyon(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }
}
