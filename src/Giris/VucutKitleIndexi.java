package Giris;
import java.util.Scanner;
public class VucutKitleIndexi {
    public static void main(String[] args) {
        double boy, kg, vki;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu girin");
        kg = input.nextDouble();
        System.out.println("Lütfen boyunuzu girin");
        boy = input.nextDouble();
        vki = kg/(boy*boy);
        System.out.println("Vücut Kitle Indeksiniz: " + vki);
    }
}
