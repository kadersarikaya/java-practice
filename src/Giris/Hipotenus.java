package Giris;
import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("a kenarını gir: ");
        a = input.nextInt();
        System.out.println("b kenarını gir: ");
        b= input.nextInt();
        c = Math.sqrt((a*a )+ (b*b));
        System.out.println("Hipotenüs: " + c);
        System.out.println("Çevresi " + a + b + c);
        System.out.println("Alanı " + (a*b/2));
    }
}
