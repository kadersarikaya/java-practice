package Giris;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double elmaKg, armutKg, domatesKg, muzKg, patlicanKg, total;
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?");
        armutKg = input.nextDouble();
        System.out.print("Elma Kaç Kilo ?");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ?");
        domatesKg = input.nextDouble();
        System.out.print("Muz Kaç Kilo ?");
        muzKg = input.nextDouble();
        System.out.print("Patlican Kaç Kilo ?");
        patlicanKg = input.nextDouble();
        total = armut*armutKg + elma*elmaKg + domates*domatesKg + muz*muzKg + patlican*patlicanKg;
        System.out.print("Total :" + total);
    }

}
