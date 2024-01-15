package Giris;
import java.util.Scanner;
public class CiftSayi {

    public static void main(String[] args) {
        int sayi;
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi gir: ");
        sayi = input.nextInt();

        for(int i = 0; i<=sayi; i++) {
            if(i%3 == 0 && i%4==0) {
                sum+=i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println("3 ve 4 'e Bölünen sayilarin ortalaması: " + sum/count);
    }
}
