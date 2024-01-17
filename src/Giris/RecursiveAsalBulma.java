package Giris;
import java.util.Scanner;

public class RecursiveAsalBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();

        if (isAsal(num, 2)) {
            System.out.println(num + " bir asal sayıdır.");
        } else {
            System.out.println(num + " bir asal sayı değildir.");
        }

        scanner.close();
    }

    // Recursive olarak asal sayı kontrolü
    static boolean isAsal(int sayi, int bolen) {
        if (sayi <= 1) {
            return false;
        }

        if (bolen > Math.sqrt(sayi)) {
            return true;
        }

        if (sayi % bolen == 0) {
            return false;
        }

        return isAsal(sayi, bolen + 1);
    }
}


