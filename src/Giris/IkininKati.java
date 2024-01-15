package Giris;
import java.util.Scanner;

public class IkininKati {
    public static void main(String[] args) {
        int n;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kaça kadar");
        n = girdi.nextInt();

        for(int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        for(int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}
