package Giris;
import java.util.Scanner;
public class Palindrom {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while(temp!=0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp/=10;
        }

        if(number == reverseNumber) {
            System.out.println("Palindrom");
            return true;
        } else {
            System.out.println("Palindrom değil");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Numara gir");
        int num = girdi.nextInt();
        isPalindrom(num);
    }
}
