package Giris;
import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int num;
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("sayi gir");
        num = input.nextInt();

        for(int i=1; i<=num; i++) {
            result*=i;
        }
        System.out.println(num + "'un Faktöriyeli " + result);
    }
}
