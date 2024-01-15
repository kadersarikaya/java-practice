package Giris;
import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        int numCount;
        int num;
        int max = 0;
        int min = Integer.MAX_VALUE; // Min değeri en büyük integer değeri olarak başlatılır

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayi gireceksiniz?");
        numCount = input.nextInt();

        for (int i = 0; i < numCount; i++) {
            System.out.println(i + 1 + ". sayiyi girin");
            num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("En büyük " + max + " En küçük " + min);
    }
}
