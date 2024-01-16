package Giris;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayisisni gir: ");
        int n1 = input.nextInt();

        System.out.println("n2 sayısını gir: ");
        int n2 = input.nextInt();
        int ebob = 1;
        int ekok =1;

        for(int k = n1; k>=1; k--) {
            if(n1%k==0 && n2%k==0) {
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }
        for(int j=1; j<=n1*n2; j++) {
            if(j%n1==0 && j%n2==0) {
                System.out.println(j);
                break;
            }
        }

    }
}
