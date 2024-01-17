package Giris;
import java.util.Scanner;

public class RecursivePattern {

    static void desen(int num) {
        System.out.print(num + " ");

        if (num <= 0) {
            return;
        } else {
            desen(num - 5);
        }

        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int num = inp.nextInt();
        desen(num);
    }
}

