package Giris;
import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("sayi gir");
        num = input.nextInt();

        for(int i=0; i<=num; i++) {
            for(int j =0;j<(num-i); j++){
                System.out.print(" ");
            }
            for(int k= 1; k<=(2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
