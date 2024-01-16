package Giris;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi girin");
        int num = input.nextInt();
        int sum = 0;
        for(int i=1; i<num; i++) {
            if(num%i==0) {
//                System.out.println(i);
                sum+=i;
//                System.out.println(sum);
            }
        }
        if(sum == num) {
            System.out.println("Mükemmel sayi");
        }
        else {
            System.out.println("Mükemmel sayi değil");
        }
    }
}
