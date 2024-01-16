package Giris;
import java.util.Scanner;

public class ElmasYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini giriniz: ");
        int yukseklik = scanner.nextInt();

        if (yukseklik % 2 == 0) {
            System.out.println("Hatalı giriş! Yükseklik tek olmalıdır.");
            return;
        }

        int yarimYukseklik = yukseklik / 2;

        // Üst kısmı oluşturma
        for (int i = 0; i <= yarimYukseklik; i++) {
            for (int j = 0; j < yarimYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı oluşturma
        for (int i = yarimYukseklik - 1; i >= 0; i--) {
            for (int j = 0; j < yarimYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
