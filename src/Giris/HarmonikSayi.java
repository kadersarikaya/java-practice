package Giris;
import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sayisini girin ");
        int n = scanner.nextInt();
        double result=0;
        for(double i=1; i<=n; i++) {
            result+=(1/i);
        }
        System.out.println(result);
    }
}
