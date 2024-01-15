package Giris;
import java.util.Scanner;

public class Dongu {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do  {
            System.out.println("Sayı girin: ");
            n = input.nextInt();

            if(n%4==0) {
                total+=n;
            }
        }while (n%2==0);
        System.out.println("Toplam: " + total);

    }
}
