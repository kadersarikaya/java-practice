package Giris;
import java.util.Scanner;
public class KDV_Hesabi {
    public static void main(String[] args) {
        double moneyAmount, KDV, priceWithoutKDV, priceWithKDV;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money amount");
        moneyAmount = input.nextDouble();
        KDV = moneyAmount>0 && moneyAmount<1000 ? moneyAmount*0.18 : moneyAmount*0.08;
        priceWithoutKDV = moneyAmount + KDV;
        priceWithKDV = moneyAmount - KDV;
        System.out.println("KDV, KDV'Lİ, KDV'SİZ " + "\n" + KDV +"\n" + priceWithKDV +"\n" + priceWithoutKDV );
    }
}
