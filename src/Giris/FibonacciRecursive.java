package Giris;
import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println("Fibonacci serisi:");

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); //f(4)->f(3)->f(2)->f(1)+f(0)+f(1) +f(2) + f(3) ->
        }
    }
}
