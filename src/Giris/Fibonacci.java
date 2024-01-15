package Giris;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println("Fibonacci serisi:");

        int a = 0, b = 1;
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;
        }

        scanner.close();
    }
}

