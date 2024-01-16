package Giris;
import java.util.Scanner;

public class BasNumbber {
    public static void main(String[] args) {
        int num;
        int sum=0;
        int kalan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı girin: ");
        num = scanner.nextInt();
        while(num!=0) {
            kalan = num%10;
            num/=10;
            sum+=kalan;
        }
        System.out.println("Basamakları Toplamı: " + sum);
    }
}
