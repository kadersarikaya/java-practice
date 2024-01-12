package Giris;
import java.util.Scanner;

public class UcakBiletFiyat {
    public static void main(String[] args) {
        int km, yas, yon;
        double pricePerKm = 0.10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe: ");
        km = input.nextInt();
        System.out.print("Yaş: ");
        yas = input.nextInt();
        System.out.print("Yön: ");
        yon = input.nextInt();
        double indirim = 0;
        double total = km * pricePerKm;

        if (km < 0 || yas < 0 || (yon != 1 && yon != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            switch (yas) {
                case 1:
                    if (yas < 12) {
                        total -= total * 0.5;
                    }
                    break;
                case 2:
                    if (yas >= 12 && yas <= 24) {
                        total -= total * 0.1;
                    }
                    break;
                case 3:
                    if (yas > 65) {
                        total -= total * 0.3;
                    }
                    break;
                case 4:
                    if (yon == 2) {
                        total -= total * 0.2;
                    }
                    break;
                default:
            }
            System.out.println("Total: " + total);
        }
    }
}
