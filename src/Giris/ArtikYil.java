package Giris;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Yil gir: " );
        yil = input.nextInt();

       if(yil%4==0 && yil%100!=0) {
           System.out.println("artık");
       }
       else if(yil%400==0) {
           System.out.println("artık");
       }
       else {
           System.out.println("artık değil");
       }
    }
}
